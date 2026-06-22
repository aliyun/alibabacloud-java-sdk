// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoAnalysisOption extends TeaModel {
    /**
     * <p>Specifies whether to generate a chapter summary for each segment of the video.</p>
     */
    @NameInMap("ChapterSummary")
    public Boolean chapterSummary;

    /**
     * <p>Specifies whether to extract relevant keywords from the video.</p>
     */
    @NameInMap("Keyword")
    public Boolean keyword;

    /**
     * <p>Specifies whether to generate a presentation (PPT) file based on the video analysis.</p>
     */
    @NameInMap("PPT")
    public Boolean PPT;

    /**
     * <p>Specifies whether to generate potential questions about the video.</p>
     */
    @NameInMap("Question")
    public Boolean question;

    /**
     * <p>Specifies whether to generate a concise video summary.</p>
     */
    @NameInMap("Summary")
    public Boolean summary;

    /**
     * <p>Specifies whether to transcribe the spoken audio in the video to text.</p>
     */
    @NameInMap("Transcript")
    public Boolean transcript;

    /**
     * <p>Specifies whether to generate a chapter-based summary from the video transcript.</p>
     */
    @NameInMap("TranscriptChapterSummary")
    public Boolean transcriptChapterSummary;

    /**
     * <p>Specifies whether to generate a summary of the video transcript.</p>
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
