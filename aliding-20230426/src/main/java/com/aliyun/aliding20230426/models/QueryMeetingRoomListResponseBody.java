// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("nextToken")
    public Long nextToken;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<QueryMeetingRoomListResponseBodyResult> result;

    public static QueryMeetingRoomListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomListResponseBody self = new QueryMeetingRoomListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomListResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryMeetingRoomListResponseBody setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public QueryMeetingRoomListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMeetingRoomListResponseBody setResult(java.util.List<QueryMeetingRoomListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryMeetingRoomListResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryMeetingRoomListResponseBodyResultRoomGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
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

        public static QueryMeetingRoomListResponseBodyResultRoomGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomListResponseBodyResultRoomGroup self = new QueryMeetingRoomListResponseBodyResultRoomGroup();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomListResponseBodyResultRoomGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryMeetingRoomListResponseBodyResultRoomGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryMeetingRoomListResponseBodyResultRoomGroup setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class QueryMeetingRoomListResponseBodyResultRoomLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LabelId")
        public Long labelId;

        /**
         * <strong>example:</strong>
         * <p>电视</p>
         */
        @NameInMap("LabelName")
        public String labelName;

        public static QueryMeetingRoomListResponseBodyResultRoomLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomListResponseBodyResultRoomLabels self = new QueryMeetingRoomListResponseBodyResultRoomLabels();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomListResponseBodyResultRoomLabels setLabelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }
        public Long getLabelId() {
            return this.labelId;
        }

        public QueryMeetingRoomListResponseBodyResultRoomLabels setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

    }

    public static class QueryMeetingRoomListResponseBodyResultRoomLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx市xx区xx街道xx号</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>xxx公司</p>
         */
        @NameInMap("Title")
        public String title;

        public static QueryMeetingRoomListResponseBodyResultRoomLocation build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomListResponseBodyResultRoomLocation self = new QueryMeetingRoomListResponseBodyResultRoomLocation();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomListResponseBodyResultRoomLocation setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMeetingRoomListResponseBodyResultRoomLocation setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryMeetingRoomListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ding994axxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p>xxxIsvRoomId</p>
         */
        @NameInMap("IsvRoomId")
        public String isvRoomId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RoomCapacity")
        public Integer roomCapacity;

        @NameInMap("RoomGroup")
        public QueryMeetingRoomListResponseBodyResultRoomGroup roomGroup;

        /**
         * <strong>example:</strong>
         * <p>0ffb7xxxxx</p>
         */
        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("RoomLabels")
        public java.util.List<QueryMeetingRoomListResponseBodyResultRoomLabels> roomLabels;

        @NameInMap("RoomLocation")
        public QueryMeetingRoomListResponseBodyResultRoomLocation roomLocation;

        /**
         * <strong>example:</strong>
         * <p>测试会议室</p>
         */
        @NameInMap("RoomName")
        public String roomName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://static.dingtalk.com/media/lADPxxxxx.jpg">https://static.dingtalk.com/media/lADPxxxxx.jpg</a></p>
         */
        @NameInMap("RoomPicture")
        public String roomPicture;

        /**
         * <strong>example:</strong>
         * <p>012241xxxxx</p>
         */
        @NameInMap("RoomStaffId")
        public String roomStaffId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RoomStatus")
        public Integer roomStatus;

        public static QueryMeetingRoomListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomListResponseBodyResult self = new QueryMeetingRoomListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomListResponseBodyResult setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public QueryMeetingRoomListResponseBodyResult setIsvRoomId(String isvRoomId) {
            this.isvRoomId = isvRoomId;
            return this;
        }
        public String getIsvRoomId() {
            return this.isvRoomId;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomCapacity(Integer roomCapacity) {
            this.roomCapacity = roomCapacity;
            return this;
        }
        public Integer getRoomCapacity() {
            return this.roomCapacity;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomGroup(QueryMeetingRoomListResponseBodyResultRoomGroup roomGroup) {
            this.roomGroup = roomGroup;
            return this;
        }
        public QueryMeetingRoomListResponseBodyResultRoomGroup getRoomGroup() {
            return this.roomGroup;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomLabels(java.util.List<QueryMeetingRoomListResponseBodyResultRoomLabels> roomLabels) {
            this.roomLabels = roomLabels;
            return this;
        }
        public java.util.List<QueryMeetingRoomListResponseBodyResultRoomLabels> getRoomLabels() {
            return this.roomLabels;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomLocation(QueryMeetingRoomListResponseBodyResultRoomLocation roomLocation) {
            this.roomLocation = roomLocation;
            return this;
        }
        public QueryMeetingRoomListResponseBodyResultRoomLocation getRoomLocation() {
            return this.roomLocation;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomPicture(String roomPicture) {
            this.roomPicture = roomPicture;
            return this;
        }
        public String getRoomPicture() {
            return this.roomPicture;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomStaffId(String roomStaffId) {
            this.roomStaffId = roomStaffId;
            return this;
        }
        public String getRoomStaffId() {
            return this.roomStaffId;
        }

        public QueryMeetingRoomListResponseBodyResult setRoomStatus(Integer roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }
        public Integer getRoomStatus() {
            return this.roomStatus;
        }

    }

}
