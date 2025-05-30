// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LiveManifestConfig extends TeaModel {
    @NameInMap("AdMarkers")
    public String adMarkers;

    @NameInMap("DateTimeInterval")
    public Integer dateTimeInterval;

    @NameInMap("ManifestDuration")
    public Integer manifestDuration;

    @NameInMap("MaxVideoBitrate")
    public Integer maxVideoBitrate;

    @NameInMap("MinBufferTime")
    public Integer minBufferTime;

    @NameInMap("MinUpdatePeriod")
    public Integer minUpdatePeriod;

    @NameInMap("MinVideoBitrate")
    public Integer minVideoBitrate;

    @NameInMap("PresentationDelay")
    public Integer presentationDelay;

    @NameInMap("SegmentCount")
    public Integer segmentCount;

    @NameInMap("SegmentTemplateFormat")
    public String segmentTemplateFormat;

    @NameInMap("StreamOrder")
    public String streamOrder;

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

    public LiveManifestConfig setManifestDuration(Integer manifestDuration) {
        this.manifestDuration = manifestDuration;
        return this;
    }
    public Integer getManifestDuration() {
        return this.manifestDuration;
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

    public LiveManifestConfig setMinUpdatePeriod(Integer minUpdatePeriod) {
        this.minUpdatePeriod = minUpdatePeriod;
        return this;
    }
    public Integer getMinUpdatePeriod() {
        return this.minUpdatePeriod;
    }

    public LiveManifestConfig setMinVideoBitrate(Integer minVideoBitrate) {
        this.minVideoBitrate = minVideoBitrate;
        return this;
    }
    public Integer getMinVideoBitrate() {
        return this.minVideoBitrate;
    }

    public LiveManifestConfig setPresentationDelay(Integer presentationDelay) {
        this.presentationDelay = presentationDelay;
        return this;
    }
    public Integer getPresentationDelay() {
        return this.presentationDelay;
    }

    public LiveManifestConfig setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }
    public Integer getSegmentCount() {
        return this.segmentCount;
    }

    public LiveManifestConfig setSegmentTemplateFormat(String segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat;
        return this;
    }
    public String getSegmentTemplateFormat() {
        return this.segmentTemplateFormat;
    }

    public LiveManifestConfig setStreamOrder(String streamOrder) {
        this.streamOrder = streamOrder;
        return this;
    }
    public String getStreamOrder() {
        return this.streamOrder;
    }

}
