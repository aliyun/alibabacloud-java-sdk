// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentParseOption extends TeaModel {
    /**
     * <p>Document parsing keyword extraction options</p>
     */
    @NameInMap("Keyword")
    public DocumentParseKeywordOption keyword;

    /**
     * <p>Document parsing guidance options</p>
     */
    @NameInMap("Narrator")
    public DocumentParseNarratorOption narrator;

    /**
     * <p>Document parsing question generation options</p>
     */
    @NameInMap("Question")
    public DocumentParseQuestionOption question;

    /**
     * <p>Document parsing summary options</p>
     */
    @NameInMap("Summary")
    public DocumentParseSummaryOption summary;

    public static DocumentParseOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseOption self = new DocumentParseOption();
        return TeaModel.build(map, self);
    }

    public DocumentParseOption setKeyword(DocumentParseKeywordOption keyword) {
        this.keyword = keyword;
        return this;
    }
    public DocumentParseKeywordOption getKeyword() {
        return this.keyword;
    }

    public DocumentParseOption setNarrator(DocumentParseNarratorOption narrator) {
        this.narrator = narrator;
        return this;
    }
    public DocumentParseNarratorOption getNarrator() {
        return this.narrator;
    }

    public DocumentParseOption setQuestion(DocumentParseQuestionOption question) {
        this.question = question;
        return this;
    }
    public DocumentParseQuestionOption getQuestion() {
        return this.question;
    }

    public DocumentParseOption setSummary(DocumentParseSummaryOption summary) {
        this.summary = summary;
        return this;
    }
    public DocumentParseSummaryOption getSummary() {
        return this.summary;
    }

}
