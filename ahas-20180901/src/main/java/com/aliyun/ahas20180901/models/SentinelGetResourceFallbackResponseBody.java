// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetResourceFallbackResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGetResourceFallbackResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGetResourceFallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetResourceFallbackResponseBody self = new SentinelGetResourceFallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGetResourceFallbackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGetResourceFallbackResponseBody setData(SentinelGetResourceFallbackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGetResourceFallbackResponseBodyData getData() {
        return this.data;
    }

    public SentinelGetResourceFallbackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGetResourceFallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGetResourceFallbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGetResourceFallbackResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("FallbackBehavior")
        public java.util.Map<String, ?> fallbackBehavior;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ResourceClassification")
        public Integer resourceClassification;

        @NameInMap("UserId")
        public String userId;

        public static SentinelGetResourceFallbackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetResourceFallbackResponseBodyData self = new SentinelGetResourceFallbackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGetResourceFallbackResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGetResourceFallbackResponseBodyData setFallbackBehavior(java.util.Map<String, ?> fallbackBehavior) {
            this.fallbackBehavior = fallbackBehavior;
            return this;
        }
        public java.util.Map<String, ?> getFallbackBehavior() {
            return this.fallbackBehavior;
        }

        public SentinelGetResourceFallbackResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGetResourceFallbackResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SentinelGetResourceFallbackResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGetResourceFallbackResponseBodyData setResourceClassification(Integer resourceClassification) {
            this.resourceClassification = resourceClassification;
            return this;
        }
        public Integer getResourceClassification() {
            return this.resourceClassification;
        }

        public SentinelGetResourceFallbackResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
