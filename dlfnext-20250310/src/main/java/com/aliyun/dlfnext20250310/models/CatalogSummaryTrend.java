// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CatalogSummaryTrend extends TeaModel {
    /**
     * <p>API visit count trends</p>
     */
    @NameInMap("apiVisitCount")
    public java.util.List<DateSummary> apiVisitCount;

    /**
     * <p>Table count trends</p>
     */
    @NameInMap("throughput")
    public java.util.List<DateSummary> throughput;

    /**
     * <p>Historical total file count</p>
     */
    @NameInMap("totalFileCount")
    public java.util.List<DateSummary> totalFileCount;

    /**
     * <p>Database count trends</p>
     */
    @NameInMap("totalFileSizeInBytes")
    public java.util.List<DateSummary> totalFileSizeInBytes;

    /**
     * <p>Latest snapshot file count</p>
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
