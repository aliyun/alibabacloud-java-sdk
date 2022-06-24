// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelProtectionModuleNewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelProtectionModuleNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleNewResponseBody self = new SentinelProtectionModuleNewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelProtectionModuleNewResponseBody setData(SentinelProtectionModuleNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelProtectionModuleNewResponseBodyData getData() {
        return this.data;
    }

    public SentinelProtectionModuleNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelProtectionModuleNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelProtectionModuleNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelProtectionModuleNewResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("fallbackId")
        public Long fallbackId;

        @NameInMap("id")
        public Long id;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("ruleId")
        public Long ruleId;

        @NameInMap("userId")
        public String userId;

        public static SentinelProtectionModuleNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelProtectionModuleNewResponseBodyData self = new SentinelProtectionModuleNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelProtectionModuleNewResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelProtectionModuleNewResponseBodyData setFallbackId(Long fallbackId) {
            this.fallbackId = fallbackId;
            return this;
        }
        public Long getFallbackId() {
            return this.fallbackId;
        }

        public SentinelProtectionModuleNewResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelProtectionModuleNewResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelProtectionModuleNewResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelProtectionModuleNewResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public SentinelProtectionModuleNewResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
