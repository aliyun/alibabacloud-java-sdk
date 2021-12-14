// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRoomShrinkRequest extends TeaModel {
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
    public String extensionShrink;

    // 直播ID。
    @NameInMap("LiveId")
    public String liveId;

    // 公告，支持中英文，最大长度256位。
    @NameInMap("Notice")
    public String notice;

    @NameInMap("RegionId")
    public String regionId;

    // 标题，支持中英文，最大长度32位。
    @NameInMap("Title")
    public String title;

    // 操作人ID。
    @NameInMap("UserId")
    public String userId;

    public static UpdateLiveRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRoomShrinkRequest self = new UpdateLiveRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRoomShrinkRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public UpdateLiveRoomShrinkRequest setAnchorNick(String anchorNick) {
        this.anchorNick = anchorNick;
        return this;
    }
    public String getAnchorNick() {
        return this.anchorNick;
    }

    public UpdateLiveRoomShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateLiveRoomShrinkRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public UpdateLiveRoomShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public UpdateLiveRoomShrinkRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public UpdateLiveRoomShrinkRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public UpdateLiveRoomShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveRoomShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateLiveRoomShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
