// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CatalogSummaryTrend extends TeaModel {
    /**
     * <p>The trend of total metadata requests.</p>
     */
    @NameInMap("apiVisitCount")
    public java.util.List<DateSummary> apiVisitCount;

    /**
     * <p>The trend of file access count.</p>
     */
    @NameInMap("fileAccessCount")
    public java.util.List<DateSummary> fileAccessCount;

    /**
     * <p>The data access traffic trend.</p>
     */
    @NameInMap("throughput")
    public java.util.List<DateSummary> throughput;

    /**
     * <p>The trend of total file count.</p>
     */
    @NameInMap("totalFileCount")
    public java.util.List<DateSummary> totalFileCount;

    /**
     * <p>The trend of total storage capacity.</p>
     */
    @NameInMap("totalFileSizeInBytes")
    public java.util.List<DateSummary> totalFileSizeInBytes;

    /**
     * <p>The trend of total metadata object count.</p>
     */
    @NameInMap("totalMetaCount")
    public java.util.List<DateSummary> totalMetaCount;

    public static CatalogSummaryTrend build(java.util.Map<String, ?> map) throws Exception {
        CatalogSummaryTrend self = new CatalogSummaryTrend();
        return TeaModel.build(map, self);
    }

    public CatalogSummaryTrend setApiVisitCount(java.util.List<DateSummary> apiVisitCount) {
        this.apiVisitCount = apiVisitCount;
        return this;
    }
    public java.util.List<DateSummary> getApiVisitCount() {
        return this.apiVisitCount;
    }

    public CatalogSummaryTrend setFileAccessCount(java.util.List<DateSummary> fileAccessCount) {
        this.fileAccessCount = fileAccessCount;
        return this;
    }
    public java.util.List<DateSummary> getFileAccessCount() {
        return this.fileAccessCount;
    }

    public CatalogSummaryTrend setThroughput(java.util.List<DateSummary> throughput) {
        this.throughput = throughput;
        return this;
    }
    public java.util.List<DateSummary> getThroughput() {
        return this.throughput;
    }

    public CatalogSummaryTrend setTotalFileCount(java.util.List<DateSummary> totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
    public java.util.List<DateSummary> getTotalFileCount() {
        return this.totalFileCount;
    }

    public CatalogSummaryTrend setTotalFileSizeInBytes(java.util.List<DateSummary> totalFileSizeInBytes) {
        this.totalFileSizeInBytes = totalFileSizeInBytes;
        return this;
    }
    public java.util.List<DateSummary> getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

    public CatalogSummaryTrend setTotalMetaCount(java.util.List<DateSummary> totalMetaCount) {
        this.totalMetaCount = totalMetaCount;
        return this;
    }
    public java.util.List<DateSummary> getTotalMetaCount() {
        return this.totalMetaCount;
    }

}
