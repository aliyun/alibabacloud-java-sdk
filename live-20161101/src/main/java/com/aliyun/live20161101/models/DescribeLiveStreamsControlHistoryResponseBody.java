// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsControlHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ControlInfo")
    public DescribeLiveStreamsControlHistoryResponseBodyControlInfo controlInfo;

    public static DescribeLiveStreamsControlHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsControlHistoryResponseBody self = new DescribeLiveStreamsControlHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsControlHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsControlHistoryResponseBody setControlInfo(DescribeLiveStreamsControlHistoryResponseBodyControlInfo controlInfo) {
        this.controlInfo = controlInfo;
        return this;
    }
    public DescribeLiveStreamsControlHistoryResponseBodyControlInfo getControlInfo() {
        return this.controlInfo;
    }

    public static class DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("ClientIP")
        public String clientIP;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo self = new DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveStreamsControlHistoryResponseBodyControlInfo extends TeaModel {
        @NameInMap("LiveStreamControlInfo")
        public java.util.List<DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo> liveStreamControlInfo;

        public static DescribeLiveStreamsControlHistoryResponseBodyControlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsControlHistoryResponseBodyControlInfo self = new DescribeLiveStreamsControlHistoryResponseBodyControlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsControlHistoryResponseBodyControlInfo setLiveStreamControlInfo(java.util.List<DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo> liveStreamControlInfo) {
            this.liveStreamControlInfo = liveStreamControlInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsControlHistoryResponseBodyControlInfoLiveStreamControlInfo> getLiveStreamControlInfo() {
            return this.liveStreamControlInfo;
        }

    }

}
