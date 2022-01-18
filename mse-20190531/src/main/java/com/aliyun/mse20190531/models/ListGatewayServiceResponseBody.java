// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListGatewayServiceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServiceResponseBody self = new ListGatewayServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayServiceResponseBody setData(ListGatewayServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayServiceResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayServiceResponseBodyDataResultVersions extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListGatewayServiceResponseBodyDataResultVersions build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultVersions self = new ListGatewayServiceResponseBodyDataResultVersions();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResult extends TeaModel {
        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        @NameInMap("MetaInfo")
        public String metaInfo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ServiceNameInRegistry")
        public String serviceNameInRegistry;

        @NameInMap("ServicePort")
        public Long servicePort;

        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Versions")
        public java.util.List<ListGatewayServiceResponseBodyDataResultVersions> versions;

        public static ListGatewayServiceResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResult self = new ListGatewayServiceResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayServiceResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayServiceResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayServiceResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayServiceResponseBodyDataResult setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayServiceResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayServiceResponseBodyDataResult setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ListGatewayServiceResponseBodyDataResult setMetaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public String getMetaInfo() {
            return this.metaInfo;
        }

        public ListGatewayServiceResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayServiceResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListGatewayServiceResponseBodyDataResult setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public ListGatewayServiceResponseBodyDataResult setServicePort(Long servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Long getServicePort() {
            return this.servicePort;
        }

        public ListGatewayServiceResponseBodyDataResult setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public ListGatewayServiceResponseBodyDataResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListGatewayServiceResponseBodyDataResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListGatewayServiceResponseBodyDataResult setVersions(java.util.List<ListGatewayServiceResponseBodyDataResultVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListGatewayServiceResponseBodyDataResultVersions> getVersions() {
            return this.versions;
        }

    }

    public static class ListGatewayServiceResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListGatewayServiceResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyData self = new ListGatewayServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayServiceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayServiceResponseBodyData setResult(java.util.List<ListGatewayServiceResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayServiceResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayServiceResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
