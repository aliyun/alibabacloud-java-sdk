// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SceneElement extends TeaModel {
    /**
     * <p>The timestamps of the frames within the current video element that match the search content. The unit is milliseconds.</p>
     */
    @NameInMap("FrameTimes")
    public java.util.List<Long> frameTimes;

    /**
     * <p>The label information.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The time range of the video element. The array has a fixed length of 2. The two values represent the start time and end time in milliseconds.</p>
     */
    @NameInMap("TimeRange")
    public java.util.List<Long> timeRange;

    /**
     * <p>The index of the video stream to which the current video scene element belongs. This corresponds to the index in the <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-detectmediameta?spm=a2c4g.11186623.0.0.463e600fIDdM8r#api-detail-40">VideoStreams</a> array.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VideoStreamIndex")
    public Long videoStreamIndex;

    public static SceneElement build(java.util.Map<String, ?> map) throws Exception {
        SceneElement self = new SceneElement();
        return TeaModel.build(map, self);
    }

    public SceneElement setFrameTimes(java.util.List<Long> frameTimes) {
        this.frameTimes = frameTimes;
        return this;
    }
    public java.util.List<Long> getFrameTimes() {
        return this.frameTimes;
    }

    public SceneElement setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public SceneElement setTimeRange(java.util.List<Long> timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    public SceneElement setVideoStreamIndex(Long videoStreamIndex) {
        this.videoStreamIndex = videoStreamIndex;
        return this;
    }
    public Long getVideoStreamIndex() {
        return this.videoStreamIndex;
    }

}
