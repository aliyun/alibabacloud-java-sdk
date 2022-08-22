// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRoomShrinkRequest extends TeaModel {
    @NameInMap("AnchorId")
    public String anchorId;

    @NameInMap("AnchorNick")
    public String anchorNick;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("CoverUrl")
    public String coverUrl;

    @NameInMap("EnableLinkMic")
    public Boolean enableLinkMic;

    @NameInMap("Extension")
    public String extensionShrink;

    @NameInMap("Notice")
    public String notice;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserId")
    public String userId;

    public static CreateLiveRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRoomShrinkRequest self = new CreateLiveRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRoomShrinkRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public CreateLiveRoomShrinkRequest setAnchorNick(String anchorNick) {
        this.anchorNick = anchorNick;
        return this;
    }
    public String getAnchorNick() {
        return this.anchorNick;
    }

    public CreateLiveRoomShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveRoomShrinkRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public CreateLiveRoomShrinkRequest setEnableLinkMic(Boolean enableLinkMic) {
        this.enableLinkMic = enableLinkMic;
        return this;
    }
    public Boolean getEnableLinkMic() {
        return this.enableLinkMic;
    }

    public CreateLiveRoomShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public CreateLiveRoomShrinkRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public CreateLiveRoomShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLiveRoomShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
