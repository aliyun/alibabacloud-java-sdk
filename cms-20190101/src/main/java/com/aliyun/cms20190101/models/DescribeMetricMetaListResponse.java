// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("Resources")
    @Validation(required = true)
    public DescribeMetricMetaListResponseResources resources;

    public static DescribeMetricMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListResponse self = new DescribeMetricMetaListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMetricMetaListResponseResourcesResource extends TeaModel {
        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Dimensions")
        @Validation(required = true)
        public String dimensions;

        @NameInMap("Periods")
        @Validation(required = true)
        public String periods;

        @NameInMap("Labels")
        @Validation(required = true)
        public String labels;

        public static DescribeMetricMetaListResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricMetaListResponseResourcesResource self = new DescribeMetricMetaListResponseResourcesResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricMetaListResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeMetricMetaListResponseResourcesResource> resource;

        public static DescribeMetricMetaListResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricMetaListResponseResources self = new DescribeMetricMetaListResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
