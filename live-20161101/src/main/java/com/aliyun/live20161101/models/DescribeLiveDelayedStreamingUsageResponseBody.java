// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDelayedStreamingUsageResponseBody extends TeaModel {
    /**
     * <p>The details about the stream delay usage data.</p>
     */
    @NameInMap("DelayData")
    public DescribeLiveDelayedStreamingUsageResponseBodyDelayData delayData;

    /**
     * <p>The end of the time range during which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDelayedStreamingUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDelayedStreamingUsageResponseBody self = new DescribeLiveDelayedStreamingUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDelayedStreamingUsageResponseBody setDelayData(DescribeLiveDelayedStreamingUsageResponseBodyDelayData delayData) {
        this.delayData = delayData;
        return this;
    }
    public DescribeLiveDelayedStreamingUsageResponseBodyDelayData getDelayData() {
        return this.delayData;
    }

    public DescribeLiveDelayedStreamingUsageResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDelayedStreamingUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDelayedStreamingUsageResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem extends TeaModel {
        /**
         * <p>The domain name. If SplitBy is set to domain, the data returned is grouped by domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The duration of stream delay.</p>
         * 
         * <strong>example:</strong>
         * <p>84</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The ID of the region. If SplitBy is set to region, the data returned is grouped by region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The name of the stream. If SplitBy is set to stream, the data returned is grouped by stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem self = new DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDelayedStreamingUsageResponseBodyDelayData extends TeaModel {
        @NameInMap("DelayDataItem")
        public java.util.List<DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem> delayDataItem;

        public static DescribeLiveDelayedStreamingUsageResponseBodyDelayData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDelayedStreamingUsageResponseBodyDelayData self = new DescribeLiveDelayedStreamingUsageResponseBodyDelayData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDelayedStreamingUsageResponseBodyDelayData setDelayDataItem(java.util.List<DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem> delayDataItem) {
            this.delayDataItem = delayDataItem;
            return this;
        }
        public java.util.List<DescribeLiveDelayedStreamingUsageResponseBodyDelayDataDelayDataItem> getDelayDataItem() {
            return this.delayDataItem;
        }

    }

}
