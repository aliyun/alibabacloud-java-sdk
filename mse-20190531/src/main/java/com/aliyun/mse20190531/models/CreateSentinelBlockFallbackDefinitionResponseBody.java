// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateSentinelBlockFallbackDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateSentinelBlockFallbackDefinitionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ADDD8AB7-8D1C-4697-A83E-410D2607****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateSentinelBlockFallbackDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelBlockFallbackDefinitionResponseBody self = new CreateSentinelBlockFallbackDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setData(CreateSentinelBlockFallbackDefinitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSentinelBlockFallbackDefinitionResponseBodyData getData() {
        return this.data;
    }

    public CreateSentinelBlockFallbackDefinitionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public CreateSentinelBlockFallbackDefinitionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateSentinelBlockFallbackDefinitionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;webRespStatusCode&quot;:429,&quot;webRespMessage&quot;:&quot;test&quot;,&quot;webFallbackMode&quot;:0,&quot;webRespContentType&quot;:0}</p>
         */
        @NameInMap("FallbackBehavior")
        public String fallbackBehavior;

        /**
         * <strong>example:</strong>
         * <p>34726</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceClassification")
        public Integer resourceClassification;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
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

        public CreateSentinelBlockFallbackDefinitionResponseBodyData setFallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = fallbackBehavior;
            return this;
        }
        public String getFallbackBehavior() {
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
