// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMonitorListResponseBody extends TeaModel {
    @NameInMap("LiveStreamMonitorList")
    public java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList> liveStreamMonitorList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static DescribeLiveStreamMonitorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMonitorListResponseBody self = new DescribeLiveStreamMonitorListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMonitorListResponseBody setLiveStreamMonitorList(java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList> liveStreamMonitorList) {
        this.liveStreamMonitorList = liveStreamMonitorList;
        return this;
    }
    public java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList> getLiveStreamMonitorList() {
        return this.liveStreamMonitorList;
    }

    public DescribeLiveStreamMonitorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamMonitorListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig extends TeaModel {
        @NameInMap("FillMode")
        public String fillMode;

        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        @NameInMap("PositionRefer")
        public String positionRefer;

        @NameInMap("SizeNormalized")
        public java.util.List<Float> sizeNormalized;

        public static DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig self = new DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig setPositionNormalized(java.util.List<Float> positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public java.util.List<Float> getPositionNormalized() {
            return this.positionNormalized;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig setSizeNormalized(java.util.List<Float> sizeNormalized) {
            this.sizeNormalized = sizeNormalized;
            return this;
        }
        public java.util.List<Float> getSizeNormalized() {
            return this.sizeNormalized;
        }

    }

    public static class DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig extends TeaModel {
        @NameInMap("VolumeRate")
        public Float volumeRate;

        public static DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig self = new DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

    }

    public static class DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("InputUrl")
        public String inputUrl;

        @NameInMap("LayoutConfig")
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig layoutConfig;

        @NameInMap("LayoutId")
        public Integer layoutId;

        @NameInMap("PlayConfig")
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig playConfig;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList self = new DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList setLayoutConfig(DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig layoutConfig) {
            this.layoutConfig = layoutConfig;
            return this;
        }
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig getLayoutConfig() {
            return this.layoutConfig;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList setLayoutId(Integer layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public Integer getLayoutId() {
            return this.layoutId;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList setPlayConfig(DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig playConfig) {
            this.playConfig = playConfig;
            return this;
        }
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig getPlayConfig() {
            return this.playConfig;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls extends TeaModel {
        @NameInMap("FlvUrl")
        public String flvUrl;

        @NameInMap("RtmpUrl")
        public String rtmpUrl;

        public static DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls self = new DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls setFlvUrl(String flvUrl) {
            this.flvUrl = flvUrl;
            return this;
        }
        public String getFlvUrl() {
            return this.flvUrl;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls setRtmpUrl(String rtmpUrl) {
            this.rtmpUrl = rtmpUrl;
            return this;
        }
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

    }

    public static class DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList extends TeaModel {
        @NameInMap("AudioFrom")
        public Integer audioFrom;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("InputList")
        public java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList> inputList;

        @NameInMap("MonitorId")
        public String monitorId;

        @NameInMap("MonitorName")
        public String monitorName;

        @NameInMap("OutputTemplate")
        public String outputTemplate;

        @NameInMap("OutputUrls")
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls outputUrls;

        @NameInMap("Region")
        public String region;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StopTime")
        public String stopTime;

        public static DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList self = new DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setAudioFrom(Integer audioFrom) {
            this.audioFrom = audioFrom;
            return this;
        }
        public Integer getAudioFrom() {
            return this.audioFrom;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setInputList(java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList> inputList) {
            this.inputList = inputList;
            return this;
        }
        public java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList> getInputList() {
            return this.inputList;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setMonitorId(String monitorId) {
            this.monitorId = monitorId;
            return this;
        }
        public String getMonitorId() {
            return this.monitorId;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setMonitorName(String monitorName) {
            this.monitorName = monitorName;
            return this;
        }
        public String getMonitorName() {
            return this.monitorName;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setOutputTemplate(String outputTemplate) {
            this.outputTemplate = outputTemplate;
            return this;
        }
        public String getOutputTemplate() {
            return this.outputTemplate;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setOutputUrls(DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls outputUrls) {
            this.outputUrls = outputUrls;
            return this;
        }
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls getOutputUrls() {
            return this.outputUrls;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

}
