// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListNamespaceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The queried namespaces.</p>
     */
    @NameInMap("Namespaces")
    public java.util.List<ListNamespaceResponseBodyNamespaces> namespaces;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7E5FCA5-55ED-451C-9649-0BB2B93387D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the queried namespaces.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceResponseBody self = new ListNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNamespaceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListNamespaceResponseBody setNamespaces(java.util.List<ListNamespaceResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListNamespaceResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public ListNamespaceResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListNamespaceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespaceResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListNamespaceResponseBodyNamespaces extends TeaModel {
        /**
         * <p>Indicates whether the automatically creating repositories feature is enabled for the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoCreateRepo")
        public Boolean autoCreateRepo;

        @NameInMap("DefaultRepoConfiguration")
        public RepoConfiguration defaultRepoConfiguration;

        /**
         * <p>The default type of repositories in the namespace. Valid values:</p>
         * <ul>
         * <li><code>PUBLIC</code>: public repositories.</li>
         * <li><code>PRIVATE</code>: private repositories.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("DefaultRepoType")
        @Deprecated
        public String defaultRepoType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-94klsruryslx****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crn-tiw8t3f8i5lt****</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The status of the namespace. Valid values:</p>
         * <ul>
         * <li><code>NORMAL</code>: The namespace is normal.</li>
         * <li><code>DELETING</code>: The namespace is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("NamespaceStatus")
        public String namespaceStatus;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4n5kzyf2fbi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListNamespaceResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceResponseBodyNamespaces self = new ListNamespaceResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListNamespaceResponseBodyNamespaces setAutoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }
        public Boolean getAutoCreateRepo() {
            return this.autoCreateRepo;
        }

        public ListNamespaceResponseBodyNamespaces setDefaultRepoConfiguration(RepoConfiguration defaultRepoConfiguration) {
            this.defaultRepoConfiguration = defaultRepoConfiguration;
            return this;
        }
        public RepoConfiguration getDefaultRepoConfiguration() {
            return this.defaultRepoConfiguration;
        }

        @Deprecated
        public ListNamespaceResponseBodyNamespaces setDefaultRepoType(String defaultRepoType) {
            this.defaultRepoType = defaultRepoType;
            return this;
        }
        public String getDefaultRepoType() {
            return this.defaultRepoType;
        }

        public ListNamespaceResponseBodyNamespaces setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNamespaceResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListNamespaceResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListNamespaceResponseBodyNamespaces setNamespaceStatus(String namespaceStatus) {
            this.namespaceStatus = namespaceStatus;
            return this;
        }
        public String getNamespaceStatus() {
            return this.namespaceStatus;
        }

        public ListNamespaceResponseBodyNamespaces setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
