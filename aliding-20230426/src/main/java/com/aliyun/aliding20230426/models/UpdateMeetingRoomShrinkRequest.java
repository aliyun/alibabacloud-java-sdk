// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomShrinkRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("IsvRoomId")
    public String isvRoomId;

    @NameInMap("RoomCapacity")
    public Integer roomCapacity;

    @NameInMap("RoomId")
    public String roomId;

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

    public static UpdateMeetingRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomShrinkRequest self = new UpdateMeetingRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateMeetingRoomShrinkRequest setIsvRoomId(String isvRoomId) {
        this.isvRoomId = isvRoomId;
        return this;
    }
    public String getIsvRoomId() {
        return this.isvRoomId;
    }

    public UpdateMeetingRoomShrinkRequest setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
        return this;
    }
    public Integer getRoomCapacity() {
        return this.roomCapacity;
    }

    public UpdateMeetingRoomShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public UpdateMeetingRoomShrinkRequest setRoomLabelIdsShrink(String roomLabelIdsShrink) {
        this.roomLabelIdsShrink = roomLabelIdsShrink;
        return this;
    }
    public String getRoomLabelIdsShrink() {
        return this.roomLabelIdsShrink;
    }

    public UpdateMeetingRoomShrinkRequest setRoomLocationShrink(String roomLocationShrink) {
        this.roomLocationShrink = roomLocationShrink;
        return this;
    }
    public String getRoomLocationShrink() {
        return this.roomLocationShrink;
    }

    public UpdateMeetingRoomShrinkRequest setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }
    public String getRoomName() {
        return this.roomName;
    }

    public UpdateMeetingRoomShrinkRequest setRoomPicture(String roomPicture) {
        this.roomPicture = roomPicture;
        return this;
    }
    public String getRoomPicture() {
        return this.roomPicture;
    }

    public UpdateMeetingRoomShrinkRequest setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
        return this;
    }
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    public UpdateMeetingRoomShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
