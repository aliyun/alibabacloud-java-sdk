// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateSentinelBlockFallbackDefinitionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSentinelBlockFallbackDefinitionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSentinelBlockFallbackDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelBlockFallbackDefinitionResponseBody self = new CreateSentinelBlockFallbackDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setData(CreateSentinelBlockFallbackDefinitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSentinelBlockFallbackDefinitionResponseBodyData getData() {
        return this.data;
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSentinelBlockFallbackDefinitionResponseBodyData extends TeaModel {
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

        public static CreateSentinelBlockFallbackDefinitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSentinelBlockFallbackDefinitionResponseBodyData self = new CreateSentinelBlockFallbackDefinitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setFallbackBehavior(java.util.Map<String, ?> fallbackBehavior) {
            this.fallbackBehavior = fallbackBehavior;
            return this;
        }
        public java.util.Map<String, ?> getFallbackBehavior() {
            return this.fallbackBehavior;
        }

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setResourceClassification(Integer resourceClassification) {
            this.resourceClassification = resourceClassification;
            return this;
        }
        public Integer getResourceClassification() {
            return this.resourceClassification;
        }

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
