// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LiveManifestConfig extends TeaModel {
    @NameInMap("AdMarkers")
    public String adMarkers;

    @NameInMap("DateTimeInterval")
    public Integer dateTimeInterval;

    @NameInMap("ManifestName")
    public String manifestName;

    @NameInMap("MaxVideoBitrate")
    public Integer maxVideoBitrate;

    @NameInMap("MinBufferTime")
    public Integer minBufferTime;

    @NameInMap("MinVideoBitrate")
    public Integer minVideoBitrate;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("SegmentNum")
    public Integer segmentNum;

    @NameInMap("StreamOrder")
    public String streamOrder;

    @NameInMap("UseAudioRenditionGroups")
    public Boolean useAudioRenditionGroups;

    public static LiveManifestConfig build(java.util.Map<String, ?> map) throws Exception {
        LiveManifestConfig self = new LiveManifestConfig();
        return TeaModel.build(map, self);
    }

    public LiveManifestConfig setAdMarkers(String adMarkers) {
        this.adMarkers = adMarkers;
        return this;
    }
    public String getAdMarkers() {
        return this.adMarkers;
    }

    public LiveManifestConfig setDateTimeInterval(Integer dateTimeInterval) {
        this.dateTimeInterval = dateTimeInterval;
        return this;
    }
    public Integer getDateTimeInterval() {
        return this.dateTimeInterval;
    }

    public LiveManifestConfig setManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }
    public String getManifestName() {
        return this.manifestName;
    }

    public LiveManifestConfig setMaxVideoBitrate(Integer maxVideoBitrate) {
        this.maxVideoBitrate = maxVideoBitrate;
        return this;
    }
    public Integer getMaxVideoBitrate() {
        return this.maxVideoBitrate;
    }

    public LiveManifestConfig setMinBufferTime(Integer minBufferTime) {
        this.minBufferTime = minBufferTime;
        return this;
    }
    public Integer getMinBufferTime() {
        return this.minBufferTime;
    }

    public LiveManifestConfig setMinVideoBitrate(Integer minVideoBitrate) {
        this.minVideoBitrate = minVideoBitrate;
        return this;
    }
    public Integer getMinVideoBitrate() {
        return this.minVideoBitrate;
    }

    public LiveManifestConfig setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public LiveManifestConfig setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
        return this;
    }
    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    public LiveManifestConfig setStreamOrder(String streamOrder) {
        this.streamOrder = streamOrder;
        return this;
    }
    public String getStreamOrder() {
        return this.streamOrder;
    }

    public LiveManifestConfig setUseAudioRenditionGroups(Boolean useAudioRenditionGroups) {
        this.useAudioRenditionGroups = useAudioRenditionGroups;
        return this;
    }
    public Boolean getUseAudioRenditionGroups() {
        return this.useAudioRenditionGroups;
    }

}
