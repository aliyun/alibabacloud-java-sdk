// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SceneElement extends TeaModel {
    /**
     * <p>The time points of frames that match the searched content within the element. Unit: milliseconds.</p>
     */
    @NameInMap("FrameTimes")
    public java.util.List<Long> frameTimes;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The time range of the element. The array length is fixed at 2. One is the start time and the other is the end time. Unit: milliseconds.</p>
     */
    @NameInMap("TimeRange")
    public java.util.List<Long> timeRange;

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
