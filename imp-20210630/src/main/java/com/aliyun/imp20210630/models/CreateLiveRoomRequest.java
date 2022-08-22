// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRoomRequest extends TeaModel {
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
    public java.util.Map<String, String> extension;

    @NameInMap("Notice")
    public String notice;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserId")
    public String userId;

    public static CreateLiveRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRoomRequest self = new CreateLiveRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRoomRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public CreateLiveRoomRequest setAnchorNick(String anchorNick) {
        this.anchorNick = anchorNick;
        return this;
    }
    public String getAnchorNick() {
        return this.anchorNick;
    }

    public CreateLiveRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveRoomRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public CreateLiveRoomRequest setEnableLinkMic(Boolean enableLinkMic) {
        this.enableLinkMic = enableLinkMic;
        return this;
    }
    public Boolean getEnableLinkMic() {
        return this.enableLinkMic;
    }

    public CreateLiveRoomRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

    public CreateLiveRoomRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public CreateLiveRoomRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLiveRoomRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
