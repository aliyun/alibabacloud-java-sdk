// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterChannelRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("SeekOffset")
    public Integer seekOffset;

    @NameInMap("PlayStatus")
    public Integer playStatus;

    @NameInMap("ReloadFlag")
    public Integer reloadFlag;

    public static SetCasterChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterChannelRequest self = new SetCasterChannelRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterChannelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCasterChannelRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SetCasterChannelRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public SetCasterChannelRequest setSeekOffset(Integer seekOffset) {
        this.seekOffset = seekOffset;
        return this;
    }
    public Integer getSeekOffset() {
        return this.seekOffset;
    }

    public SetCasterChannelRequest setPlayStatus(Integer playStatus) {
        this.playStatus = playStatus;
        return this;
    }
    public Integer getPlayStatus() {
        return this.playStatus;
    }

    public SetCasterChannelRequest setReloadFlag(Integer reloadFlag) {
        this.reloadFlag = reloadFlag;
        return this;
    }
    public Integer getReloadFlag() {
        return this.reloadFlag;
    }

}
