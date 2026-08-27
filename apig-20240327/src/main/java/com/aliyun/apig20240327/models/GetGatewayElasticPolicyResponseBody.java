// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayElasticPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetGatewayElasticPolicyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B7F02714-182D-55BC-AF0B-F454364445E4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayElasticPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayElasticPolicyResponseBody self = new GetGatewayElasticPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayElasticPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayElasticPolicyResponseBody setData(GetGatewayElasticPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayElasticPolicyResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayElasticPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayElasticPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList self = new GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList();
            return TeaModel.build(map, self);
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>09:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList self = new GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList();
            return TeaModel.build(map, self);
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("units")
        public Long units;

        public static GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList self = new GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList();
            return TeaModel.build(map, self);
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList setUnits(Long units) {
            this.units = units;
            return this;
        }
        public Long getUnits() {
            return this.units;
        }

    }

    public static class GetGatewayElasticPolicyResponseBodyDataElasticPolicy extends TeaModel {
        @NameInMap("disableScaleTimePolicyList")
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList> disableScaleTimePolicyList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("elasticEnabled")
        public Boolean elasticEnabled;

        /**
         * <strong>example:</strong>
         * <p>AutoHPA</p>
         */
        @NameInMap("elasticType")
        public String elasticType;

        @NameInMap("enableScaleTimePolicyList")
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList> enableScaleTimePolicyList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("loadWarningThreshold")
        public Boolean loadWarningThreshold;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxUnits")
        public Integer maxUnits;

        @NameInMap("timePolicyList")
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList> timePolicyList;

        public static GetGatewayElasticPolicyResponseBodyDataElasticPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayElasticPolicyResponseBodyDataElasticPolicy self = new GetGatewayElasticPolicyResponseBodyDataElasticPolicy();
            return TeaModel.build(map, self);
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy setDisableScaleTimePolicyList(java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList> disableScaleTimePolicyList) {
            this.disableScaleTimePolicyList = disableScaleTimePolicyList;
            return this;
        }
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList> getDisableScaleTimePolicyList() {
            return this.disableScaleTimePolicyList;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy setElasticEnabled(Boolean elasticEnabled) {
            this.elasticEnabled = elasticEnabled;
            return this;
        }
        public Boolean getElasticEnabled() {
            return this.elasticEnabled;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy setEnableScaleTimePolicyList(java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList> enableScaleTimePolicyList) {
            this.enableScaleTimePolicyList = enableScaleTimePolicyList;
            return this;
        }
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList> getEnableScaleTimePolicyList() {
            return this.enableScaleTimePolicyList;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy setLoadWarningThreshold(Boolean loadWarningThreshold) {
            this.loadWarningThreshold = loadWarningThreshold;
            return this;
        }
        public Boolean getLoadWarningThreshold() {
            return this.loadWarningThreshold;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy setMaxUnits(Integer maxUnits) {
            this.maxUnits = maxUnits;
            return this;
        }
        public Integer getMaxUnits() {
            return this.maxUnits;
        }

        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy setTimePolicyList(java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList> timePolicyList) {
            this.timePolicyList = timePolicyList;
            return this;
        }
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyTimePolicyList> getTimePolicyList() {
            return this.timePolicyList;
        }

    }

    public static class GetGatewayElasticPolicyResponseBodyData extends TeaModel {
        @NameInMap("elasticPolicy")
        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy elasticPolicy;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("elasticStrategyId")
        public String elasticStrategyId;

        /**
         * <strong>example:</strong>
         * <p>CronHPA</p>
         */
        @NameInMap("elasticType")
        public String elasticType;

        /**
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        public static GetGatewayElasticPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayElasticPolicyResponseBodyData self = new GetGatewayElasticPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayElasticPolicyResponseBodyData setElasticPolicy(GetGatewayElasticPolicyResponseBodyDataElasticPolicy elasticPolicy) {
            this.elasticPolicy = elasticPolicy;
            return this;
        }
        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy getElasticPolicy() {
            return this.elasticPolicy;
        }

        public GetGatewayElasticPolicyResponseBodyData setElasticStrategyId(String elasticStrategyId) {
            this.elasticStrategyId = elasticStrategyId;
            return this;
        }
        public String getElasticStrategyId() {
            return this.elasticStrategyId;
        }

        public GetGatewayElasticPolicyResponseBodyData setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public GetGatewayElasticPolicyResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

    }

}
