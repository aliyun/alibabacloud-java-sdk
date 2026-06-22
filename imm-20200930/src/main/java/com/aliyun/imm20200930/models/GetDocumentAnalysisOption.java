// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDocumentAnalysisOption extends TeaModel {
    /**
     * <p>Specifies whether to generate summaries for each chapter. Set to <code>true</code> to enable this feature. Use <code>ChapterSummaryOption</code> to configure detailed options. Defaults to <code>false</code>.</p>
     */
    @NameInMap("ChapterSummary")
    public Boolean chapterSummary;

    @NameInMap("ChapterSummaryOption")
    public DocumentChapterSummarizeOption chapterSummaryOption;

    /**
     * <p>Specifies whether to analyze each image within the document. Set to <code>true</code> to enable this feature. Defaults to <code>false</code>.</p>
     */
    @NameInMap("Images")
    public Boolean images;

    /**
     * <p>Specifies whether to extract keywords from the document. Set to <code>true</code> to enable this feature. Defaults to <code>false</code>.</p>
     */
    @NameInMap("Keyword")
    public Boolean keyword;

    /**
     * <p>Specifies whether to analyze the document layout. Set to <code>true</code> to enable this feature. Defaults to <code>false</code>.</p>
     */
    @NameInMap("Layouts")
    public Boolean layouts;

    /**
     * <p>Specifies whether to identify the narrator in the document. Set to <code>true</code> to enable this feature. Defaults to <code>false</code>.</p>
     */
    @NameInMap("Narrator")
    public Boolean narrator;

    /**
     * <p>Specifies whether to generate questions based on the document content. Set to <code>true</code> to enable this feature. Defaults to <code>false</code>.</p>
     */
    @NameInMap("Question")
    public Boolean question;

    /**
     * <p>Specifies whether to generate a summary for the document. Set to <code>true</code> to enable this feature. Defaults to <code>false</code>.</p>
     */
    @NameInMap("Summary")
    public Boolean summary;

    public static GetDocumentAnalysisOption build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentAnalysisOption self = new GetDocumentAnalysisOption();
        return TeaModel.build(map, self);
    }

    public GetDocumentAnalysisOption setChapterSummary(Boolean chapterSummary) {
        this.chapterSummary = chapterSummary;
        return this;
    }
    public Boolean getChapterSummary() {
        return this.chapterSummary;
    }

    public GetDocumentAnalysisOption setChapterSummaryOption(DocumentChapterSummarizeOption chapterSummaryOption) {
        this.chapterSummaryOption = chapterSummaryOption;
        return this;
    }
    public DocumentChapterSummarizeOption getChapterSummaryOption() {
        return this.chapterSummaryOption;
    }

    public GetDocumentAnalysisOption setImages(Boolean images) {
        this.images = images;
        return this;
    }
    public Boolean getImages() {
        return this.images;
    }

    public GetDocumentAnalysisOption setKeyword(Boolean keyword) {
        this.keyword = keyword;
        return this;
    }
    public Boolean getKeyword() {
        return this.keyword;
    }

    public GetDocumentAnalysisOption setLayouts(Boolean layouts) {
        this.layouts = layouts;
        return this;
    }
    public Boolean getLayouts() {
        return this.layouts;
    }

    public GetDocumentAnalysisOption setNarrator(Boolean narrator) {
        this.narrator = narrator;
        return this;
    }
    public Boolean getNarrator() {
        return this.narrator;
    }

    public GetDocumentAnalysisOption setQuestion(Boolean question) {
        this.question = question;
        return this;
    }
    public Boolean getQuestion() {
        return this.question;
    }

    public GetDocumentAnalysisOption setSummary(Boolean summary) {
        this.summary = summary;
        return this;
    }
    public Boolean getSummary() {
        return this.summary;
    }

}
