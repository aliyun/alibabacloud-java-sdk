// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GetIqsUsageResult extends TeaModel {
    @NameInMap("records")
    public java.util.List<GetIqsUsageResultRecords> records;

    public static GetIqsUsageResult build(java.util.Map<String, ?> map) throws Exception {
        GetIqsUsageResult self = new GetIqsUsageResult();
        return TeaModel.build(map, self);
    }

    public GetIqsUsageResult setRecords(java.util.List<GetIqsUsageResultRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GetIqsUsageResultRecords> getRecords() {
        return this.records;
    }

    public static class GetIqsUsageResultRecords extends TeaModel {
        @NameInMap("api")
        public String api;

        @NameInMap("billingQps")
        public Integer billingQps;

        @NameInMap("date")
        public String date;

        @NameInMap("engineType")
        public String engineType;

        @NameInMap("failedCalls")
        public Integer failedCalls;

        @NameInMap("ladderType")
        public String ladderType;

        @NameInMap("mainAccountId")
        public String mainAccountId;

        @NameInMap("subAccountId")
        public String subAccountId;

        @NameInMap("successCalls")
        public Integer successCalls;

        @NameInMap("totalCalls")
        public Integer totalCalls;

        @NameInMap("valueAddedAdvanced")
        public Integer valueAddedAdvanced;

        @NameInMap("valueAddedSummary")
        public Integer valueAddedSummary;

        public static GetIqsUsageResultRecords build(java.util.Map<String, ?> map) throws Exception {
            GetIqsUsageResultRecords self = new GetIqsUsageResultRecords();
            return TeaModel.build(map, self);
        }

        public GetIqsUsageResultRecords setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public GetIqsUsageResultRecords setBillingQps(Integer billingQps) {
            this.billingQps = billingQps;
            return this;
        }
        public Integer getBillingQps() {
            return this.billingQps;
        }

        public GetIqsUsageResultRecords setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetIqsUsageResultRecords setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetIqsUsageResultRecords setFailedCalls(Integer failedCalls) {
            this.failedCalls = failedCalls;
            return this;
        }
        public Integer getFailedCalls() {
            return this.failedCalls;
        }

        public GetIqsUsageResultRecords setLadderType(String ladderType) {
            this.ladderType = ladderType;
            return this;
        }
        public String getLadderType() {
            return this.ladderType;
        }

        public GetIqsUsageResultRecords setMainAccountId(String mainAccountId) {
            this.mainAccountId = mainAccountId;
            return this;
        }
        public String getMainAccountId() {
            return this.mainAccountId;
        }

        public GetIqsUsageResultRecords setSubAccountId(String subAccountId) {
            this.subAccountId = subAccountId;
            return this;
        }
        public String getSubAccountId() {
            return this.subAccountId;
        }

        public GetIqsUsageResultRecords setSuccessCalls(Integer successCalls) {
            this.successCalls = successCalls;
            return this;
        }
        public Integer getSuccessCalls() {
            return this.successCalls;
        }

        public GetIqsUsageResultRecords setTotalCalls(Integer totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Integer getTotalCalls() {
            return this.totalCalls;
        }

        public GetIqsUsageResultRecords setValueAddedAdvanced(Integer valueAddedAdvanced) {
            this.valueAddedAdvanced = valueAddedAdvanced;
            return this;
        }
        public Integer getValueAddedAdvanced() {
            return this.valueAddedAdvanced;
        }

        public GetIqsUsageResultRecords setValueAddedSummary(Integer valueAddedSummary) {
            this.valueAddedSummary = valueAddedSummary;
            return this;
        }
        public Integer getValueAddedSummary() {
            return this.valueAddedSummary;
        }

    }

}
