// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomRequest extends TeaModel {
    @NameInMap("EnableCycleReservation")
    public Boolean enableCycleReservation;

    /**
     * <strong>example:</strong>
     * <p>4644</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <strong>example:</strong>
     * <p>xxxIsvRoomId</p>
     */
    @NameInMap("IsvRoomId")
    public String isvRoomId;

    @NameInMap("ReservationAuthority")
    public CreateMeetingRoomRequestReservationAuthority reservationAuthority;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RoomCapacity")
    public Integer roomCapacity;

    @NameInMap("RoomLabelIds")
    public java.util.List<Long> roomLabelIds;

    @NameInMap("RoomLocation")
    public CreateMeetingRoomRequestRoomLocation roomLocation;

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
     * <p>1</p>
     */
    @NameInMap("RoomStatus")
    public Integer roomStatus;

    @NameInMap("TenantContext")
    public CreateMeetingRoomRequestTenantContext tenantContext;

    public static CreateMeetingRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomRequest self = new CreateMeetingRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomRequest setEnableCycleReservation(Boolean enableCycleReservation) {
        this.enableCycleReservation = enableCycleReservation;
        return this;
    }
    public Boolean getEnableCycleReservation() {
        return this.enableCycleReservation;
    }

    public CreateMeetingRoomRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateMeetingRoomRequest setIsvRoomId(String isvRoomId) {
        this.isvRoomId = isvRoomId;
        return this;
    }
    public String getIsvRoomId() {
        return this.isvRoomId;
    }

    public CreateMeetingRoomRequest setReservationAuthority(CreateMeetingRoomRequestReservationAuthority reservationAuthority) {
        this.reservationAuthority = reservationAuthority;
        return this;
    }
    public CreateMeetingRoomRequestReservationAuthority getReservationAuthority() {
        return this.reservationAuthority;
    }

    public CreateMeetingRoomRequest setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
        return this;
    }
    public Integer getRoomCapacity() {
        return this.roomCapacity;
    }

    public CreateMeetingRoomRequest setRoomLabelIds(java.util.List<Long> roomLabelIds) {
        this.roomLabelIds = roomLabelIds;
        return this;
    }
    public java.util.List<Long> getRoomLabelIds() {
        return this.roomLabelIds;
    }

    public CreateMeetingRoomRequest setRoomLocation(CreateMeetingRoomRequestRoomLocation roomLocation) {
        this.roomLocation = roomLocation;
        return this;
    }
    public CreateMeetingRoomRequestRoomLocation getRoomLocation() {
        return this.roomLocation;
    }

    public CreateMeetingRoomRequest setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }
    public String getRoomName() {
        return this.roomName;
    }

    public CreateMeetingRoomRequest setRoomPicture(String roomPicture) {
        this.roomPicture = roomPicture;
        return this;
    }
    public String getRoomPicture() {
        return this.roomPicture;
    }

    public CreateMeetingRoomRequest setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
        return this;
    }
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    public CreateMeetingRoomRequest setTenantContext(CreateMeetingRoomRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateMeetingRoomRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberType")
        public String memberType;

        public static CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers self = new CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

    }

    public static class CreateMeetingRoomRequestReservationAuthority extends TeaModel {
        @NameInMap("AuthorizedMembers")
        public java.util.List<CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers> authorizedMembers;

        public static CreateMeetingRoomRequestReservationAuthority build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomRequestReservationAuthority self = new CreateMeetingRoomRequestReservationAuthority();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomRequestReservationAuthority setAuthorizedMembers(java.util.List<CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers> authorizedMembers) {
            this.authorizedMembers = authorizedMembers;
            return this;
        }
        public java.util.List<CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers> getAuthorizedMembers() {
            return this.authorizedMembers;
        }

    }

    public static class CreateMeetingRoomRequestRoomLocation extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Title")
        public String title;

        public static CreateMeetingRoomRequestRoomLocation build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomRequestRoomLocation self = new CreateMeetingRoomRequestRoomLocation();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomRequestRoomLocation setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateMeetingRoomRequestRoomLocation setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateMeetingRoomRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateMeetingRoomRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomRequestTenantContext self = new CreateMeetingRoomRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
