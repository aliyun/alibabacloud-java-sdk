// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEngineNamespacesResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListEngineNamespacesResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned instances.</p>
     */
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
        /**
         * <p>The quota value.</p>
         */
        @NameInMap("ConfigCount")
        public Integer configCount;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The description of the namespace.</p>
         */
        @NameInMap("NamespaceDesc")
        public String namespaceDesc;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("NamespaceShowName")
        public String namespaceShowName;

        /**
         * <p>The quota.</p>
         */
        @NameInMap("Quota")
        public Integer quota;

        /**
         * <p>The number of active services.</p>
         */
        @NameInMap("ServiceCount")
        public String serviceCount;

        /**
         * <p>The source from which the namespace was created.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of the namespace. Valid values:</p>
         * <br>
         * <p>*   `0`: global configuration</p>
         * <p>*   `1`: default namespace</p>
         * <p>*   `2`: custom namespace</p>
         */
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

        public ListEngineNamespacesResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
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
