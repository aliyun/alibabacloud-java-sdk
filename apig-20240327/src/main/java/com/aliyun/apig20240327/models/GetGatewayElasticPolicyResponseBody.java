// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayElasticPolicyResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetGatewayElasticPolicyResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
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
         * <p>The O&amp;M end time in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The O&amp;M start time in the HH:mm format.</p>
         * 
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
         * <p>The O&amp;M end time in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The O&amp;M start time in the HH:mm format.</p>
         * 
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
         * <p>The O&amp;M end time in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The O&amp;M start time in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The number of replicas.</p>
         * 
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
        /**
         * <p>The time periods during which AutoHPA scale-out is prohibited.</p>
         */
        @NameInMap("disableScaleTimePolicyList")
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyDisableScaleTimePolicyList> disableScaleTimePolicyList;

        /**
         * <p>Indicates whether elastic scaling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("elasticEnabled")
        public Boolean elasticEnabled;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoHPA</p>
         */
        @NameInMap("elasticType")
        public String elasticType;

        /**
         * <p>The time periods during which AutoHPA scale-out is allowed.</p>
         */
        @NameInMap("enableScaleTimePolicyList")
        public java.util.List<GetGatewayElasticPolicyResponseBodyDataElasticPolicyEnableScaleTimePolicyList> enableScaleTimePolicyList;

        /**
         * <p>The load alert threshold switch for AutoHPA.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("loadWarningThreshold")
        public Boolean loadWarningThreshold;

        /**
         * <p>The maximum number of replicas for AutoHPA.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxUnits")
        public Integer maxUnits;

        /**
         * <p>The list of CronHPA scheduled policies. Each entry includes units (number of replicas), startTime, and endTime.</p>
         */
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
        /**
         * <p>The elastic policy configuration, deserialized from the elastic_config JSON field in the database.</p>
         */
        @NameInMap("elasticPolicy")
        public GetGatewayElasticPolicyResponseBodyDataElasticPolicy elasticPolicy;

        /**
         * <p>The KubeOne AutoScaleStrategy instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("elasticStrategyId")
        public String elasticStrategyId;

        /**
         * <p>The elastic policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>CronHPA</p>
         */
        @NameInMap("elasticType")
        public String elasticType;

        /**
         * <p>The gateway ID.</p>
         * 
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
