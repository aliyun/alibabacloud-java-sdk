// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class HotLiveRtcStreamRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AudioMsid")
    public String audioMsid;

    @NameInMap("ConnectionTimeout")
    public String connectionTimeout;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("MediaTimeout")
    public String mediaTimeout;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("StreamName")
    public String streamName;

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
