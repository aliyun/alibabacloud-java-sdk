// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRoomShrinkRequest extends TeaModel {
    @NameInMap("AnchorId")
    public String anchorId;

    @NameInMap("AnchorNick")
    public String anchorNick;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("CoverUrl")
    public String coverUrl;

    @NameInMap("Extension")
    public String extensionShrink;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("Notice")
    public String notice;

    @NameInMap("Title")
    public String title;

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
