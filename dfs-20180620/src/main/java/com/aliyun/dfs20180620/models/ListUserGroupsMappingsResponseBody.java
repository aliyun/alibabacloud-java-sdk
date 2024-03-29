// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListUserGroupsMappingsResponseBody extends TeaModel {
    @NameInMap("HasMore")
    public Boolean hasMore;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserGroupsMappings")
    public java.util.List<ListUserGroupsMappingsResponseBodyUserGroupsMappings> userGroupsMappings;

    public static ListUserGroupsMappingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsMappingsResponseBody self = new ListUserGroupsMappingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsMappingsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListUserGroupsMappingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserGroupsMappingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupsMappingsResponseBody setUserGroupsMappings(java.util.List<ListUserGroupsMappingsResponseBodyUserGroupsMappings> userGroupsMappings) {
        this.userGroupsMappings = userGroupsMappings;
        return this;
    }
    public java.util.List<ListUserGroupsMappingsResponseBodyUserGroupsMappings> getUserGroupsMappings() {
        return this.userGroupsMappings;
    }

    public static class ListUserGroupsMappingsResponseBodyUserGroupsMappings extends TeaModel {
        @NameInMap("GroupNames")
        public java.util.List<String> groupNames;

        @NameInMap("UserName")
        public String userName;

        public static ListUserGroupsMappingsResponseBodyUserGroupsMappings build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsMappingsResponseBodyUserGroupsMappings self = new ListUserGroupsMappingsResponseBodyUserGroupsMappings();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsMappingsResponseBodyUserGroupsMappings setGroupNames(java.util.List<String> groupNames) {
            this.groupNames = groupNames;
            return this;
        }
        public java.util.List<String> getGroupNames() {
            return this.groupNames;
        }

        public ListUserGroupsMappingsResponseBodyUserGroupsMappings setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
