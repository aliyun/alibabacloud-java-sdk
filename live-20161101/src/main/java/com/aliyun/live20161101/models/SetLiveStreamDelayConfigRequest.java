// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamDelayConfigRequest extends TeaModel {
    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The FLV playback latency. Unit: seconds.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the latency is set based on the value of FlvLevel.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("FlvDelay")
    public Integer flvDelay;

    /**
     * <p>The FLV latency level. This parameter is ignored if FlvDelay is set.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>short</strong> (default): 2 seconds.</p>
     * </li>
     * <li><p><strong>medium</strong>: 4 seconds.</p>
     * </li>
     * <li><p><strong>long</strong>: more than 4 seconds.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If both FlvDelay and FlvLevel are left empty, the default value <strong>short</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("FlvLevel")
    public String flvLevel;

    /**
     * <p>The HLS playback latency. Unit: seconds.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the latency is set based on the value of HlsLevel.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HlsDelay")
    public Integer hlsDelay;

    /**
     * <p>The HLS latency level. This parameter is ignored if HlsDelay is set.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>short</strong> (default): 3 seconds.</p>
     * </li>
     * <li><p><strong>medium</strong>: 6 seconds.</p>
     * </li>
     * <li><p><strong>long</strong>: 15 seconds.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If both HlsDelay and HlsLevel are left empty, the default value <strong>short</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>short</p>
     */
    @NameInMap("HlsLevel")
    public String hlsLevel;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The RTMP playback latency. Unit: seconds.</p>
     * <blockquote>
     * <p>If this parameter is left empty, the latency is set based on the value of RtmpLevel.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("RtmpDelay")
    public Integer rtmpDelay;

    /**
     * <p>The RTMP latency level. This parameter is ignored if RtmpDelay is set.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>short</strong> (default): 2 seconds.</p>
     * </li>
     * <li><p><strong>medium</strong>: 4 seconds.</p>
     * </li>
     * <li><p><strong>long</strong>: more than 4 seconds.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If both RtmpDelay and RtmpLevel are left empty, the default value <strong>short</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>short</p>
     */
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

    public SetLiveStreamDelayConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveStreamDelayConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
