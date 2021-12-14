// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateConferenceRequest extends TeaModel {
    // 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RegionId")
    public String regionId;

    // 房间ID，最大长度36个字符，传空值，则随机生成一个房间ID。
    @NameInMap("RoomId")
    public String roomId;

    // 会议标题，支持中英文，最大长度256位。
    @NameInMap("Title")
    public String title;

    // 创建会议用户。
    @NameInMap("UserId")
    public String userId;

    public static CreateConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConferenceRequest self = new CreateConferenceRequest();
        return TeaModel.build(map, self);
    }

    public CreateConferenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateConferenceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConferenceRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public CreateConferenceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateConferenceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
