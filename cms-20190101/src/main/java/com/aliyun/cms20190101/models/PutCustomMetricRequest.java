// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRequest extends TeaModel {
    @NameInMap("MetricList")
    @Validation(required = true)
    public java.util.List<PutCustomMetricRequestMetricList> metricList;

    public static PutCustomMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricRequest self = new PutCustomMetricRequest();
        return TeaModel.build(map, self);
    }

    public static class PutCustomMetricRequestMetricList extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        @NameInMap("Period")
        public String period;

        public static PutCustomMetricRequestMetricList build(java.util.Map<String, ?> map) throws Exception {
            PutCustomMetricRequestMetricList self = new PutCustomMetricRequestMetricList();
            return TeaModel.build(map, self);
        }

    }

}
