// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class HotLiveRtcStreamRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The audio MSID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rts audio</p>
     */
    @NameInMap("AudioMsid")
    public String audioMsid;

    /**
     * <p>The duration for which the prefetch connection is maintained. Unit: milliseconds. Default value: 0, which specifies that the prefetch connection is always maintained.</p>
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
     * <p>The custom period after which a timeout event is triggered. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("MediaTimeout")
    public String mediaTimeout;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The code of the region in which the live stream is prefetched. For more information, see the following tables that list available region codes.</p>
     * <blockquote>
     * <p> Region codes include provincial codes for China and country codes for all countries.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZHJ</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the live stream that you want to prefetch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The video MSID.</p>
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
