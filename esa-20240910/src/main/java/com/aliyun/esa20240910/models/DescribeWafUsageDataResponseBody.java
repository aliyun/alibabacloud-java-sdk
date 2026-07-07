// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeWafUsageDataResponseBody extends TeaModel {
    /**
     * <p>The end of the time range for the returned data. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-10T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-10T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("UsageData")
    public java.util.List<DescribeWafUsageDataResponseBodyUsageData> usageData;

    public static DescribeWafUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafUsageDataResponseBody self = new DescribeWafUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWafUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeWafUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWafUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeWafUsageDataResponseBody setUsageData(java.util.List<DescribeWafUsageDataResponseBodyUsageData> usageData) {
        this.usageData = usageData;
        return this;
    }
    public java.util.List<DescribeWafUsageDataResponseBodyUsageData> getUsageData() {
        return this.usageData;
    }

    public static class DescribeWafUsageDataResponseBodyUsageData extends TeaModel {
        /**
         * <p>The number of requests with normal access.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AccessCount")
        public Long accessCount;

        /**
         * <p>The number of blocked requests.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BlockCount")
        public Long blockCount;

        /**
         * <p>The number of observed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ObserveCount")
        public Long observeCount;

        /**
         * <p>The domain record name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>The beginning of the time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-10T00:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeWafUsageDataResponseBodyUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWafUsageDataResponseBodyUsageData self = new DescribeWafUsageDataResponseBodyUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeWafUsageDataResponseBodyUsageData setAccessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }
        public Long getAccessCount() {
            return this.accessCount;
        }

        public DescribeWafUsageDataResponseBodyUsageData setBlockCount(Long blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Long getBlockCount() {
            return this.blockCount;
        }

        public DescribeWafUsageDataResponseBodyUsageData setObserveCount(Long observeCount) {
            this.observeCount = observeCount;
            return this;
        }
        public Long getObserveCount() {
            return this.observeCount;
        }

        public DescribeWafUsageDataResponseBodyUsageData setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public DescribeWafUsageDataResponseBodyUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
