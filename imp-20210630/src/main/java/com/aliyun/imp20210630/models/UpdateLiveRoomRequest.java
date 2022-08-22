// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRoomRequest extends TeaModel {
    @NameInMap("AnchorId")
    public String anchorId;

    @NameInMap("AnchorNick")
    public String anchorNick;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("CoverUrl")
    public String coverUrl;

    @NameInMap("Extension")
    public java.util.Map<String, String> extension;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("Notice")
    public String notice;

    @NameInMap("Title")
    public String title;

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
