// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartRepositoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("Repositories")
    public java.util.List<ListChartRepositoryResponseBodyRepositories> repositories;

    public static ListChartRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartRepositoryResponseBody self = new ListChartRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChartRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChartRepositoryResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChartRepositoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartRepositoryResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListChartRepositoryResponseBody setRepositories(java.util.List<ListChartRepositoryResponseBodyRepositories> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<ListChartRepositoryResponseBodyRepositories> getRepositories() {
        return this.repositories;
    }

    public static class ListChartRepositoryResponseBodyRepositories extends TeaModel {
        @NameInMap("Summary")
        public String summary;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RepoType")
        public String repoType;

        @NameInMap("RepoStatus")
        public String repoStatus;

        @NameInMap("RepoName")
        public String repoName;

        public static ListChartRepositoryResponseBodyRepositories build(java.util.Map<String, ?> map) throws Exception {
            ListChartRepositoryResponseBodyRepositories self = new ListChartRepositoryResponseBodyRepositories();
            return TeaModel.build(map, self);
        }

        public ListChartRepositoryResponseBodyRepositories setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
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

        public ListChartRepositoryResponseBodyRepositories setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public ListChartRepositoryResponseBodyRepositories setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }
        public String getRepoStatus() {
            return this.repoStatus;
        }

        public ListChartRepositoryResponseBodyRepositories setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

    }

}
