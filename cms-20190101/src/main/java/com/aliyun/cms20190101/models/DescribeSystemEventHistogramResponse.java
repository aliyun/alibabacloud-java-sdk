// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("SystemEventHistograms")
    @Validation(required = true)
    public DescribeSystemEventHistogramResponseSystemEventHistograms systemEventHistograms;

    public static DescribeSystemEventHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventHistogramResponse self = new DescribeSystemEventHistogramResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSystemEventHistogramResponseSystemEventHistogramsSystemEventHistogram extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        public static DescribeSystemEventHistogramResponseSystemEventHistogramsSystemEventHistogram build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventHistogramResponseSystemEventHistogramsSystemEventHistogram self = new DescribeSystemEventHistogramResponseSystemEventHistogramsSystemEventHistogram();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSystemEventHistogramResponseSystemEventHistograms extends TeaModel {
        @NameInMap("SystemEventHistogram")
        @Validation(required = true)
        public java.util.List<DescribeSystemEventHistogramResponseSystemEventHistogramsSystemEventHistogram> systemEventHistogram;

        public static DescribeSystemEventHistogramResponseSystemEventHistograms build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventHistogramResponseSystemEventHistograms self = new DescribeSystemEventHistogramResponseSystemEventHistograms();
            return TeaModel.build(map, self);
        }

    }

}
