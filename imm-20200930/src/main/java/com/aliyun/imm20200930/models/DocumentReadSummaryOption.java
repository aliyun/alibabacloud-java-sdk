// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentReadSummaryOption extends TeaModel {
    /**
     * <p>Specifies whether to generate a summary for each chapter. This setting applies only if the service can identify chapters.</p>
     * <p><strong>Default value</strong>: <code>false</code>.</p>
     */
    @NameInMap("ChapterSummarize")
    public Boolean chapterSummarize;

    @NameInMap("ChapterSummarizeOption")
    public DocumentChapterSummarizeOption chapterSummarizeOption;

    /**
     * <p>Specifies whether to generate a summary for the entire document.</p>
     * <p><strong>Default value</strong>: <code>false</code>.</p>
     */
    @NameInMap("Summarize")
    public Boolean summarize;

    public static DocumentReadSummaryOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentReadSummaryOption self = new DocumentReadSummaryOption();
        return TeaModel.build(map, self);
    }

    public DocumentReadSummaryOption setChapterSummarize(Boolean chapterSummarize) {
        this.chapterSummarize = chapterSummarize;
        return this;
    }
    public Boolean getChapterSummarize() {
        return this.chapterSummarize;
    }

    public DocumentReadSummaryOption setChapterSummarizeOption(DocumentChapterSummarizeOption chapterSummarizeOption) {
        this.chapterSummarizeOption = chapterSummarizeOption;
        return this;
    }
    public DocumentChapterSummarizeOption getChapterSummarizeOption() {
        return this.chapterSummarizeOption;
    }

    public DocumentReadSummaryOption setSummarize(Boolean summarize) {
        this.summarize = summarize;
        return this;
    }
    public Boolean getSummarize() {
        return this.summarize;
    }

}
