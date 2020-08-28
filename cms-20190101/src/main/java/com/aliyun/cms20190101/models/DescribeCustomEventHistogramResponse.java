// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventHistogramResponse extends TeaModel {
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

    @NameInMap("EventHistograms")
    @Validation(required = true)
    public DescribeCustomEventHistogramResponseEventHistograms eventHistograms;

    public static DescribeCustomEventHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventHistogramResponse self = new DescribeCustomEventHistogramResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCustomEventHistogramResponseEventHistogramsEventHistogram extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        public static DescribeCustomEventHistogramResponseEventHistogramsEventHistogram build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventHistogramResponseEventHistogramsEventHistogram self = new DescribeCustomEventHistogramResponseEventHistogramsEventHistogram();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCustomEventHistogramResponseEventHistograms extends TeaModel {
        @NameInMap("EventHistogram")
        @Validation(required = true)
        public java.util.List<DescribeCustomEventHistogramResponseEventHistogramsEventHistogram> eventHistogram;

        public static DescribeCustomEventHistogramResponseEventHistograms build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventHistogramResponseEventHistograms self = new DescribeCustomEventHistogramResponseEventHistograms();
            return TeaModel.build(map, self);
        }

    }

}
