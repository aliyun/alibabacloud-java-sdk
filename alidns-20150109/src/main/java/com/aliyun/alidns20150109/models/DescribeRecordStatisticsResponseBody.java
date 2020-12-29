// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.List<DescribeRecordStatisticsResponseBodyStatistics> statistics;

    public static DescribeRecordStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsResponseBody self = new DescribeRecordStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordStatisticsResponseBody setStatistics(java.util.List<DescribeRecordStatisticsResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeRecordStatisticsResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeRecordStatisticsResponseBodyStatistics extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Count")
        public Long count;

        public static DescribeRecordStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsResponseBodyStatistics self = new DescribeRecordStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsResponseBodyStatistics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeRecordStatisticsResponseBodyStatistics setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
