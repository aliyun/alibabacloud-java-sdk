// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupListRequest extends TeaModel {
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    @NameInMap("TenantContext")
    public QueryMeetingRoomGroupListRequestTenantContext tenantContext;

    public static QueryMeetingRoomGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupListRequest self = new QueryMeetingRoomGroupListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupListRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

    public QueryMeetingRoomGroupListRequest setTenantContext(QueryMeetingRoomGroupListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryMeetingRoomGroupListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryMeetingRoomGroupListRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryMeetingRoomGroupListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomGroupListRequestTenantContext self = new QueryMeetingRoomGroupListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomGroupListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
