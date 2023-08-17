// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CloudPlayerShrinkRequest extends TeaModel {
    @NameInMap("CurPlayIndex")
    public Integer curPlayIndex;

    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("PlayMode")
    public String playMode;

    @NameInMap("SongId")
    public String songId;

    @NameInMap("SongIdList")
    public String songIdListShrink;

    @NameInMap("Source")
    public String source;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static CloudPlayerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudPlayerShrinkRequest self = new CloudPlayerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloudPlayerShrinkRequest setCurPlayIndex(Integer curPlayIndex) {
        this.curPlayIndex = curPlayIndex;
        return this;
    }
    public Integer getCurPlayIndex() {
        return this.curPlayIndex;
    }

    public CloudPlayerShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public CloudPlayerShrinkRequest setPlayMode(String playMode) {
        this.playMode = playMode;
        return this;
    }
    public String getPlayMode() {
        return this.playMode;
    }

    public CloudPlayerShrinkRequest setSongId(String songId) {
        this.songId = songId;
        return this;
    }
    public String getSongId() {
        return this.songId;
    }

    public CloudPlayerShrinkRequest setSongIdListShrink(String songIdListShrink) {
        this.songIdListShrink = songIdListShrink;
        return this;
    }
    public String getSongIdListShrink() {
        return this.songIdListShrink;
    }

    public CloudPlayerShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CloudPlayerShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
