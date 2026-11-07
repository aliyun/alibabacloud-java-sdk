// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateFlowRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data of the node.</p>
     */
    @NameInMap("Data")
    public UpdateFlowRuleResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52BA6DA6-A702-4362-A32F-DFF79655****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowRuleResponseBody self = new UpdateFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFlowRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateFlowRuleResponseBody setData(UpdateFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateFlowRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFlowRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateFlowRuleResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hpn9ac29kz@e31a4b871******</p>
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
         * <p>The throttling effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        /**
         * <p>Indicates whether the rule is enabled.</p>
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
         * <p>12</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The source application of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Spring-cloud-a</p>
         */
        @NameInMap("LimitApp")
        public String limitApp;

        /**
         * <p>The timeout period for queuing when the ControlBehavior parameter is set to 2. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The interface resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>/c</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The throttling threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static UpdateFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowRuleResponseBodyData self = new UpdateFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateFlowRuleResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateFlowRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateFlowRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public UpdateFlowRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateFlowRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateFlowRuleResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public UpdateFlowRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public UpdateFlowRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateFlowRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public UpdateFlowRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
