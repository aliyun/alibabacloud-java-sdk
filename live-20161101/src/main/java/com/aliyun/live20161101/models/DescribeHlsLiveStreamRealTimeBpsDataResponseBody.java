// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHlsLiveStreamRealTimeBpsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsageData")
    public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData> usageData;

    @NameInMap("Time")
    public String time;

    public static DescribeHlsLiveStreamRealTimeBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHlsLiveStreamRealTimeBpsDataResponseBody self = new DescribeHlsLiveStreamRealTimeBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody setUsageData(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData> usageData) {
        this.usageData = usageData;
        return this;
    }
    public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData> getUsageData() {
        return this.usageData;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos extends TeaModel {
        @NameInMap("DownFlow")
        public Float downFlow;

        @NameInMap("Online")
        public Float online;

        @NameInMap("Rate")
        public String rate;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos self = new DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos setDownFlow(Float downFlow) {
            this.downFlow = downFlow;
            return this;
        }
        public Float getDownFlow() {
            return this.downFlow;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos setOnline(Float online) {
            this.online = online;
            return this;
        }
        public Float getOnline() {
            return this.online;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos extends TeaModel {
        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Infos")
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos> infos;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos self = new DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos setInfos(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos> infos) {
            this.infos = infos;
            return this;
        }
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos> getInfos() {
            return this.infos;
        }

    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData extends TeaModel {
        @NameInMap("StreamInfos")
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos> streamInfos;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData self = new DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData setStreamInfos(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos> streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
