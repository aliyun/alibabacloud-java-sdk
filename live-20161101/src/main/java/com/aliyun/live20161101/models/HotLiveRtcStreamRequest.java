// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class HotLiveRtcStreamRequest extends TeaModel {
    /**
     * <p>The application name of the live stream to prefetch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The audio Msid.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rts audio</p>
     */
    @NameInMap("AudioMsid")
    public String audioMsid;

    /**
     * <p>The duration to maintain the prefetch connection. Unit: milliseconds. The default value, 0, means the connection is always maintained.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ConnectionTimeout")
    public String connectionTimeout;

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
     * <p>The custom timeout period for a timeout event. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("MediaTimeout")
    public String mediaTimeout;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The prefetch area. For more information, see the RegionCode lookup table.</p>
     * <blockquote>
     * <p>For regions within China, specify the corresponding code from the &quot;Region codes for China&quot; table. For all other regions, specify the country code.</p>
     * <ul>
     * <li>If the CodeRegionHasNoNode error is returned after you specify a RegionCode, the corresponding area is not covered by L1 nodes and cannot be prefetched. In this case, specify a different RegionCode.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZHJ</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the live stream to prefetch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The video Msid.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rts video</p>
     */
    @NameInMap("VideoMsid")
    public String videoMsid;

    public static HotLiveRtcStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        HotLiveRtcStreamRequest self = new HotLiveRtcStreamRequest();
        return TeaModel.build(map, self);
    }

    public HotLiveRtcStreamRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public HotLiveRtcStreamRequest setAudioMsid(String audioMsid) {
        this.audioMsid = audioMsid;
        return this;
    }
    public String getAudioMsid() {
        return this.audioMsid;
    }

    public HotLiveRtcStreamRequest setConnectionTimeout(String connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }
    public String getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public HotLiveRtcStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public HotLiveRtcStreamRequest setMediaTimeout(String mediaTimeout) {
        this.mediaTimeout = mediaTimeout;
        return this;
    }
    public String getMediaTimeout() {
        return this.mediaTimeout;
    }

    public HotLiveRtcStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public HotLiveRtcStreamRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public HotLiveRtcStreamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public HotLiveRtcStreamRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public HotLiveRtcStreamRequest setVideoMsid(String videoMsid) {
        this.videoMsid = videoMsid;
        return this;
    }
    public String getVideoMsid() {
        return this.videoMsid;
    }

}
