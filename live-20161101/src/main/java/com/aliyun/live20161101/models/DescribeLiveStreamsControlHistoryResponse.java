// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsControlHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ControlInfo")
    @Validation(required = true)
    public DescribeLiveStreamsControlHistoryResponseControlInfo controlInfo;

    public static DescribeLiveStreamsControlHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsControlHistoryResponse self = new DescribeLiveStreamsControlHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsControlHistoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsControlHistoryResponse setControlInfo(DescribeLiveStreamsControlHistoryResponseControlInfo controlInfo) {
        this.controlInfo = controlInfo;
        return this;
    }
    public DescribeLiveStreamsControlHistoryResponseControlInfo getControlInfo() {
        return this.controlInfo;
    }

    public static class DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo extends TeaModel {
        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("ClientIP")
        @Validation(required = true)
        public String clientIP;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo self = new DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveStreamsControlHistoryResponseControlInfo extends TeaModel {
        @NameInMap("LiveStreamControlInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo> liveStreamControlInfo;

        public static DescribeLiveStreamsControlHistoryResponseControlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsControlHistoryResponseControlInfo self = new DescribeLiveStreamsControlHistoryResponseControlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsControlHistoryResponseControlInfo setLiveStreamControlInfo(java.util.List<DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo> liveStreamControlInfo) {
            this.liveStreamControlInfo = liveStreamControlInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsControlHistoryResponseControlInfoLiveStreamControlInfo> getLiveStreamControlInfo() {
            return this.liveStreamControlInfo;
        }

    }

}
