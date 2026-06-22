// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentChapterSummary extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ChapterSummary> data;

    @NameInMap("NextMarker")
    public Integer nextMarker;

    @NameInMap("Version")
    public String version;

    public static DocumentChapterSummary build(java.util.Map<String, ?> map) throws Exception {
        DocumentChapterSummary self = new DocumentChapterSummary();
        return TeaModel.build(map, self);
    }

    public DocumentChapterSummary setData(java.util.List<ChapterSummary> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ChapterSummary> getData() {
        return this.data;
    }

    public DocumentChapterSummary setNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public Integer getNextMarker() {
        return this.nextMarker;
    }

    public DocumentChapterSummary setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
