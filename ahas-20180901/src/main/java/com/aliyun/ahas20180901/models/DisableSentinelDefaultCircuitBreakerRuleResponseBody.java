// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableSentinelDefaultCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableSentinelDefaultCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSentinelDefaultCircuitBreakerRuleResponseBody self = new DisableSentinelDefaultCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponseBody setData(DisableSentinelDefaultCircuitBreakerRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData getData() {
        return this.data;
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSentinelDefaultCircuitBreakerRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableSentinelDefaultCircuitBreakerRuleResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("count")
        public Float count;

        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        @NameInMap("limitApp")
        public String limitApp;

        @NameInMap("modifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("timeWindow")
        public Integer timeWindow;

        @NameInMap("userId")
        public String userId;

        public static DisableSentinelDefaultCircuitBreakerRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableSentinelDefaultCircuitBreakerRuleResponseBodyData self = new DisableSentinelDefaultCircuitBreakerRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public DisableSentinelDefaultCircuitBreakerRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
