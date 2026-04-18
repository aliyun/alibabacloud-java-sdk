// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryMetricDistributionResponseBody extends TeaModel {
    @NameInMap("DistributionList")
    public java.util.List<QueryHistoryMetricDistributionResponseBodyDistributionList> distributionList;

    /**
     * <strong>example:</strong>
     * <p>2F2BF549-CBD9-1FED-9ABB-086B62D7B293</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryHistoryMetricDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryMetricDistributionResponseBody self = new QueryHistoryMetricDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHistoryMetricDistributionResponseBody setDistributionList(java.util.List<QueryHistoryMetricDistributionResponseBodyDistributionList> distributionList) {
        this.distributionList = distributionList;
        return this;
    }
    public java.util.List<QueryHistoryMetricDistributionResponseBodyDistributionList> getDistributionList() {
        return this.distributionList;
    }

    public QueryHistoryMetricDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHistoryMetricDistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryHistoryMetricDistributionResponseBodyDistributionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>2F2BF549-CBD9-1FED-9ABB-086B62D7B293</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Max")
        public Float max;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Min")
        public Float min;

        public static QueryHistoryMetricDistributionResponseBodyDistributionList build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryMetricDistributionResponseBodyDistributionList self = new QueryHistoryMetricDistributionResponseBodyDistributionList();
            return TeaModel.build(map, self);
        }

        public QueryHistoryMetricDistributionResponseBodyDistributionList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryHistoryMetricDistributionResponseBodyDistributionList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryHistoryMetricDistributionResponseBodyDistributionList setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

        public QueryHistoryMetricDistributionResponseBodyDistributionList setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

    }

}
