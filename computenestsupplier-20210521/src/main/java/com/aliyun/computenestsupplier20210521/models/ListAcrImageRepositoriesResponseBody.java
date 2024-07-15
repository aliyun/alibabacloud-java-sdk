// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListAcrImageRepositoriesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The images.</p>
     */
    @NameInMap("Repositories")
    public java.util.List<ListAcrImageRepositoriesResponseBodyRepositories> repositories;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4A145D8-6F6C-532A-9001-9730CDA27578</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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
        /**
         * <p>The time when the image was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the image was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The image repo ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-3gqhkza0wbxxxxxx</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The image repo name.</p>
         * 
         * <strong>example:</strong>
         * <p>wordpress</p>
         */
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
