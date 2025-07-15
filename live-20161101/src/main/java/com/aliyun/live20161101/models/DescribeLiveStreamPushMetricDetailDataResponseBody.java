// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamPushMetricDetailDataResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range that was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>A pagination token. When you call this operation, up to 5,000 rows of data can be returned per query. If the number of rows exceeds 5,000, the response includes a pagination token that is used in the next request to retrieve a new page of results.</p>
     * <p>When you specify the token in the next query, data continues to be obtained from the end of the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>UjsM9x3aVcJi9a0-ArwJUTTC67C***37C0=</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of rows returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5EBF2AC3-4B73-40A5-8B32-83F49D5F035E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The data array returned.</p>
     */
    @NameInMap("StreamDetailData")
    public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData streamDetailData;

    public static DescribeLiveStreamPushMetricDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamPushMetricDetailDataResponseBody self = new DescribeLiveStreamPushMetricDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamPushMetricDetailDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamPushMetricDetailDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamPushMetricDetailDataResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeLiveStreamPushMetricDetailDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamPushMetricDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamPushMetricDetailDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamPushMetricDetailDataResponseBody setStreamDetailData(DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData streamDetailData) {
        this.streamDetailData = streamDetailData;
        return this;
    }
    public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData getStreamDetailData() {
        return this.streamDetailData;
    }

    public static class DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The total bandwidth consumed by the stream per minute. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>423304182</p>
         */
        @NameInMap("ReqBps")
        public Float reqBps;

        /**
         * <p>The total amount of traffic consumed by the stream per minute. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>423304182.66</p>
         */
        @NameInMap("ReqTraffic")
        public Long reqTraffic;

        /**
         * <p>The name of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>test.flv</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData self = new DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData setReqBps(Float reqBps) {
            this.reqBps = reqBps;
            return this;
        }
        public Float getReqBps() {
            return this.reqBps;
        }

        public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData setReqTraffic(Long reqTraffic) {
            this.reqTraffic = reqTraffic;
            return this;
        }
        public Long getReqTraffic() {
            return this.reqTraffic;
        }

        public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData extends TeaModel {
        @NameInMap("StreamData")
        public java.util.List<DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData> streamData;

        public static DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData self = new DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailData setStreamData(java.util.List<DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData> streamData) {
            this.streamData = streamData;
            return this;
        }
        public java.util.List<DescribeLiveStreamPushMetricDetailDataResponseBodyStreamDetailDataStreamData> getStreamData() {
            return this.streamData;
        }

    }

}
