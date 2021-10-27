// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRoomRequest extends TeaModel {
    // 主播id，仅支持英文和数字，最大长度36位。
    @NameInMap("AnchorId")
    public String anchorId;

    // 主播昵称。
    @NameInMap("AnchorNick")
    public String anchorNick;

    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 封面，支持图片地址链接格式
    @NameInMap("CoverUrl")
    public String coverUrl;

    // 拓展字段，按需传递，需要额外记录的房间属性。
    @NameInMap("Extension")
    public java.util.Map<String, String> extension;

    // 直播ID。
    @NameInMap("LiveId")
    public String liveId;

    // 公告，支持中英文，最大长度256位。
    @NameInMap("Notice")
    public String notice;

    // 标题，支持中英文，最大长度32位。
    @NameInMap("Title")
    public String title;

    // 操作人ID。
    @NameInMap("UserId")
    public String userId;

    public static UpdateLiveRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRoomRequest self = new UpdateLiveRoomRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRoomRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public UpdateLiveRoomRequest setAnchorNick(String anchorNick) {
        this.anchorNick = anchorNick;
        return this;
    }
    public String getAnchorNick() {
        return this.anchorNick;
    }

    public UpdateLiveRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateLiveRoomRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public UpdateLiveRoomRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

    public UpdateLiveRoomRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public UpdateLiveRoomRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public UpdateLiveRoomRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateLiveRoomRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
