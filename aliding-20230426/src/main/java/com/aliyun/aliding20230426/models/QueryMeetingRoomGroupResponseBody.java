// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupResponseBody extends TeaModel {
    @NameInMap("groupId")
    public Long groupId;

    @NameInMap("groupName")
    public String groupName;

    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryMeetingRoomGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupResponseBody self = new QueryMeetingRoomGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryMeetingRoomGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public QueryMeetingRoomGroupResponseBody setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public QueryMeetingRoomGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
