// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayElasticPolicyRequest extends TeaModel {
    @NameInMap("elasticPolicy")
    public UpdateGatewayElasticPolicyRequestElasticPolicy elasticPolicy;

    public static UpdateGatewayElasticPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayElasticPolicyRequest self = new UpdateGatewayElasticPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayElasticPolicyRequest setElasticPolicy(UpdateGatewayElasticPolicyRequestElasticPolicy elasticPolicy) {
        this.elasticPolicy = elasticPolicy;
        return this;
    }
    public UpdateGatewayElasticPolicyRequestElasticPolicy getElasticPolicy() {
        return this.elasticPolicy;
    }

    public static class UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList extends TeaModel {
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

        public static UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList self = new UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList extends TeaModel {
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
        public Integer units;

        public static UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList self = new UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList setUnits(Integer units) {
            this.units = units;
            return this;
        }
        public Integer getUnits() {
            return this.units;
        }

    }

    public static class UpdateGatewayElasticPolicyRequestElasticPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("elasticEnabled")
        public Boolean elasticEnabled;

        /**
         * <strong>example:</strong>
         * <p>CronHPA</p>
         */
        @NameInMap("elasticType")
        public String elasticType;

        @NameInMap("enableScaleTimePolicyList")
        public java.util.List<UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList> enableScaleTimePolicyList;

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
        public java.util.List<UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList> timePolicyList;

        public static UpdateGatewayElasticPolicyRequestElasticPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayElasticPolicyRequestElasticPolicy self = new UpdateGatewayElasticPolicyRequestElasticPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicy setElasticEnabled(Boolean elasticEnabled) {
            this.elasticEnabled = elasticEnabled;
            return this;
        }
        public Boolean getElasticEnabled() {
            return this.elasticEnabled;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicy setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicy setEnableScaleTimePolicyList(java.util.List<UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList> enableScaleTimePolicyList) {
            this.enableScaleTimePolicyList = enableScaleTimePolicyList;
            return this;
        }
        public java.util.List<UpdateGatewayElasticPolicyRequestElasticPolicyEnableScaleTimePolicyList> getEnableScaleTimePolicyList() {
            return this.enableScaleTimePolicyList;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicy setLoadWarningThreshold(Boolean loadWarningThreshold) {
            this.loadWarningThreshold = loadWarningThreshold;
            return this;
        }
        public Boolean getLoadWarningThreshold() {
            return this.loadWarningThreshold;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicy setMaxUnits(Integer maxUnits) {
            this.maxUnits = maxUnits;
            return this;
        }
        public Integer getMaxUnits() {
            return this.maxUnits;
        }

        public UpdateGatewayElasticPolicyRequestElasticPolicy setTimePolicyList(java.util.List<UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList> timePolicyList) {
            this.timePolicyList = timePolicyList;
            return this;
        }
        public java.util.List<UpdateGatewayElasticPolicyRequestElasticPolicyTimePolicyList> getTimePolicyList() {
            return this.timePolicyList;
        }

    }

}
