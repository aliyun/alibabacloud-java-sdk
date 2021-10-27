// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateRoomRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 拓展字段，按需传递，需要额外记录的房间属性。
    @NameInMap("Extension")
    public java.util.Map<String, String> extension;

    // 房间公告，支持中英文，最大长度256位。
    @NameInMap("Notice")
    public String notice;

    // 房间唯一标识，由字母、数字、符号.和-组成，最大长度36位，传空则随机生成一个房间id。
    @NameInMap("RoomId")
    public String roomId;

    // 房主用户id，仅支持英文和数字，最大长度36位。
    @NameInMap("RoomOwnerId")
    public String roomOwnerId;

    // 房间模板唯一标识，当前支持的取值：default，传空默认为default。
    @NameInMap("TemplateId")
    public String templateId;

    // 房间标题，支持中英文，最大长度32位。
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
