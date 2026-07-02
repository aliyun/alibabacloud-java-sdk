// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDocumentAnalysisOption extends TeaModel {
    /**
     * <p>Specifies whether to retrieve chapter-by-chapter summaries of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ChapterSummary")
    public Boolean chapterSummary;

    /**
     * <p>The options for retrieving chapter-by-chapter summaries of the document.</p>
     */
    @NameInMap("ChapterSummaryOption")
    public DocumentChapterSummarizeOption chapterSummaryOption;

    /**
     * <p>Specifies whether to retrieve images extracted from the document, such as pictures, tables, and formulas.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Images")
    public Boolean images;

    /**
     * <p>Specifies whether to retrieve keywords.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Keyword")
    public Boolean keyword;

    /**
     * <p>Specifies whether to retrieve the layout.jsonl file.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Layouts")
    public Boolean layouts;

    /**
     * <p>Specifies whether to retrieve the document reading guide results.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Narrator")
    public Boolean narrator;

    /**
     * <p>Specifies whether to retrieve the generated questions and corresponding answers.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Question")
    public Boolean question;

    /**
     * <p>Specifies whether to retrieve the full-text summary.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
