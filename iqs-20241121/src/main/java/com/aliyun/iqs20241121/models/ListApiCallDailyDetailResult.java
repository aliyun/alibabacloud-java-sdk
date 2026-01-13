// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListApiCallDailyDetailResult extends TeaModel {
    @NameInMap("details")
    public java.util.List<ListApiCallDailyDetailResultDetails> details;

    public static ListApiCallDailyDetailResult build(java.util.Map<String, ?> map) throws Exception {
        ListApiCallDailyDetailResult self = new ListApiCallDailyDetailResult();
        return TeaModel.build(map, self);
    }

    public ListApiCallDailyDetailResult setDetails(java.util.List<ListApiCallDailyDetailResultDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<ListApiCallDailyDetailResultDetails> getDetails() {
        return this.details;
    }

    public static class ListApiCallDailyDetailResultDetails extends TeaModel {
        @NameInMap("apiName")
        public String apiName;

        @NameInMap("avgLatency")
        public Integer avgLatency;

        @NameInMap("billDate")
        public String billDate;

        @NameInMap("engineType")
        public String engineType;

        @NameInMap("failedCount")
        public Integer failedCount;

        @NameInMap("p90Latency")
        public Integer p90Latency;

        @NameInMap("p95Latency")
        public Integer p95Latency;

        @NameInMap("requestMaxQps")
        public Integer requestMaxQps;

        @NameInMap("subAccountId")
        public String subAccountId;

        @NameInMap("successCount")
        public Integer successCount;

        public static ListApiCallDailyDetailResultDetails build(java.util.Map<String, ?> map) throws Exception {
            ListApiCallDailyDetailResultDetails self = new ListApiCallDailyDetailResultDetails();
            return TeaModel.build(map, self);
        }

        public ListApiCallDailyDetailResultDetails setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListApiCallDailyDetailResultDetails setAvgLatency(Integer avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Integer getAvgLatency() {
            return this.avgLatency;
        }

        public ListApiCallDailyDetailResultDetails setBillDate(String billDate) {
            this.billDate = billDate;
            return this;
        }
        public String getBillDate() {
            return this.billDate;
        }

        public ListApiCallDailyDetailResultDetails setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListApiCallDailyDetailResultDetails setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public ListApiCallDailyDetailResultDetails setP90Latency(Integer p90Latency) {
            this.p90Latency = p90Latency;
            return this;
        }
        public Integer getP90Latency() {
            return this.p90Latency;
        }

        public ListApiCallDailyDetailResultDetails setP95Latency(Integer p95Latency) {
            this.p95Latency = p95Latency;
            return this;
        }
        public Integer getP95Latency() {
            return this.p95Latency;
        }

        public ListApiCallDailyDetailResultDetails setRequestMaxQps(Integer requestMaxQps) {
            this.requestMaxQps = requestMaxQps;
            return this;
        }
        public Integer getRequestMaxQps() {
            return this.requestMaxQps;
        }

        public ListApiCallDailyDetailResultDetails setSubAccountId(String subAccountId) {
            this.subAccountId = subAccountId;
            return this;
        }
        public String getSubAccountId() {
            return this.subAccountId;
        }

        public ListApiCallDailyDetailResultDetails setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
