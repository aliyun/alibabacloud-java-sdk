// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleUpdateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelProtectionModuleUpdateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelProtectionModuleUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleUpdateResponseBody self = new SentinelProtectionModuleUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleUpdateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelProtectionModuleUpdateResponseBody setData(SentinelProtectionModuleUpdateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelProtectionModuleUpdateResponseBodyData getData() {
        return this.data;
    }

    public SentinelProtectionModuleUpdateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelProtectionModuleUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelProtectionModuleUpdateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelProtectionModuleUpdateResponseBodyData extends TeaModel {
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

        public static SentinelProtectionModuleUpdateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelProtectionModuleUpdateResponseBodyData self = new SentinelProtectionModuleUpdateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelProtectionModuleUpdateResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelProtectionModuleUpdateResponseBodyData setFallbackId(Long fallbackId) {
            this.fallbackId = fallbackId;
            return this;
        }
        public Long getFallbackId() {
            return this.fallbackId;
        }

        public SentinelProtectionModuleUpdateResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelProtectionModuleUpdateResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelProtectionModuleUpdateResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelProtectionModuleUpdateResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public SentinelProtectionModuleUpdateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
