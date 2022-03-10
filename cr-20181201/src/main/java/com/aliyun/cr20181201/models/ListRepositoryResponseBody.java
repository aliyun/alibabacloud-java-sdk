// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepositoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Repositories")
    public java.util.List<ListRepositoryResponseBodyRepositories> repositories;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("RepoBuildType")
        public String repoBuildType;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        @NameInMap("RepoStatus")
        public String repoStatus;

        @NameInMap("RepoType")
        public String repoType;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Summary")
        public String summary;

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
