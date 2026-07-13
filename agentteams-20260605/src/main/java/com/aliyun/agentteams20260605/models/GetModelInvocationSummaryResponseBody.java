// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetModelInvocationSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetModelInvocationSummaryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetModelInvocationSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelInvocationSummaryResponseBody self = new GetModelInvocationSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelInvocationSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetModelInvocationSummaryResponseBody setData(GetModelInvocationSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModelInvocationSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetModelInvocationSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetModelInvocationSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelInvocationSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelInvocationSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetModelInvocationSummaryResponseBodyDataProviderDistribution extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Percentage")
        public Double percentage;

        @NameInMap("ProviderName")
        public String providerName;

        public static GetModelInvocationSummaryResponseBodyDataProviderDistribution build(java.util.Map<String, ?> map) throws Exception {
            GetModelInvocationSummaryResponseBodyDataProviderDistribution self = new GetModelInvocationSummaryResponseBodyDataProviderDistribution();
            return TeaModel.build(map, self);
        }

        public GetModelInvocationSummaryResponseBodyDataProviderDistribution setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetModelInvocationSummaryResponseBodyDataProviderDistribution setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

        public GetModelInvocationSummaryResponseBodyDataProviderDistribution setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

    public static class GetModelInvocationSummaryResponseBodyData extends TeaModel {
        @NameInMap("CallFrequency")
        public Double callFrequency;

        @NameInMap("ProviderDistribution")
        public java.util.List<GetModelInvocationSummaryResponseBodyDataProviderDistribution> providerDistribution;

        @NameInMap("TodayCallCount")
        public Integer todayCallCount;

        @NameInMap("TodayChangeRate")
        public Double todayChangeRate;

        @NameInMap("WeekCallCount")
        public Integer weekCallCount;

        @NameInMap("WeekChangeRate")
        public Double weekChangeRate;

        public static GetModelInvocationSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelInvocationSummaryResponseBodyData self = new GetModelInvocationSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelInvocationSummaryResponseBodyData setCallFrequency(Double callFrequency) {
            this.callFrequency = callFrequency;
            return this;
        }
        public Double getCallFrequency() {
            return this.callFrequency;
        }

        public GetModelInvocationSummaryResponseBodyData setProviderDistribution(java.util.List<GetModelInvocationSummaryResponseBodyDataProviderDistribution> providerDistribution) {
            this.providerDistribution = providerDistribution;
            return this;
        }
        public java.util.List<GetModelInvocationSummaryResponseBodyDataProviderDistribution> getProviderDistribution() {
            return this.providerDistribution;
        }

        public GetModelInvocationSummaryResponseBodyData setTodayCallCount(Integer todayCallCount) {
            this.todayCallCount = todayCallCount;
            return this;
        }
        public Integer getTodayCallCount() {
            return this.todayCallCount;
        }

        public GetModelInvocationSummaryResponseBodyData setTodayChangeRate(Double todayChangeRate) {
            this.todayChangeRate = todayChangeRate;
            return this;
        }
        public Double getTodayChangeRate() {
            return this.todayChangeRate;
        }

        public GetModelInvocationSummaryResponseBodyData setWeekCallCount(Integer weekCallCount) {
            this.weekCallCount = weekCallCount;
            return this;
        }
        public Integer getWeekCallCount() {
            return this.weekCallCount;
        }

        public GetModelInvocationSummaryResponseBodyData setWeekChangeRate(Double weekChangeRate) {
            this.weekChangeRate = weekChangeRate;
            return this;
        }
        public Double getWeekChangeRate() {
            return this.weekChangeRate;
        }

    }

}
