// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSentinelBlockFallbackDefinitionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSentinelBlockFallbackDefinitionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4E9FDCFE-0738-493B-B801-82BDFBCB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSentinelBlockFallbackDefinitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelBlockFallbackDefinitionsResponseBody self = new ListSentinelBlockFallbackDefinitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSentinelBlockFallbackDefinitionsResponseBody setData(java.util.List<ListSentinelBlockFallbackDefinitionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSentinelBlockFallbackDefinitionsResponseBodyData> getData() {
        return this.data;
    }

    public ListSentinelBlockFallbackDefinitionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSentinelBlockFallbackDefinitionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSentinelBlockFallbackDefinitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSentinelBlockFallbackDefinitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSentinelBlockFallbackDefinitionsResponseBodyData extends TeaModel {
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
        public java.util.Map<String, ?> fallbackBehavior;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>defaultFallback</p>
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
        public String resourceClassification;

        /**
         * <strong>example:</strong>
         * <p>{&quot;/params/{hot}&quot;:[1]}</p>
         */
        @NameInMap("TargetMap")
        public java.util.Map<String, ?> targetMap;

        public static ListSentinelBlockFallbackDefinitionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSentinelBlockFallbackDefinitionsResponseBodyData self = new ListSentinelBlockFallbackDefinitionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSentinelBlockFallbackDefinitionsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSentinelBlockFallbackDefinitionsResponseBodyData setFallbackBehavior(java.util.Map<String, ?> fallbackBehavior) {
            this.fallbackBehavior = fallbackBehavior;
            return this;
        }
        public java.util.Map<String, ?> getFallbackBehavior() {
            return this.fallbackBehavior;
        }

        public ListSentinelBlockFallbackDefinitionsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSentinelBlockFallbackDefinitionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSentinelBlockFallbackDefinitionsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListSentinelBlockFallbackDefinitionsResponseBodyData setResourceClassification(String resourceClassification) {
            this.resourceClassification = resourceClassification;
            return this;
        }
        public String getResourceClassification() {
            return this.resourceClassification;
        }

        public ListSentinelBlockFallbackDefinitionsResponseBodyData setTargetMap(java.util.Map<String, ?> targetMap) {
            this.targetMap = targetMap;
            return this;
        }
        public java.util.Map<String, ?> getTargetMap() {
            return this.targetMap;
        }

    }

}
