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
     * <p>The latency of FLV-based playback. Unit: seconds.</p>
     * <blockquote>
     * <p> If this parameter is left empty, the latency is set to a value corresponding to the FlvLevel parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("FlvDelay")
    public Integer flvDelay;

    /**
     * <p>The latency level of FLV-based playback. Ignore this parameter if the FlvDelay parameter is configured.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>short</strong> (default): The latency is 4 seconds.</li>
     * <li><strong>medium</strong>: The latency is 8 seconds.</li>
     * <li><strong>long</strong>: The latency is 16 seconds.</li>
     * </ul>
     * <blockquote>
     * <p> If both the FlvDelay and FlvLevel parameters are left empty, FlvLevel is set to <strong>short</strong> by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("FlvLevel")
    public String flvLevel;

    /**
     * <p>The latency of HLS-based playback. Unit: seconds.</p>
     * <blockquote>
     * <p> If this parameter is left empty, the latency is set to a value corresponding to the HlsLevel parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HlsDelay")
    public Integer hlsDelay;

    /**
     * <p>The latency level of HLS-based playback. Ignore this parameter if the HlsDelay parameter is configured.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>short</strong>: The latency is 3 seconds. This is the default value.</li>
     * <li><strong>medium</strong>: The latency is 6 seconds.</li>
     * <li><strong>long</strong>: The latency is 15 seconds.</li>
     * </ul>
     * <blockquote>
     * <p> If both the HlsDelay and HlsLevel parameters are left empty, HlsLevel is set to <strong>short</strong> by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>short</p>
     */
    @NameInMap("HlsLevel")
    public String hlsLevel;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The latency of RTMP-based playback. Unit: seconds.</p>
     * <blockquote>
     * <p> If this parameter is left empty, the latency is set to a value corresponding to the RtmpLevel parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("RtmpDelay")
    public Integer rtmpDelay;

    /**
     * <p>The latency level of RTMP-based playback. Ignore this parameter if the RtmpDelay parameter is configured.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>short</strong> (default): The latency is 4 seconds.</li>
     * <li><strong>medium</strong>: The latency is 8 seconds.</li>
     * <li><strong>long</strong>: The latency is 16 seconds.</li>
     * </ul>
     * <blockquote>
     * <p> If both the RtmpDelay and RtmpLevel parameters are left empty, RtmpLevel is set to <strong>short</strong> by default.</p>
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
