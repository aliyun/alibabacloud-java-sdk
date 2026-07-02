// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentReadSummaryOption extends TeaModel {
    /**
     * <p>Specifies whether to extract the chapter-level summary of the article.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ChapterSummarize")
    public Boolean chapterSummarize;

    /**
     * <p>The chapter-level summary options for the article.</p>
     */
    @NameInMap("ChapterSummarizeOption")
    public DocumentChapterSummarizeOption chapterSummarizeOption;

    /**
     * <p>Specifies whether to extract the article summary.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
