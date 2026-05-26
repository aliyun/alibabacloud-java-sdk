// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TGlzdFVzZXJQb29sczo6MjA=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UserPools")
    public java.util.List<ListUserPoolsResponseBodyUserPools> userPools;

    public static ListUserPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolsResponseBody self = new ListUserPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserPoolsResponseBody setUserPools(java.util.List<ListUserPoolsResponseBodyUserPools> userPools) {
        this.userPools = userPools;
        return this;
    }
    public java.util.List<ListUserPoolsResponseBodyUserPools> getUserPools() {
        return this.userPools;
    }

    public static class ListUserPoolsResponseBodyUserPools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>up-xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("UserPoolId")
        public String userPoolId;

        /**
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        @NameInMap("UserPoolName")
        public String userPoolName;

        public static ListUserPoolsResponseBodyUserPools build(java.util.Map<String, ?> map) throws Exception {
            ListUserPoolsResponseBodyUserPools self = new ListUserPoolsResponseBodyUserPools();
            return TeaModel.build(map, self);
        }

        public ListUserPoolsResponseBodyUserPools setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserPoolsResponseBodyUserPools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserPoolsResponseBodyUserPools setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserPoolsResponseBodyUserPools setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

        public ListUserPoolsResponseBodyUserPools setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
