// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class PullServicesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public java.util.List<PullServicesResponseBodyData> data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PullServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PullServicesResponseBody self = new PullServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public PullServicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PullServicesResponseBody setData(java.util.List<PullServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PullServicesResponseBodyData> getData() {
        return this.data;
    }

    public PullServicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PullServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PullServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PullServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PullServicesResponseBodyDataServices extends TeaModel {
        /**
         * <p>The ID of the service source.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The type of the service source.</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The alias of the namespace.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static PullServicesResponseBodyDataServices build(java.util.Map<String, ?> map) throws Exception {
            PullServicesResponseBodyDataServices self = new PullServicesResponseBodyDataServices();
            return TeaModel.build(map, self);
        }

        public PullServicesResponseBodyDataServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public PullServicesResponseBodyDataServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PullServicesResponseBodyDataServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PullServicesResponseBodyDataServices setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public PullServicesResponseBodyDataServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class PullServicesResponseBodyData extends TeaModel {
        /**
         * <p>The information about services.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>code</p>
         */
        @NameInMap("NamespaceShowName")
        public String namespaceShowName;

        /**
         * <p>The data structure.</p>
         */
        @NameInMap("Services")
        public java.util.List<PullServicesResponseBodyDataServices> services;

        public static PullServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PullServicesResponseBodyData self = new PullServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PullServicesResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public PullServicesResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PullServicesResponseBodyData setNamespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        public PullServicesResponseBodyData setServices(java.util.List<PullServicesResponseBodyDataServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<PullServicesResponseBodyDataServices> getServices() {
            return this.services;
        }

    }

}
