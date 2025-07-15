// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHlsLiveStreamRealTimeBpsDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>17C16B18-D3EA-4809-9CC3-8A2CBE14BC7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp for which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-08-08T00:00:00Z</p>
     */
    @NameInMap("Time")
    public String time;

    /**
     * <p>The usage data.</p>
     */
    @NameInMap("UsageData")
    public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData> usageData;

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

    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody setUsageData(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData> usageData) {
        this.usageData = usageData;
        return this;
    }
    public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData> getUsageData() {
        return this.usageData;
    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos extends TeaModel {
        /**
         * <p>The bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>11440.88</p>
         */
        @NameInMap("DownFlow")
        public Float downFlow;

        /**
         * <p>The number of online users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Online")
        public Float online;

        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1028</p>
         */
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
        /**
         * <p>The statistics on the HLS stream.</p>
         */
        @NameInMap("Infos")
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos> infos;

        /**
         * <p>The name of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>/live/sport.m3u8</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos self = new DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos setInfos(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos> infos) {
            this.infos = infos;
            return this;
        }
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfosInfos> getInfos() {
            return this.infos;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Details about the statistics on each HLS stream under the domain name.</p>
         */
        @NameInMap("StreamInfos")
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos> streamInfos;

        public static DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData self = new DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageData setStreamInfos(java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos> streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public java.util.List<DescribeHlsLiveStreamRealTimeBpsDataResponseBodyUsageDataStreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

    }

}
