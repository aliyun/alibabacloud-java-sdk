// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepositoryResponseBody extends TeaModel {
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
     * <p>The information about the repositories.</p>
     */
    @NameInMap("Repositories")
    public java.util.List<ListRepositoryResponseBodyRepositories> repositories;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5241C090-DA69-4B0F-8E3F-2F24FDE1110E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the queried image repositories.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryResponseBody self = new ListRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepositoryResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepositoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryResponseBody setRepositories(java.util.List<ListRepositoryResponseBodyRepositories> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<ListRepositoryResponseBodyRepositories> getRepositories() {
        return this.repositories;
    }

    public ListRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepositoryResponseBodyRepositories extends TeaModel {
        /**
         * <p>The time when the repository was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1564153576000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the Container Registry instance to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcv****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the repository was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1564153576000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The type of the repository building. Valid values:</p>
         * <ul>
         * <li><code>AUTO</code>: The repository is automatically built.</li>
         * <li><code>MANUAL</code>: The repository is manually built.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("RepoBuildType")
        public String repoBuildType;

        /**
         * <p>The ID of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-03cuozrsqhkw****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        /**
         * <p>The status of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("RepoStatus")
        public String repoStatus;

        /**
         * <p>The type of the repository. Valid values:</p>
         * <ul>
         * <li><code>PUBLIC</code></li>
         * <li><code>PRIVATE</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("RepoType")
        public String repoType;

        /**
         * <p>The ID of the resource group to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4n5kzyfxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The summary of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test OK</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Indicates whether the feature of image tag immutability is enabled for the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TagImmutability")
        public Boolean tagImmutability;

        public static ListRepositoryResponseBodyRepositories build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryResponseBodyRepositories self = new ListRepositoryResponseBodyRepositories();
            return TeaModel.build(map, self);
        }

        public ListRepositoryResponseBodyRepositories setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRepositoryResponseBodyRepositories setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRepositoryResponseBodyRepositories setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListRepositoryResponseBodyRepositories setRepoBuildType(String repoBuildType) {
            this.repoBuildType = repoBuildType;
            return this;
        }
        public String getRepoBuildType() {
            return this.repoBuildType;
        }

        public ListRepositoryResponseBodyRepositories setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListRepositoryResponseBodyRepositories setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListRepositoryResponseBodyRepositories setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public ListRepositoryResponseBodyRepositories setRepoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }
        public String getRepoStatus() {
            return this.repoStatus;
        }

        public ListRepositoryResponseBodyRepositories setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListRepositoryResponseBodyRepositories setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListRepositoryResponseBodyRepositories setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListRepositoryResponseBodyRepositories setTagImmutability(Boolean tagImmutability) {
            this.tagImmutability = tagImmutability;
            return this;
        }
        public Boolean getTagImmutability() {
            return this.tagImmutability;
        }

    }

}
