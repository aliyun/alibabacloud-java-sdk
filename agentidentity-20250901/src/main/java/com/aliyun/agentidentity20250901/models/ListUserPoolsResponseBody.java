// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserPoolId")
        public String userPoolId;

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

        public ListUserPoolsResponseBodyUserPools setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
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
