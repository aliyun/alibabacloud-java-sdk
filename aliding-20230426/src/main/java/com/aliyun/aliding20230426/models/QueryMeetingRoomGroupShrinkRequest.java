// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupShrinkRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryMeetingRoomGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupShrinkRequest self = new QueryMeetingRoomGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryMeetingRoomGroupShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
