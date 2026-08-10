// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LiveManifestConfig extends TeaModel {
    /**
     * <p>The ad markers supported in the playlist. Valid values:</p>
     * <ul>
     * <li>NONE: removes ad markers.</li>
     * <li>DATE_RANGE: uses the EXT-X-DATERANGE tag defined in the HLS specification. This value is available when the endpoint protocol is HLS/HLS_CMAF.</li>
     * <li>XML: uses the XML ad markers defined in the DASH specification. This value is available when the endpoint protocol is DASH.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("AdMarkers")
    public String adMarkers;

    /**
     * <p>The interval (in seconds) for inserting the EXT-X-PROGRAM-DATE-TIME time tag. By default, the tag is not inserted. Valid values: 1 to 3600. This parameter applies to the HLS/HLS_CMAF protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DateTimeInterval")
    public Integer dateTimeInterval;

    /**
     * <p>The maximum time-shift duration during live streaming. Unit: seconds. Valid values: 1 to 3600. Default value: 60. This parameter applies to DASH.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ManifestDuration")
    public Integer manifestDuration;

    /**
     * <p>The maximum input bitrate threshold (unit: bit/s). A video track must have a bitrate less than or equal to this threshold to be played from this endpoint. Valid values: integers greater than 0. By default, this parameter is empty and no maximum bitrate limit is set.</p>
     * 
     * <strong>example:</strong>
     * <p>8000000</p>
     */
    @NameInMap("MaxVideoBitrate")
    public Integer maxVideoBitrate;

    /**
     * <p>The minimum buffer time. Unit: seconds. Valid values: 1 to 30. Default value: 2 segment durations. This parameter applies only to DASH.</p>
     * <blockquote>
     * <p> An excessively small minimum buffer time may cause playback stuttering. Set this parameter to a value no less than 2 segment durations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinBufferTime")
    public Integer minBufferTime;

    /**
     * <p>The minimum update interval. Unit: seconds. Valid values: 1 to 3600. Default value: 2 segment durations. This parameter applies to DASH.</p>
     * <blockquote>
     * <p> Set this parameter to a value less than the minimum buffer time. An excessively large value may cause DASH playback stuttering.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinUpdatePeriod")
    public Integer minUpdatePeriod;

    /**
     * <p>The minimum input bitrate threshold (unit: bit/s). A video track must have a bitrate greater than or equal to this threshold to be played from this endpoint. Valid values: integers greater than 0. By default, this parameter is empty and no minimum bitrate is set.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("MinVideoBitrate")
    public Integer minVideoBitrate;

    @NameInMap("PartHoldBackMs")
    public Integer partHoldBackMs;

    /**
     * <p>The suggested presentation delay. Unit: seconds. Valid values: 1 to 60. Default value: 3 segment durations.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PresentationDelay")
    public Integer presentationDelay;

    /**
     * <p>The number of segments. This parameter applies to the HLS/HLS_CMAF protocol. By default, the channel configuration is used. Valid values: 2 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SegmentCount")
    public Integer segmentCount;

    /**
     * <p>The segment template. Currently, only NUMBER_TIMELINE (default) is supported. This parameter applies to DASH.</p>
     * 
     * <strong>example:</strong>
     * <p>NUMBER_TIMELINE</p>
     */
    @NameInMap("SegmentTemplateFormat")
    public String segmentTemplateFormat;

    /**
     * <p>The stream sorting rule. Valid values:</p>
     * <ul>
     * <li>ORIGINAL: retains the original order of the input sub-manifest.</li>
     * <li>VIDEO_BITRATE_ASCENDING: sorts by video stream bitrate in ascending order.</li>
     * <li>VIDEO_BITRATE_DESCENDING: sorts by video stream bitrate in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ORIGINAL</p>
     */
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

    public LiveManifestConfig setPartHoldBackMs(Integer partHoldBackMs) {
        this.partHoldBackMs = partHoldBackMs;
        return this;
    }
    public Integer getPartHoldBackMs() {
        return this.partHoldBackMs;
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
