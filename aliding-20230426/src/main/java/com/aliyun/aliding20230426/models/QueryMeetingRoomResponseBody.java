// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public QueryMeetingRoomResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static QueryMeetingRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomResponseBody self = new QueryMeetingRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMeetingRoomResponseBody setResult(QueryMeetingRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryMeetingRoomResponseBodyResult getResult() {
        return this.result;
    }

    public QueryMeetingRoomResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryMeetingRoomResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberType")
        public String memberType;

        public static QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers self = new QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

    }

    public static class QueryMeetingRoomResponseBodyResultReservationAuthority extends TeaModel {
        @NameInMap("AuthorizedMembers")
        public java.util.List<QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers> authorizedMembers;

        public static QueryMeetingRoomResponseBodyResultReservationAuthority build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomResponseBodyResultReservationAuthority self = new QueryMeetingRoomResponseBodyResultReservationAuthority();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomResponseBodyResultReservationAuthority setAuthorizedMembers(java.util.List<QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers> authorizedMembers) {
            this.authorizedMembers = authorizedMembers;
            return this;
        }
        public java.util.List<QueryMeetingRoomResponseBodyResultReservationAuthorityAuthorizedMembers> getAuthorizedMembers() {
            return this.authorizedMembers;
        }

    }

    public static class QueryMeetingRoomResponseBodyResultRoomGroup extends TeaModel {
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

        public static QueryMeetingRoomResponseBodyResultRoomGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomResponseBodyResultRoomGroup self = new QueryMeetingRoomResponseBodyResultRoomGroup();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomResponseBodyResultRoomGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryMeetingRoomResponseBodyResultRoomGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryMeetingRoomResponseBodyResultRoomGroup setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class QueryMeetingRoomResponseBodyResultRoomLabels extends TeaModel {
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

        public static QueryMeetingRoomResponseBodyResultRoomLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomResponseBodyResultRoomLabels self = new QueryMeetingRoomResponseBodyResultRoomLabels();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomResponseBodyResultRoomLabels setLabelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }
        public Long getLabelId() {
            return this.labelId;
        }

        public QueryMeetingRoomResponseBodyResultRoomLabels setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

    }

    public static class QueryMeetingRoomResponseBodyResultRoomLocation extends TeaModel {
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

        public static QueryMeetingRoomResponseBodyResultRoomLocation build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomResponseBodyResultRoomLocation self = new QueryMeetingRoomResponseBodyResultRoomLocation();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomResponseBodyResultRoomLocation setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMeetingRoomResponseBodyResultRoomLocation setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryMeetingRoomResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ding994axxxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p>[ &quot;2iPOLbpxxxxuwggiiqiPwiEiF&quot; ]</p>
         */
        @NameInMap("DeviceUnionIds")
        public java.util.List<String> deviceUnionIds;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCycleReservation")
        public Boolean enableCycleReservation;

        /**
         * <strong>example:</strong>
         * <p>xxxIsvRoomId</p>
         */
        @NameInMap("IsvRoomId")
        public String isvRoomId;

        @NameInMap("ReservationAuthority")
        public QueryMeetingRoomResponseBodyResultReservationAuthority reservationAuthority;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RoomCapacity")
        public Integer roomCapacity;

        @NameInMap("RoomGroup")
        public QueryMeetingRoomResponseBodyResultRoomGroup roomGroup;

        /**
         * <strong>example:</strong>
         * <p>0ffb7184xxxxx</p>
         */
        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("RoomLabels")
        public java.util.List<QueryMeetingRoomResponseBodyResultRoomLabels> roomLabels;

        @NameInMap("RoomLocation")
        public QueryMeetingRoomResponseBodyResultRoomLocation roomLocation;

        /**
         * <strong>example:</strong>
         * <p>测试会议室</p>
         */
        @NameInMap("RoomName")
        public String roomName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://static.dingtalk.com/media/lADxxxxx.jpg">https://static.dingtalk.com/media/lADxxxxx.jpg</a></p>
         */
        @NameInMap("RoomPicture")
        public String roomPicture;

        /**
         * <strong>example:</strong>
         * <p>0122414</p>
         */
        @NameInMap("RoomStaffId")
        public String roomStaffId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RoomStatus")
        public Integer roomStatus;

        @NameInMap("RoomUnionId")
        public String roomUnionId;

        public static QueryMeetingRoomResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomResponseBodyResult self = new QueryMeetingRoomResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomResponseBodyResult setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public QueryMeetingRoomResponseBodyResult setDeviceUnionIds(java.util.List<String> deviceUnionIds) {
            this.deviceUnionIds = deviceUnionIds;
            return this;
        }
        public java.util.List<String> getDeviceUnionIds() {
            return this.deviceUnionIds;
        }

        public QueryMeetingRoomResponseBodyResult setEnableCycleReservation(Boolean enableCycleReservation) {
            this.enableCycleReservation = enableCycleReservation;
            return this;
        }
        public Boolean getEnableCycleReservation() {
            return this.enableCycleReservation;
        }

        public QueryMeetingRoomResponseBodyResult setIsvRoomId(String isvRoomId) {
            this.isvRoomId = isvRoomId;
            return this;
        }
        public String getIsvRoomId() {
            return this.isvRoomId;
        }

        public QueryMeetingRoomResponseBodyResult setReservationAuthority(QueryMeetingRoomResponseBodyResultReservationAuthority reservationAuthority) {
            this.reservationAuthority = reservationAuthority;
            return this;
        }
        public QueryMeetingRoomResponseBodyResultReservationAuthority getReservationAuthority() {
            return this.reservationAuthority;
        }

        public QueryMeetingRoomResponseBodyResult setRoomCapacity(Integer roomCapacity) {
            this.roomCapacity = roomCapacity;
            return this;
        }
        public Integer getRoomCapacity() {
            return this.roomCapacity;
        }

        public QueryMeetingRoomResponseBodyResult setRoomGroup(QueryMeetingRoomResponseBodyResultRoomGroup roomGroup) {
            this.roomGroup = roomGroup;
            return this;
        }
        public QueryMeetingRoomResponseBodyResultRoomGroup getRoomGroup() {
            return this.roomGroup;
        }

        public QueryMeetingRoomResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public QueryMeetingRoomResponseBodyResult setRoomLabels(java.util.List<QueryMeetingRoomResponseBodyResultRoomLabels> roomLabels) {
            this.roomLabels = roomLabels;
            return this;
        }
        public java.util.List<QueryMeetingRoomResponseBodyResultRoomLabels> getRoomLabels() {
            return this.roomLabels;
        }

        public QueryMeetingRoomResponseBodyResult setRoomLocation(QueryMeetingRoomResponseBodyResultRoomLocation roomLocation) {
            this.roomLocation = roomLocation;
            return this;
        }
        public QueryMeetingRoomResponseBodyResultRoomLocation getRoomLocation() {
            return this.roomLocation;
        }

        public QueryMeetingRoomResponseBodyResult setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public QueryMeetingRoomResponseBodyResult setRoomPicture(String roomPicture) {
            this.roomPicture = roomPicture;
            return this;
        }
        public String getRoomPicture() {
            return this.roomPicture;
        }

        public QueryMeetingRoomResponseBodyResult setRoomStaffId(String roomStaffId) {
            this.roomStaffId = roomStaffId;
            return this;
        }
        public String getRoomStaffId() {
            return this.roomStaffId;
        }

        public QueryMeetingRoomResponseBodyResult setRoomStatus(Integer roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }
        public Integer getRoomStatus() {
            return this.roomStatus;
        }

        public QueryMeetingRoomResponseBodyResult setRoomUnionId(String roomUnionId) {
            this.roomUnionId = roomUnionId;
            return this;
        }
        public String getRoomUnionId() {
            return this.roomUnionId;
        }

    }

}
