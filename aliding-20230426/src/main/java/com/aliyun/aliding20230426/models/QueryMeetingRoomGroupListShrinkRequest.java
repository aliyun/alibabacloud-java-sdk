// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupListShrinkRequest extends TeaModel {
    @NameInMap("Request")
    public String requestShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryMeetingRoomGroupListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupListShrinkRequest self = new QueryMeetingRoomGroupListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupListShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

    public QueryMeetingRoomGroupListShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
