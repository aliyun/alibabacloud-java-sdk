// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRequest extends TeaModel {
    // 主播ID，支持中英文，最大长度128位，缺省时主播为当前创建直播用户。
    @NameInMap("AnchorId")
    public String anchorId;

    // 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    // 直播推流码率，缺省时默认为3。取值：  -1：流畅lld。 1：标清lsd。 2：高清lhd。 3：超清lud。
    @NameInMap("CodeLevel")
    public Integer codeLevel;

    // 直播简介，支持中英文，最大长度2048位。
    @NameInMap("Introduction")
    public String introduction;

    // 直播资源的唯一标识ID，缺省时系统自动生成36位随机uuid字符串。
    @NameInMap("LiveId")
    public String liveId;

    // 房间ID，最大长度36个字符，传空值，则随机生成一个房间ID。
    @NameInMap("RoomId")
    public String roomId;

    // 直播标题，支持中英文，最大长度256位。
    @NameInMap("Title")
    public String title;

    // 创建直播用户。
    @NameInMap("UserId")
    public String userId;

    public static CreateLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRequest self = new CreateLiveRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public CreateLiveRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveRequest setCodeLevel(Integer codeLevel) {
        this.codeLevel = codeLevel;
        return this;
    }
    public Integer getCodeLevel() {
        return this.codeLevel;
    }

    public CreateLiveRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public CreateLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public CreateLiveRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public CreateLiveRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
