// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupListResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<QueryMeetingRoomGroupListResponseBodyResult> result;

    public static QueryMeetingRoomGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupListResponseBody self = new QueryMeetingRoomGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMeetingRoomGroupListResponseBody setResult(java.util.List<QueryMeetingRoomGroupListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryMeetingRoomGroupListResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryMeetingRoomGroupListResponseBodyResult extends TeaModel {
        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ParentId")
        public Long parentId;

        public static QueryMeetingRoomGroupListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomGroupListResponseBodyResult self = new QueryMeetingRoomGroupListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomGroupListResponseBodyResult setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryMeetingRoomGroupListResponseBodyResult setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryMeetingRoomGroupListResponseBodyResult setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
