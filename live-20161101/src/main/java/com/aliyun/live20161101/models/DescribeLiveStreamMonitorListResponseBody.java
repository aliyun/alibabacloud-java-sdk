// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMonitorListResponseBody extends TeaModel {
    /**
     * <p>The list of monitoring sessions.</p>
     */
    @NameInMap("LiveStreamMonitorList")
    public java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList> liveStreamMonitorList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2234baba-a586-46ea-8bd4-c8f7891abcdef</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of monitoring sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The fill type. Set this value to none.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("FillMode")
        public String fillMode;

        /**
         * <p>The position of the layer, in the format of [unk][x,y][unk]. The values of x and y need to be normalized.</p>
         */
        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        /**
         * <p>The reference position of the element. Valid values:</p>
         * <ul>
         * <li>topLeft</li>
         * <li>topRight</li>
         * <li>bottomLeft</li>
         * <li>bottomRight</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topLeft</p>
         */
        @NameInMap("PositionRefer")
        public String positionRefer;

        /**
         * <p>The size of the layer. Unit: bytes.</p>
         */
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
        /**
         * <p>The volume. Valid values: 0 to 1. The value is rounded to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.50</p>
         */
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
        /**
         * <p>The index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The URL of the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>The layout information.</p>
         */
        @NameInMap("LayoutConfig")
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListLayoutConfig layoutConfig;

        /**
         * <p>The layout ID, which must start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LayoutId")
        public Integer layoutId;

        /**
         * <p>The playback configurations.</p>
         */
        @NameInMap("PlayConfig")
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputListPlayConfig playConfig;

        /**
         * <p>The display name of the monitored stream.</p>
         * 
         * <strong>example:</strong>
         * <p>monitorStream****</p>
         */
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
        /**
         * <p>The output URL in the Flash Video (FLV) format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.aliyundoc.com/monitor/445409ec-7eaa-461d-8f29-4bec2eb9****.flv">http://demo.aliyundoc.com/monitor/445409ec-7eaa-461d-8f29-4bec2eb9****.flv</a></p>
         */
        @NameInMap("FlvUrl")
        public String flvUrl;

        /**
         * <p>The output URL in the Real-Time Messaging Protocol (RTMP) format.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://demo.aliyundoc.com/monitor/445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
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
        /**
         * <p>The audio source in the layout.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AudioFrom")
        public Integer audioFrom;

        /**
         * <p>The callback URL that sends monitoring alerts.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The URL of the DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa">https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa</a>****</p>
         */
        @NameInMap("DingTalkWebHookUrl")
        public String dingTalkWebHookUrl;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The list of monitored input streams.</p>
         */
        @NameInMap("InputList")
        public java.util.List<DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListInputList> inputList;

        /**
         * <p>The monitoring alert thresholds. The following fields are included:</p>
         * <ul>
         * <li>fpsLowThres: the video frame rate alert threshold. The value is a floating-point number.</li>
         * <li>brHighThres: the audio/video bitrate alert threshold. The value is a floating-point number.</li>
         * <li>eofDurationThresSec: the interruption duration alert threshold. The value is a floating-point number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;fpsLowThres\&quot;: 0.6,\&quot;brLowThres\&quot;: 1.1,\&quot;eofDurationThresSec\&quot;: 10}&quot;</p>
         */
        @NameInMap("MonitorConfig")
        public String monitorConfig;

        /**
         * <p>The ID of the monitoring session.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        @NameInMap("MonitorId")
        public String monitorId;

        /**
         * <p>The name of the monitoring session.</p>
         * 
         * <strong>example:</strong>
         * <p>liveMonito****</p>
         */
        @NameInMap("MonitorName")
        public String monitorName;

        /**
         * <p>The output resolution template. Valid values:</p>
         * <ul>
         * <li><strong>lp_ld</strong>: low definition</li>
         * <li><strong>lp_sd</strong>: standard definition</li>
         * <li><strong>lp_hd</strong>: high definition</li>
         * <li><strong>lp_ud</strong>: ultra-high definition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lp_ud</p>
         */
        @NameInMap("OutputTemplate")
        public String outputTemplate;

        /**
         * <p>The output URLs.</p>
         */
        @NameInMap("OutputUrls")
        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorListOutputUrls outputUrls;

        /**
         * <p>The ID of the region. Valid values:</p>
         * <ul>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-beijing: China (Beijing)</li>
         * <li>ap-southeast-1: Singapore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The start time of live monitoring. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the monitoring session. Valid values:</p>
         * <ul>
         * <li>1: Monitoring</li>
         * <li>0: Unmonitored</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The end time of live monitoring. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
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

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setDingTalkWebHookUrl(String dingTalkWebHookUrl) {
            this.dingTalkWebHookUrl = dingTalkWebHookUrl;
            return this;
        }
        public String getDingTalkWebHookUrl() {
            return this.dingTalkWebHookUrl;
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

        public DescribeLiveStreamMonitorListResponseBodyLiveStreamMonitorList setMonitorConfig(String monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public String getMonitorConfig() {
            return this.monitorConfig;
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
