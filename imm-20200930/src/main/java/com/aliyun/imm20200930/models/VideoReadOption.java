// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReadOption extends TeaModel {
    @NameInMap("Keyword")
    public VideoReadKeywordOption keyword;

    @NameInMap("PPT")
    public VideoReadPPTOption PPT;

    @NameInMap("Question")
    public VideoReadQuestionOption question;

    @NameInMap("Summary")
    public VideoReadSummaryOption summary;

    public static VideoReadOption build(java.util.Map<String, ?> map) throws Exception {
        VideoReadOption self = new VideoReadOption();
        return TeaModel.build(map, self);
    }

    public VideoReadOption setKeyword(VideoReadKeywordOption keyword) {
        this.keyword = keyword;
        return this;
    }
    public VideoReadKeywordOption getKeyword() {
        return this.keyword;
    }

    public VideoReadOption setPPT(VideoReadPPTOption PPT) {
        this.PPT = PPT;
        return this;
    }
    public VideoReadPPTOption getPPT() {
        return this.PPT;
    }

    public VideoReadOption setQuestion(VideoReadQuestionOption question) {
        this.question = question;
        return this;
    }
    public VideoReadQuestionOption getQuestion() {
        return this.question;
    }

    public VideoReadOption setSummary(VideoReadSummaryOption summary) {
        this.summary = summary;
        return this;
    }
    public VideoReadSummaryOption getSummary() {
        return this.summary;
    }

}
