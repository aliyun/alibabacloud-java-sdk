// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartNamespaceResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The namespaces.</p>
     */
    @NameInMap("Namespaces")
    public java.util.List<ListChartNamespaceResponseBodyNamespaces> namespaces;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

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
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListChartNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartNamespaceResponseBody self = new ListChartNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChartNamespaceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChartNamespaceResponseBody setNamespaces(java.util.List<ListChartNamespaceResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListChartNamespaceResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public ListChartNamespaceResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartNamespaceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChartNamespaceResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListChartNamespaceResponseBodyNamespaces extends TeaModel {
        /**
         * <p>Indicates whether a repository was automatically created when a chart is pushed to the namespace.</p>
         */
        @NameInMap("AutoCreateRepo")
        public Boolean autoCreateRepo;

        /**
         * <p>The default repository type. Valid values:</p>
         * <br>
         * <p>*   `PUBLIC`: a public repository</p>
         * <p>*   `PRIVATE`: a private repository</p>
         */
        @NameInMap("DefaultRepoType")
        public String defaultRepoType;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The status of the namespace. Valid values:</p>
         * <br>
         * <p>*   `NORMAL`: The namespace is normal.</p>
         * <p>*   `DELETING`: The namespace is being deleted.</p>
         */
        @NameInMap("NamespaceStatus")
        public String namespaceStatus;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListChartNamespaceResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListChartNamespaceResponseBodyNamespaces self = new ListChartNamespaceResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListChartNamespaceResponseBodyNamespaces setAutoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }
        public Boolean getAutoCreateRepo() {
            return this.autoCreateRepo;
        }

        public ListChartNamespaceResponseBodyNamespaces setDefaultRepoType(String defaultRepoType) {
            this.defaultRepoType = defaultRepoType;
            return this;
        }
        public String getDefaultRepoType() {
            return this.defaultRepoType;
        }

        public ListChartNamespaceResponseBodyNamespaces setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChartNamespaceResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListChartNamespaceResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListChartNamespaceResponseBodyNamespaces setNamespaceStatus(String namespaceStatus) {
            this.namespaceStatus = namespaceStatus;
            return this;
        }
        public String getNamespaceStatus() {
            return this.namespaceStatus;
        }

        public ListChartNamespaceResponseBodyNamespaces setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
