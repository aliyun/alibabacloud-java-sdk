// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateRoomRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Extension")
    public java.util.Map<String, String> extension;

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

    public static CreateRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomRequest self = new CreateRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateRoomRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

    public CreateRoomRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public CreateRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public CreateRoomRequest setRoomOwnerId(String roomOwnerId) {
        this.roomOwnerId = roomOwnerId;
        return this;
    }
    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public CreateRoomRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateRoomRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
