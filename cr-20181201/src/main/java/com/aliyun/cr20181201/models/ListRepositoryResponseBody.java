// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepositoryResponseBody extends TeaModel {
    @NameInMap("Repositories")
    public java.util.List<ListRepositoryResponseBodyRepositories> repositories;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("Code")
    public String code;

    public static ListRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryResponseBody self = new ListRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryResponseBody setRepositories(java.util.List<ListRepositoryResponseBodyRepositories> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<ListRepositoryResponseBodyRepositories> getRepositories() {
        return this.repositories;
    }

    public ListRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepositoryResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListRepositoryResponseBodyRepositories extends TeaModel {
        @NameInMap("Summary")
        public String summary;

        @NameInMap("RepoBuildType")
        public String repoBuildType;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        @NameInMap("TagImmutability")
        public Boolean tagImmutability;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RepoType")
        public String repoType;

        @NameInMap("RepoStatus")
        public String repoStatus;

        @NameInMap("RepoName")
        public String repoName;

        public static ListRepositoryResponseBodyRepositories build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryResponseBodyRepositories self = new ListRepositoryResponseBodyRepositories();
            return TeaModel.build(map, self);
        }

        public ListRepositoryResponseBodyRepositories setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListRepositoryResponseBodyRepositories setRepoBuildType(String repoBuildType) {
            this.repoBuildType = repoBuildType;
            return this;
        }
        public String getRepoBuildType() {
            return this.repoBuildType;
        }

        public ListRepositoryResponseBodyRepositories setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListRepositoryResponseBodyRepositories setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListRepositoryResponseBodyRepositories setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRepositoryResponseBodyRepositories setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public ListRepositoryResponseBodyRepositories setTagImmutability(Boolean tagImmutability) {
            this.tagImmutability = tagImmutability;
            return this;
        }
        public Boolean getTagImmutability() {
            return this.tagImmutability;
        }

        public ListRepositoryResponseBodyRepositories setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRepositoryResponseBodyRepositories setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListRepositoryResponseBodyRepositories setRepoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }
        public String getRepoStatus() {
            return this.repoStatus;
        }

        public ListRepositoryResponseBodyRepositories setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

    }

}
