// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartRepositoryResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The queried repositories.</p>
     */
    @NameInMap("Repositories")
    public java.util.List<ListChartRepositoryResponseBodyRepositories> repositories;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AB62FB8-6873-4032-8515-4578D27523B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListChartRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartRepositoryResponseBody self = new ListChartRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChartRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChartRepositoryResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartRepositoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartRepositoryResponseBody setRepositories(java.util.List<ListChartRepositoryResponseBodyRepositories> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<ListChartRepositoryResponseBodyRepositories> getRepositories() {
        return this.repositories;
    }

    public ListChartRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChartRepositoryResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListChartRepositoryResponseBodyRepositories extends TeaModel {
        /**
         * <p>The time when the repository was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1571926644000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the repository was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1571930329000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The ID of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crcr-gpsu7b8chmxk****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>repo1</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        /**
         * <p>The status of the repository. Valid values:</p>
         * <ul>
         * <li><code>NORMAL</code>: The repository is normal.</li>
         * <li><code>DELETING</code>: The repository is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("RepoStatus")
        public String repoStatus;

        /**
         * <p>The type of the repository. Valid values:</p>
         * <ul>
         * <li><code>PRIVATE</code>: a private repository</li>
         * <li><code>PUBLIC</code>: a public repository</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("RepoType")
        public String repoType;

        /**
         * <p>The ID of the resource group to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2ikd5rxxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The summary about the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListChartRepositoryResponseBodyRepositories build(java.util.Map<String, ?> map) throws Exception {
            ListChartRepositoryResponseBodyRepositories self = new ListChartRepositoryResponseBodyRepositories();
            return TeaModel.build(map, self);
        }

        public ListChartRepositoryResponseBodyRepositories setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListChartRepositoryResponseBodyRepositories setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChartRepositoryResponseBodyRepositories setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }
        public String getRepoStatus() {
            return this.repoStatus;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListChartRepositoryResponseBodyRepositories setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListChartRepositoryResponseBodyRepositories setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
