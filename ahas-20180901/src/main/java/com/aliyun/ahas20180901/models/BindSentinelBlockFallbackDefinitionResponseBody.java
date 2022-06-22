// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BindSentinelBlockFallbackDefinitionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindSentinelBlockFallbackDefinitionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BindSentinelBlockFallbackDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSentinelBlockFallbackDefinitionResponseBody self = new BindSentinelBlockFallbackDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSentinelBlockFallbackDefinitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindSentinelBlockFallbackDefinitionResponseBody setData(BindSentinelBlockFallbackDefinitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindSentinelBlockFallbackDefinitionResponseBodyData getData() {
        return this.data;
    }

    public BindSentinelBlockFallbackDefinitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindSentinelBlockFallbackDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindSentinelBlockFallbackDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindSentinelBlockFallbackDefinitionResponseBodyData extends TeaModel {
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

        public static BindSentinelBlockFallbackDefinitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindSentinelBlockFallbackDefinitionResponseBodyData self = new BindSentinelBlockFallbackDefinitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindSentinelBlockFallbackDefinitionResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public BindSentinelBlockFallbackDefinitionResponseBodyData setFallbackBehavior(java.util.Map<String, ?> fallbackBehavior) {
            this.fallbackBehavior = fallbackBehavior;
            return this;
        }
        public java.util.Map<String, ?> getFallbackBehavior() {
            return this.fallbackBehavior;
        }

        public BindSentinelBlockFallbackDefinitionResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BindSentinelBlockFallbackDefinitionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BindSentinelBlockFallbackDefinitionResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public BindSentinelBlockFallbackDefinitionResponseBodyData setResourceClassification(Integer resourceClassification) {
            this.resourceClassification = resourceClassification;
            return this;
        }
        public Integer getResourceClassification() {
            return this.resourceClassification;
        }

        public BindSentinelBlockFallbackDefinitionResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
