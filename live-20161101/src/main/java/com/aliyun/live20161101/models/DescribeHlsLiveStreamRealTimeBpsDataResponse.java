// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHlsLiveStreamRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("Time")
    @Validation(required = true)
    public String time;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UsageData")
    @Validation(required = true)
    public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData> usageData;

    public static DescribeHlsLiveStreamRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHlsLiveStreamRealTimeBpsDataResponse self = new DescribeHlsLiveStreamRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse setUsageData(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData> usageData) {
        this.usageData = usageData;
        return this;
    }
    public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData> getUsageData() {
        return this.usageData;
    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos extends TeaModel {
        @NameInMap("DownFlow")
        @Validation(required = true)
        public Float downFlow;

        @NameInMap("Rate")
        @Validation(required = true)
        public String rate;

        @NameInMap("Online")
        @Validation(required = true)
        public Float online;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos self = new DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos setDownFlow(Float downFlow) {
            this.downFlow = downFlow;
            return this;
        }
        public Float getDownFlow() {
            return this.downFlow;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos setOnline(Float online) {
            this.online = online;
            return this;
        }
        public Float getOnline() {
            return this.online;
        }

    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos extends TeaModel {
        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("Infos")
        @Validation(required = true)
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos> infos;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos self = new DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos setInfos(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos> infos) {
            this.infos = infos;
            return this;
        }
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfosInfos> getInfos() {
            return this.infos;
        }

    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("StreamInfos")
        @Validation(required = true)
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos> streamInfos;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData self = new DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseUsageData setStreamInfos(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos> streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseUsageDataStreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

    }

}
