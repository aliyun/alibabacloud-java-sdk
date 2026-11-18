// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GetIqsUsageResult extends TeaModel {
    /**
     * <p>The daily call volume records.</p>
     */
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
        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>UnifiedSearch</p>
         */
        @NameInMap("api")
        public String api;

        /**
         * <p>The queries per second (QPS) for tiered billing.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("billingQps")
        public Integer billingQps;

        /**
         * <p>The metering date in the YYYYMMDD format.</p>
         * 
         * <strong>example:</strong>
         * <p>20250716</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The search engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>Generic</p>
         */
        @NameInMap("engineType")
        public String engineType;

        /**
         * <p>The number of failed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failedCalls")
        public Integer failedCalls;

        /**
         * <p>The matched metering tier. Valid values: 1001, 1002, 1003, and 1004.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ladderType")
        public String ladderType;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>138608930******0</p>
         */
        @NameInMap("mainAccountId")
        public String mainAccountId;

        /**
         * <p>The sub-account that initiates the call (RAM user or API key identifier).</p>
         * 
         * <strong>example:</strong>
         * <p>2193843763***9272</p>
         */
        @NameInMap("subAccountId")
        public String subAccountId;

        /**
         * <p>The number of successful calls.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("successCalls")
        public Integer successCalls;

        /**
         * <p>The total number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("totalBillStatCalls")
        public Integer totalBillStatCalls;

        /**
         * <p>The total number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("totalCalls")
        public Integer totalCalls;

        /**
         * <p>The value-added package usage for calling enhanced APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("valueAddedAdvanced")
        public Integer valueAddedAdvanced;

        /**
         * <p>The number of value-added package calls used for the summarization feature.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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

        public GetIqsUsageResultRecords setTotalBillStatCalls(Integer totalBillStatCalls) {
            this.totalBillStatCalls = totalBillStatCalls;
            return this;
        }
        public Integer getTotalBillStatCalls() {
            return this.totalBillStatCalls;
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
