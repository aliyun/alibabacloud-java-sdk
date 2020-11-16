// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamDelayConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("HlsDelay")
    public Integer hlsDelay;

    @NameInMap("HlsLevel")
    public String hlsLevel;

    @NameInMap("FlvDelay")
    public Integer flvDelay;

    @NameInMap("FlvLevel")
    public String flvLevel;

    @NameInMap("RtmpDelay")
    public Integer rtmpDelay;

    @NameInMap("RtmpLevel")
    public String rtmpLevel;

    public static SetLiveStreamDelayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamDelayConfigRequest self = new SetLiveStreamDelayConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamDelayConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveStreamDelayConfigRequest setHlsDelay(Integer hlsDelay) {
        this.hlsDelay = hlsDelay;
        return this;
    }
    public Integer getHlsDelay() {
        return this.hlsDelay;
    }

    public SetLiveStreamDelayConfigRequest setHlsLevel(String hlsLevel) {
        this.hlsLevel = hlsLevel;
        return this;
    }
    public String getHlsLevel() {
        return this.hlsLevel;
    }

    public SetLiveStreamDelayConfigRequest setFlvDelay(Integer flvDelay) {
        this.flvDelay = flvDelay;
        return this;
    }
    public Integer getFlvDelay() {
        return this.flvDelay;
    }

    public SetLiveStreamDelayConfigRequest setFlvLevel(String flvLevel) {
        this.flvLevel = flvLevel;
        return this;
    }
    public String getFlvLevel() {
        return this.flvLevel;
    }

    public SetLiveStreamDelayConfigRequest setRtmpDelay(Integer rtmpDelay) {
        this.rtmpDelay = rtmpDelay;
        return this;
    }
    public Integer getRtmpDelay() {
        return this.rtmpDelay;
    }

    public SetLiveStreamDelayConfigRequest setRtmpLevel(String rtmpLevel) {
        this.rtmpLevel = rtmpLevel;
        return this;
    }
    public String getRtmpLevel() {
        return this.rtmpLevel;
    }

}
