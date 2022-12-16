// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayServiceResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public DeleteGatewayServiceResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static DeleteGatewayServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayServiceResponseBody self = new DeleteGatewayServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGatewayServiceResponseBody setData(DeleteGatewayServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGatewayServiceResponseBodyData getData() {
        return this.data;
    }

    public DeleteGatewayServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteGatewayServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGatewayServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGatewayServiceResponseBodyData extends TeaModel {
        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The time when the service was created.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The time when the domain name was last modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The name of the group.
        @NameInMap("GroupName")
        public String groupName;

        // The ID of the service.
        @NameInMap("Id")
        public Long id;

        // IP
        @NameInMap("Ips")
        public java.util.List<String> ips;

        // The basic information about the service.
        @NameInMap("MetaInfo")
        public String metaInfo;

        // The name of the service.
        @NameInMap("Name")
        public String name;

        // The namespace in which the service resides.
        @NameInMap("Namespace")
        public String namespace;

        // The name of the service registered with the service registry.
        @NameInMap("ServiceNameInRegistry")
        public String serviceNameInRegistry;

        // The source ID of the service.
        @NameInMap("SourceId")
        public Long sourceId;

        // The source type of the service.
        @NameInMap("SourceType")
        public String sourceType;

        public static DeleteGatewayServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGatewayServiceResponseBodyData self = new DeleteGatewayServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGatewayServiceResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public DeleteGatewayServiceResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteGatewayServiceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteGatewayServiceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteGatewayServiceResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DeleteGatewayServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteGatewayServiceResponseBodyData setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public DeleteGatewayServiceResponseBodyData setMetaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public String getMetaInfo() {
            return this.metaInfo;
        }

        public DeleteGatewayServiceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteGatewayServiceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DeleteGatewayServiceResponseBodyData setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public DeleteGatewayServiceResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public DeleteGatewayServiceResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
