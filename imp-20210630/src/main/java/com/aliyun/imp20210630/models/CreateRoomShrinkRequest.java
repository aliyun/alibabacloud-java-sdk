// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateRoomShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Extension")
    public String extensionShrink;

    @NameInMap("Notice")
    public String notice;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("RoomOwnerId")
    public String roomOwnerId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Title")
    public String title;

    public static CreateRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomShrinkRequest self = new CreateRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoomShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateRoomShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public CreateRoomShrinkRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public CreateRoomShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public CreateRoomShrinkRequest setRoomOwnerId(String roomOwnerId) {
        this.roomOwnerId = roomOwnerId;
        return this;
    }
    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public CreateRoomShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateRoomShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
