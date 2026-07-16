// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoAnalysisOption extends TeaModel {
    /**
     * <p>Specifies whether to retrieve the chapter-based summary of the video.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ChapterSummary")
    public Boolean chapterSummary;

    /**
     * <p>Specifies whether to retrieve keywords.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Keyword")
    public Boolean keyword;

    /**
     * <p>Specifies whether to retrieve the PPT from the video. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PPT")
    public Boolean PPT;

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
     * <p>false</p>
     */
    @NameInMap("Summary")
    public Boolean summary;

    /**
     * <p>Specifies whether to retrieve the dialogue in the video. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Transcript")
    public Boolean transcript;

    /**
     * <p>Specifies whether to retrieve the segmented summary generated from the dialogue in the video. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranscriptChapterSummary")
    public Boolean transcriptChapterSummary;

    /**
     * <p>Specifies whether to retrieve the summary generated from the dialogue in the video. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranscriptSummary")
    public Boolean transcriptSummary;

    public static GetVideoAnalysisOption build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAnalysisOption self = new GetVideoAnalysisOption();
        return TeaModel.build(map, self);
    }

    public GetVideoAnalysisOption setChapterSummary(Boolean chapterSummary) {
        this.chapterSummary = chapterSummary;
        return this;
    }
    public Boolean getChapterSummary() {
        return this.chapterSummary;
    }

    public GetVideoAnalysisOption setKeyword(Boolean keyword) {
        this.keyword = keyword;
        return this;
    }
    public Boolean getKeyword() {
        return this.keyword;
    }

    public GetVideoAnalysisOption setPPT(Boolean PPT) {
        this.PPT = PPT;
        return this;
    }
    public Boolean getPPT() {
        return this.PPT;
    }

    public GetVideoAnalysisOption setQuestion(Boolean question) {
        this.question = question;
        return this;
    }
    public Boolean getQuestion() {
        return this.question;
    }

    public GetVideoAnalysisOption setSummary(Boolean summary) {
        this.summary = summary;
        return this;
    }
    public Boolean getSummary() {
        return this.summary;
    }

    public GetVideoAnalysisOption setTranscript(Boolean transcript) {
        this.transcript = transcript;
        return this;
    }
    public Boolean getTranscript() {
        return this.transcript;
    }

    public GetVideoAnalysisOption setTranscriptChapterSummary(Boolean transcriptChapterSummary) {
        this.transcriptChapterSummary = transcriptChapterSummary;
        return this;
    }
    public Boolean getTranscriptChapterSummary() {
        return this.transcriptChapterSummary;
    }

    public GetVideoAnalysisOption setTranscriptSummary(Boolean transcriptSummary) {
        this.transcriptSummary = transcriptSummary;
        return this;
    }
    public Boolean getTranscriptSummary() {
        return this.transcriptSummary;
    }

}
