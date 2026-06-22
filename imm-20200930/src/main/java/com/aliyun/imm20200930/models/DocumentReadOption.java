// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentReadOption extends TeaModel {
    /**
     * <p>Configuration for extracting keywords from the document.</p>
     */
    @NameInMap("Keyword")
    public DocumentReadKeywordOption keyword;

    /**
     * <p>Configuration for the text-to-speech (TTS) narrator.</p>
     */
    @NameInMap("Narrator")
    public DocumentReadNarratorOption narrator;

    /**
     * <p>Configuration for the question-answering (Q\&amp;A) feature, which answers questions based on the document\&quot;s content.</p>
     */
    @NameInMap("Question")
    public DocumentReadQuestionOption question;

    /**
     * <p>Configuration for generating a document summary.</p>
     */
    @NameInMap("Summary")
    public DocumentReadSummaryOption summary;

    public static DocumentReadOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentReadOption self = new DocumentReadOption();
        return TeaModel.build(map, self);
    }

    public DocumentReadOption setKeyword(DocumentReadKeywordOption keyword) {
        this.keyword = keyword;
        return this;
    }
    public DocumentReadKeywordOption getKeyword() {
        return this.keyword;
    }

    public DocumentReadOption setNarrator(DocumentReadNarratorOption narrator) {
        this.narrator = narrator;
        return this;
    }
    public DocumentReadNarratorOption getNarrator() {
        return this.narrator;
    }

    public DocumentReadOption setQuestion(DocumentReadQuestionOption question) {
        this.question = question;
        return this;
    }
    public DocumentReadQuestionOption getQuestion() {
        return this.question;
    }

    public DocumentReadOption setSummary(DocumentReadSummaryOption summary) {
        this.summary = summary;
        return this;
    }
    public DocumentReadSummaryOption getSummary() {
        return this.summary;
    }

}
