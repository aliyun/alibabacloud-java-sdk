// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateWebFlowRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateWebFlowRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>54973C90-F379-4372-9AA5-053A3F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateWebFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFlowRuleResponseBody self = new UpdateWebFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWebFlowRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWebFlowRuleResponseBody setData(UpdateWebFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateWebFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateWebFlowRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWebFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWebFlowRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateWebFlowRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hkhon1XXXX@54e1f42f37cXXXX</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Burst")
        public Integer burst;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MetricType")
        public Integer metricType;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>{&quot;fieldName&quot;:&quot;testKey&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;testValue&quot;}</p>
         */
        @NameInMap("ParamItem")
        public String paramItem;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReourceMode")
        public Integer reourceMode;

        /**
         * <strong>example:</strong>
         * <p>/flow</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static UpdateWebFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWebFlowRuleResponseBodyData self = new UpdateWebFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWebFlowRuleResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateWebFlowRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateWebFlowRuleResponseBodyData setBurst(Integer burst) {
            this.burst = burst;
            return this;
        }
        public Integer getBurst() {
            return this.burst;
        }

        public UpdateWebFlowRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public UpdateWebFlowRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateWebFlowRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateWebFlowRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public UpdateWebFlowRuleResponseBodyData setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public UpdateWebFlowRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateWebFlowRuleResponseBodyData setParamItem(String paramItem) {
            this.paramItem = paramItem;
            return this;
        }
        public String getParamItem() {
            return this.paramItem;
        }

        public UpdateWebFlowRuleResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateWebFlowRuleResponseBodyData setReourceMode(Integer reourceMode) {
            this.reourceMode = reourceMode;
            return this;
        }
        public Integer getReourceMode() {
            return this.reourceMode;
        }

        public UpdateWebFlowRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public UpdateWebFlowRuleResponseBodyData setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public UpdateWebFlowRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
