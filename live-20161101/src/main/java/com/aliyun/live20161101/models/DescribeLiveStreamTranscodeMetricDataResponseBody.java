// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeMetricDataResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-11T02:46:40Z</p>
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
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-11T03:46:40Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The data array returned.</p>
     */
    @NameInMap("StreamDetailData")
    public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData streamDetailData;

    public static DescribeLiveStreamTranscodeMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeMetricDataResponseBody self = new DescribeLiveStreamTranscodeMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeMetricDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamTranscodeMetricDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamTranscodeMetricDataResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeLiveStreamTranscodeMetricDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamTranscodeMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamTranscodeMetricDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamTranscodeMetricDataResponseBody setStreamDetailData(DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData streamDetailData) {
        this.streamDetailData = streamDetailData;
        return this;
    }
    public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData getStreamDetailData() {
        return this.streamDetailData;
    }

    public static class DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The frame rate.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><!-- -->
         * 
         * <!-- -->
         * 
         * <p>normal</p>
         * <!-- -->
         * </li>
         * <li><!-- -->
         * 
         * <!-- -->
         * 
         * <p>high</p>
         * <!-- -->
         * </li>
         * <li><!-- -->
         * 
         * <!-- -->
         * 
         * <p>def</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The resolution. Valid values:</p>
         * <ul>
         * <li>2K: 2K resolution</li>
         * <li>4K: 4K resolution</li>
         * <li>LD: low definition</li>
         * <li>SD: standard definition</li>
         * <li>HD: high definition</li>
         * <li>def: audio</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4K</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The name of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>stream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-11T02:45:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The transcoding type. Valid values:</p>
         * <ul>
         * <li>H264STD: standard transcoding based on H.264</li>
         * <li>H264NBHD: Narrowband HD™ transcoding based on H.264</li>
         * <li>H265STD: standard transcoding based on H.265</li>
         * <li>AUDIO: audio transcoding</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H264STD</p>
         */
        @NameInMap("TranscodeType")
        public String transcodeType;

        public static DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData self = new DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData setTranscodeType(String transcodeType) {
            this.transcodeType = transcodeType;
            return this;
        }
        public String getTranscodeType() {
            return this.transcodeType;
        }

    }

    public static class DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData extends TeaModel {
        @NameInMap("StreamData")
        public java.util.List<DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData> streamData;

        public static DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData self = new DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailData setStreamData(java.util.List<DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData> streamData) {
            this.streamData = streamData;
            return this;
        }
        public java.util.List<DescribeLiveStreamTranscodeMetricDataResponseBodyStreamDetailDataStreamData> getStreamData() {
            return this.streamData;
        }

    }

}
