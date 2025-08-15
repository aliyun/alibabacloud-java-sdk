// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetGovernanceMetricsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetGovernanceMetricsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGovernanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceMetricsResponseBody self = new GetGovernanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGovernanceMetricsResponseBody setData(GetGovernanceMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGovernanceMetricsResponseBodyData getData() {
        return this.data;
    }

    public GetGovernanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGovernanceMetricsResponseBodyDataGovernanceMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;trailName&quot;: &quot;trail-test&quot;,
         *     &quot;homeRegion&quot;: &quot;cn-hangzhou&quot;,
         *     &quot;trailRegion&quot;: &quot;All&quot;,
         *     &quot;trailStatus&quot;: &quot;Enable&quot;,
         *     &quot;eventRW&quot;: &quot;All&quot;,
         *     &quot;isOrganizationTrail&quot;: false,
         *     &quot;ossDeliveryStatus&quot;: &quot;normal&quot;,
         *     &quot;deliveryObjectLifeCycle&quot;: &quot;999&quot;,
         *     &quot;ossBucketLifeCycle&quot;: &quot;999&quot;,
         *     &quot;trailTotal&quot;: 100
         * }</p>
         */
        @NameInMap("ColumnsSchema")
        public String columnsSchema;

        /**
         * <strong>example:</strong>
         * <p>actiontrail_storage_audit_log</p>
         */
        @NameInMap("GovernanceItem")
        public String governanceItem;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("GovernanceScore")
        public String governanceScore;

        public static GetGovernanceMetricsResponseBodyDataGovernanceMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceMetricsResponseBodyDataGovernanceMetrics self = new GetGovernanceMetricsResponseBodyDataGovernanceMetrics();
            return TeaModel.build(map, self);
        }

        public GetGovernanceMetricsResponseBodyDataGovernanceMetrics setColumnsSchema(String columnsSchema) {
            this.columnsSchema = columnsSchema;
            return this;
        }
        public String getColumnsSchema() {
            return this.columnsSchema;
        }

        public GetGovernanceMetricsResponseBodyDataGovernanceMetrics setGovernanceItem(String governanceItem) {
            this.governanceItem = governanceItem;
            return this;
        }
        public String getGovernanceItem() {
            return this.governanceItem;
        }

        public GetGovernanceMetricsResponseBodyDataGovernanceMetrics setGovernanceScore(String governanceScore) {
            this.governanceScore = governanceScore;
            return this;
        }
        public String getGovernanceScore() {
            return this.governanceScore;
        }

    }

    public static class GetGovernanceMetricsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>195622768501****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("GovernanceMetrics")
        public java.util.List<GetGovernanceMetricsResponseBodyDataGovernanceMetrics> governanceMetrics;

        public static GetGovernanceMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGovernanceMetricsResponseBodyData self = new GetGovernanceMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGovernanceMetricsResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetGovernanceMetricsResponseBodyData setGovernanceMetrics(java.util.List<GetGovernanceMetricsResponseBodyDataGovernanceMetrics> governanceMetrics) {
            this.governanceMetrics = governanceMetrics;
            return this;
        }
        public java.util.List<GetGovernanceMetricsResponseBodyDataGovernanceMetrics> getGovernanceMetrics() {
            return this.governanceMetrics;
        }

    }

}
