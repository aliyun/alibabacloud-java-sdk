// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelBlockFallbackDefinitionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSentinelBlockFallbackDefinitionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSentinelBlockFallbackDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelBlockFallbackDefinitionResponseBody self = new UpdateSentinelBlockFallbackDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelBlockFallbackDefinitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSentinelBlockFallbackDefinitionResponseBody setData(UpdateSentinelBlockFallbackDefinitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSentinelBlockFallbackDefinitionResponseBodyData getData() {
        return this.data;
    }

    public UpdateSentinelBlockFallbackDefinitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSentinelBlockFallbackDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSentinelBlockFallbackDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSentinelBlockFallbackDefinitionResponseBodyData extends TeaModel {
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

        public static UpdateSentinelBlockFallbackDefinitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSentinelBlockFallbackDefinitionResponseBodyData self = new UpdateSentinelBlockFallbackDefinitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSentinelBlockFallbackDefinitionResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateSentinelBlockFallbackDefinitionResponseBodyData setFallbackBehavior(java.util.Map<String, ?> fallbackBehavior) {
            this.fallbackBehavior = fallbackBehavior;
            return this;
        }
        public java.util.Map<String, ?> getFallbackBehavior() {
            return this.fallbackBehavior;
        }

        public UpdateSentinelBlockFallbackDefinitionResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSentinelBlockFallbackDefinitionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSentinelBlockFallbackDefinitionResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateSentinelBlockFallbackDefinitionResponseBodyData setResourceClassification(Integer resourceClassification) {
            this.resourceClassification = resourceClassification;
            return this;
        }
        public Integer getResourceClassification() {
            return this.resourceClassification;
        }

        public UpdateSentinelBlockFallbackDefinitionResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
