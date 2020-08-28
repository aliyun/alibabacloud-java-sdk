// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Statistics")
    @Validation(required = true)
    public DescribeRecordStatisticsResponseStatistics statistics;

    public static DescribeRecordStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsResponse self = new DescribeRecordStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRecordStatisticsResponseStatisticsStatistic extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeRecordStatisticsResponseStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsResponseStatisticsStatistic self = new DescribeRecordStatisticsResponseStatisticsStatistic();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRecordStatisticsResponseStatistics extends TeaModel {
        @NameInMap("Statistic")
        @Validation(required = true)
        public java.util.List<DescribeRecordStatisticsResponseStatisticsStatistic> statistic;

        public static DescribeRecordStatisticsResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsResponseStatistics self = new DescribeRecordStatisticsResponseStatistics();
            return TeaModel.build(map, self);
        }

    }

}
