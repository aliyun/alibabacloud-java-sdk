// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomShrinkRequest extends TeaModel {
    @NameInMap("EnableCycleReservation")
    public Boolean enableCycleReservation;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("IsvRoomId")
    public String isvRoomId;

    @NameInMap("ReservationAuthority")
    public String reservationAuthorityShrink;

    @NameInMap("RoomCapacity")
    public Integer roomCapacity;

    @NameInMap("RoomLabelIds")
    public String roomLabelIdsShrink;

    @NameInMap("RoomLocation")
    public String roomLocationShrink;

    @NameInMap("RoomName")
    public String roomName;

    @NameInMap("RoomPicture")
    public String roomPicture;

    @NameInMap("RoomStatus")
    public Integer roomStatus;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static CreateMeetingRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomShrinkRequest self = new CreateMeetingRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomShrinkRequest setEnableCycleReservation(Boolean enableCycleReservation) {
        this.enableCycleReservation = enableCycleReservation;
        return this;
    }
    public Boolean getEnableCycleReservation() {
        return this.enableCycleReservation;
    }

    public CreateMeetingRoomShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateMeetingRoomShrinkRequest setIsvRoomId(String isvRoomId) {
        this.isvRoomId = isvRoomId;
        return this;
    }
    public String getIsvRoomId() {
        return this.isvRoomId;
    }

    public CreateMeetingRoomShrinkRequest setReservationAuthorityShrink(String reservationAuthorityShrink) {
        this.reservationAuthorityShrink = reservationAuthorityShrink;
        return this;
    }
    public String getReservationAuthorityShrink() {
        return this.reservationAuthorityShrink;
    }

    public CreateMeetingRoomShrinkRequest setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
        return this;
    }
    public Integer getRoomCapacity() {
        return this.roomCapacity;
    }

    public CreateMeetingRoomShrinkRequest setRoomLabelIdsShrink(String roomLabelIdsShrink) {
        this.roomLabelIdsShrink = roomLabelIdsShrink;
        return this;
    }
    public String getRoomLabelIdsShrink() {
        return this.roomLabelIdsShrink;
    }

    public CreateMeetingRoomShrinkRequest setRoomLocationShrink(String roomLocationShrink) {
        this.roomLocationShrink = roomLocationShrink;
        return this;
    }
    public String getRoomLocationShrink() {
        return this.roomLocationShrink;
    }

    public CreateMeetingRoomShrinkRequest setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }
    public String getRoomName() {
        return this.roomName;
    }

    public CreateMeetingRoomShrinkRequest setRoomPicture(String roomPicture) {
        this.roomPicture = roomPicture;
        return this;
    }
    public String getRoomPicture() {
        return this.roomPicture;
    }

    public CreateMeetingRoomShrinkRequest setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
        return this;
    }
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    public CreateMeetingRoomShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
