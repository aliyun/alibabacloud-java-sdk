// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CloudPlayerShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurPlayIndex")
    public Integer curPlayIndex;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("PlayMode")
    public String playMode;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SongId")
    public String songId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SongIdList")
    public String songIdListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     */
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
