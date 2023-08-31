// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListAcrImageRepositoriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Repositories")
    public java.util.List<ListAcrImageRepositoriesResponseBodyRepositories> repositories;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAcrImageRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAcrImageRepositoriesResponseBody self = new ListAcrImageRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAcrImageRepositoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAcrImageRepositoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAcrImageRepositoriesResponseBody setRepositories(java.util.List<ListAcrImageRepositoriesResponseBodyRepositories> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<ListAcrImageRepositoriesResponseBodyRepositories> getRepositories() {
        return this.repositories;
    }

    public ListAcrImageRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAcrImageRepositoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAcrImageRepositoriesResponseBodyRepositories extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        public static ListAcrImageRepositoriesResponseBodyRepositories build(java.util.Map<String, ?> map) throws Exception {
            ListAcrImageRepositoriesResponseBodyRepositories self = new ListAcrImageRepositoriesResponseBodyRepositories();
            return TeaModel.build(map, self);
        }

        public ListAcrImageRepositoriesResponseBodyRepositories setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAcrImageRepositoriesResponseBodyRepositories setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAcrImageRepositoriesResponseBodyRepositories setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListAcrImageRepositoriesResponseBodyRepositories setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

    }

}
