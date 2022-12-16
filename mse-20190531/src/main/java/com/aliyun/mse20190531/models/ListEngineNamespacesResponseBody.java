// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEngineNamespacesResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public java.util.List<ListEngineNamespacesResponseBodyData> data;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpCode")
    public String httpCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEngineNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEngineNamespacesResponseBody self = new ListEngineNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEngineNamespacesResponseBody setData(java.util.List<ListEngineNamespacesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEngineNamespacesResponseBodyData> getData() {
        return this.data;
    }

    public ListEngineNamespacesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEngineNamespacesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListEngineNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEngineNamespacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEngineNamespacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEngineNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEngineNamespacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEngineNamespacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEngineNamespacesResponseBodyData extends TeaModel {
        // The number of configurations.
        @NameInMap("ConfigCount")
        public Integer configCount;

        // The name of the namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The description of the namespace.
        @NameInMap("NamespaceDesc")
        public String namespaceDesc;

        // The display name of the namespace.
        @NameInMap("NamespaceShowName")
        public String namespaceShowName;

        // The quota of configurations.
        @NameInMap("Quota")
        public Integer quota;

        // The number of active services.
        @NameInMap("ServiceCount")
        public String serviceCount;

        // The type of the namespace. Valid values:
        // - `0`: global configuration
        // - `1`: default namespace
        // - `2`: custom namespace
        @NameInMap("Type")
        public Integer type;

        public static ListEngineNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEngineNamespacesResponseBodyData self = new ListEngineNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEngineNamespacesResponseBodyData setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public ListEngineNamespacesResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListEngineNamespacesResponseBodyData setNamespaceDesc(String namespaceDesc) {
            this.namespaceDesc = namespaceDesc;
            return this;
        }
        public String getNamespaceDesc() {
            return this.namespaceDesc;
        }

        public ListEngineNamespacesResponseBodyData setNamespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        public ListEngineNamespacesResponseBodyData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public ListEngineNamespacesResponseBodyData setServiceCount(String serviceCount) {
            this.serviceCount = serviceCount;
            return this;
        }
        public String getServiceCount() {
            return this.serviceCount;
        }

        public ListEngineNamespacesResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
