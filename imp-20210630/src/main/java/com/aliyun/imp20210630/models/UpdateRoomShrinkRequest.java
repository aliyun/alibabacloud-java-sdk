// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateRoomShrinkRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 拓展字段，按需传递，需要额外记录的房间属性。
    @NameInMap("Extension")
    public String extensionShrink;

    // 房间公告，支持中英文，最大长度256位。
    @NameInMap("Notice")
    public String notice;

    @NameInMap("RegionId")
    public String regionId;

    // 房间唯一标识。
    @NameInMap("RoomId")
    public String roomId;

    // 房主用户id，仅支持英文和数字，最大长度36位。
    @NameInMap("RoomOwnerId")
    public String roomOwnerId;

    // 房间标题，支持中英文，最大长度32位。
    @NameInMap("Title")
    public String title;

    public static UpdateRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoomShrinkRequest self = new UpdateRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoomShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateRoomShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public UpdateRoomShrinkRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public UpdateRoomShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateRoomShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public UpdateRoomShrinkRequest setRoomOwnerId(String roomOwnerId) {
        this.roomOwnerId = roomOwnerId;
        return this;
    }
    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public UpdateRoomShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
