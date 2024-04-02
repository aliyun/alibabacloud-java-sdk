// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementOverviewResponseBody extends TeaModel {
    @NameInMap("AdUnhandleCount")
    public Integer adUnhandleCount;

    @NameInMap("AudioCount")
    public Integer audioCount;

    @NameInMap("ImageCount")
    public Integer imageCount;

    @NameInMap("LiveUnhandleCount")
    public Integer liveUnhandleCount;

    @NameInMap("PornUnhandleCount")
    public Integer pornUnhandleCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TerrorismUnhandleCount")
    public Integer terrorismUnhandleCount;

    @NameInMap("VideoCount")
    public Integer videoCount;

    @NameInMap("VideoFrameCount")
    public Integer videoFrameCount;

    @NameInMap("VoiceAntispamUnhandleCount")
    public Integer voiceAntispamUnhandleCount;

    public static DescribeOssIncrementOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementOverviewResponseBody self = new DescribeOssIncrementOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementOverviewResponseBody setAdUnhandleCount(Integer adUnhandleCount) {
        this.adUnhandleCount = adUnhandleCount;
        return this;
    }
    public Integer getAdUnhandleCount() {
        return this.adUnhandleCount;
    }

    public DescribeOssIncrementOverviewResponseBody setAudioCount(Integer audioCount) {
        this.audioCount = audioCount;
        return this;
    }
    public Integer getAudioCount() {
        return this.audioCount;
    }

    public DescribeOssIncrementOverviewResponseBody setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public DescribeOssIncrementOverviewResponseBody setLiveUnhandleCount(Integer liveUnhandleCount) {
        this.liveUnhandleCount = liveUnhandleCount;
        return this;
    }
    public Integer getLiveUnhandleCount() {
        return this.liveUnhandleCount;
    }

    public DescribeOssIncrementOverviewResponseBody setPornUnhandleCount(Integer pornUnhandleCount) {
        this.pornUnhandleCount = pornUnhandleCount;
        return this;
    }
    public Integer getPornUnhandleCount() {
        return this.pornUnhandleCount;
    }

    public DescribeOssIncrementOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssIncrementOverviewResponseBody setTerrorismUnhandleCount(Integer terrorismUnhandleCount) {
        this.terrorismUnhandleCount = terrorismUnhandleCount;
        return this;
    }
    public Integer getTerrorismUnhandleCount() {
        return this.terrorismUnhandleCount;
    }

    public DescribeOssIncrementOverviewResponseBody setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Integer getVideoCount() {
        return this.videoCount;
    }

    public DescribeOssIncrementOverviewResponseBody setVideoFrameCount(Integer videoFrameCount) {
        this.videoFrameCount = videoFrameCount;
        return this;
    }
    public Integer getVideoFrameCount() {
        return this.videoFrameCount;
    }

    public DescribeOssIncrementOverviewResponseBody setVoiceAntispamUnhandleCount(Integer voiceAntispamUnhandleCount) {
        this.voiceAntispamUnhandleCount = voiceAntispamUnhandleCount;
        return this;
    }
    public Integer getVoiceAntispamUnhandleCount() {
        return this.voiceAntispamUnhandleCount;
    }

}
