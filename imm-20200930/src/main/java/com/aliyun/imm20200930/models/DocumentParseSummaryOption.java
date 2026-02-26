// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentParseSummaryOption extends TeaModel {
    @NameInMap("ChapterSummarize")
    public Boolean chapterSummarize;

    @NameInMap("Summarize")
    public Boolean summarize;

    public static DocumentParseSummaryOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseSummaryOption self = new DocumentParseSummaryOption();
        return TeaModel.build(map, self);
    }

    public DocumentParseSummaryOption setChapterSummarize(Boolean chapterSummarize) {
        this.chapterSummarize = chapterSummarize;
        return this;
    }
    public Boolean getChapterSummarize() {
        return this.chapterSummarize;
    }

    public DocumentParseSummaryOption setSummarize(Boolean summarize) {
        this.summarize = summarize;
        return this;
    }
    public Boolean getSummarize() {
        return this.summarize;
    }

}
