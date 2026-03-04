// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LiveManifestConfig extends TeaModel {
    /**
     * <p>The type of ad markers to include in the manifest.</p>
     * <ul>
     * <li>NONE: Removes all ad markers.</li>
     * <li>DATE_RANGE: Inserts EXT-X-DATERANGE tags (HLS spec). Valid for HLS/HLS-CMAF endpoints.</li>
     * <li>XML: Inserts XML-based ad markers (DASH spec). Valid for DASH endpoints.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("AdMarkers")
    public String adMarkers;

    /**
     * <p>The interval, in seconds, at which to insert the EXT-X-PROGRAM-DATE-TIME tag into the playlist. By default, no tags are inserted. Valid values: 1 to 3600. Applies only to HLS and HLS-CMAF endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DateTimeInterval")
    public Integer dateTimeInterval;

    /**
     * <p>The duration of the startover window, in seconds. It defines the maximum time a viewer can seek backward in the live stream. Valid values: 1 to 3600. Default value: 60. Applies only to DASH endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ManifestDuration")
    public Integer manifestDuration;

    /**
     * <p>The maximum bitrate threshold (in bits per second) that video tracks must be at or below to be available for playback from this endpoint. It must be a positive integer. If not set, no maximum bitrate is enforced.</p>
     * 
     * <strong>example:</strong>
     * <p>8000000</p>
     */
    @NameInMap("MaxVideoBitrate")
    public Integer maxVideoBitrate;

    /**
     * <p>The minimum buffer time, in seconds. Valid values: 1 to 30. Default value: the duration of two segments. Applies only to DASH endpoints.</p>
     * <p>Note: Setting this value too low may cause playback to stutter. We recommend a value no less than two segment durations.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinBufferTime")
    public Integer minBufferTime;

    /**
     * <p>The minimum update period for the manifest, in seconds. Valid values: 1 to 3600. Default value: the duration of two segments. Applies only to DASH endpoints.</p>
     * <p>Note: For smooth playback, set this value to be less than MinBufferTime.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinUpdatePeriod")
    public Integer minUpdatePeriod;

    /**
     * <p>The minimum bitrate threshold (in bits per second) that video tracks must be at or above to be available for playback from this endpoint. It must be a positive integer. If not set, no minimum bitrate is enforced.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("MinVideoBitrate")
    public Integer minVideoBitrate;

    /**
     * <p>The suggested presentation delay, in seconds. Valid values: 1 to 60. Default value: the duration of three segments.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PresentationDelay")
    public Integer presentationDelay;

    /**
     * <p>The number of segments to include in the playlist. Applies to HLS and HLS-CMAF protocols. If not set, the channel\&quot;s default configuration is used. Valid values: 2 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SegmentCount")
    public Integer segmentCount;

    /**
     * <p>The format of the segment template. Only NUMBER_TIMELINE is supported (default). Applies only to DASH endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>NUMBER_TIMELINE</p>
     */
    @NameInMap("SegmentTemplateFormat")
    public String segmentTemplateFormat;

    /**
     * <p>The order of streams in the master playlist. Valid values:</p>
     * <ul>
     * <li>ORIGINAL: Preserves the original order of the input streams.</li>
     * <li>VIDEO_BITRATE_ASCENDING: sorts the streams in ascending order of bitrates, from lowest to highest.</li>
     * <li>VIDEO_BITRATE_DESCENDING: sorts the streams in descending order of bitrates, from highest to lowest.</li>
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
