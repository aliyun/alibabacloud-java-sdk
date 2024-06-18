// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupListResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
        /**
         * <strong>example:</strong>
         * <p>172</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <strong>example:</strong>
         * <p>测试分组</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
