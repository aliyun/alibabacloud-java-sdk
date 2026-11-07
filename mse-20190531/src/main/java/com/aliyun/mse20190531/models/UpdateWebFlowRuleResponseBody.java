// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateWebFlowRuleResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UpdateWebFlowRuleResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54973C90-F379-4372-9AA5-053A3F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1XXXX@54e1f42f37cXXXX</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of additional requests allowed for burst requests. The effect is equivalent to the maximum number of tokens for the token bucket algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Burst")
        public Integer burst;

        /**
         * <p>The flow control method. Valid values:</p>
         * <ul>
         * <li><p>0: fast failure</p>
         * </li>
         * <li><p>2: wait in queue</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><p>true (enabled)</p>
         * </li>
         * <li><p>false (disabled)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The timeout period for queuing when the ControlBehavior parameter is set to 2. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        /**
         * <p>The threshold type. Valid values:</p>
         * <ul>
         * <li>1: number of requests</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MetricType")
        public Integer metricType;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The parameter description item, which is a JSON string containing the following key-value pairs:</p>
         * <ul>
         * <li><p>parseStrategy: the parameter property (0: client IP address. 1: remote host. 2: header. 3: URL parameter)</p>
         * </li>
         * <li><p>fieldName: the header name or URL parameter name. You must specify this key only if parseStrategy is set to 2 or 3</p>
         * </li>
         * <li><p>matchStrategy: the method to match the property value. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched. Valid values: 0 (exact match), 2 (regular expression match), and 3 (substring match)</p>
         * </li>
         * <li><p>pattern: the match string. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fieldName&quot;:&quot;testKey&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;testValue&quot;}</p>
         */
        @NameInMap("ParamItem")
        public String paramItem;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource mode. Valid values:</p>
         * <ul>
         * <li>0: resource name mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReourceMode")
        public Integer reourceMode;

        /**
         * <p>The interface resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>/flow</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The length of the time window. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        /**
         * <p>The threshold.</p>
         * 
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
