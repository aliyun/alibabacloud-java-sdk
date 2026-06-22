// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ChapterSummary extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Summary")
    public java.util.List<Summary> summary;

    @NameInMap("TimeRange")
    public java.util.List<Long> timeRange;

    @NameInMap("Title")
    public String title;

    @NameInMap("TitleID")
    public String titleID;

    public static ChapterSummary build(java.util.Map<String, ?> map) throws Exception {
        ChapterSummary self = new ChapterSummary();
        return TeaModel.build(map, self);
    }

    public ChapterSummary setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ChapterSummary setSummary(java.util.List<Summary> summary) {
        this.summary = summary;
        return this;
    }
    public java.util.List<Summary> getSummary() {
        return this.summary;
    }

    public ChapterSummary setTimeRange(java.util.List<Long> timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    public ChapterSummary setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ChapterSummary setTitleID(String titleID) {
        this.titleID = titleID;
        return this;
    }
    public String getTitleID() {
        return this.titleID;
    }

}
