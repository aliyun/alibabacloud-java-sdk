// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomListRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Long nextToken;

    @NameInMap("TenantContext")
    public QueryMeetingRoomListRequestTenantContext tenantContext;

    public static QueryMeetingRoomListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomListRequest self = new QueryMeetingRoomListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryMeetingRoomListRequest setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public QueryMeetingRoomListRequest setTenantContext(QueryMeetingRoomListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryMeetingRoomListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryMeetingRoomListRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryMeetingRoomListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomListRequestTenantContext self = new QueryMeetingRoomListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
