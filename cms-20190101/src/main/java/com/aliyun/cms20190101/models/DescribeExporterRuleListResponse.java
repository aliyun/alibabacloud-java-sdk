// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterRuleListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Datapoints")
    @Validation(required = true)
    public DescribeExporterRuleListResponseDatapoints datapoints;

    public static DescribeExporterRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterRuleListResponse self = new DescribeExporterRuleListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeExporterRuleListResponseDatapointsDatapointDstName extends TeaModel {
        @NameInMap("DstName")
        @Validation(required = true)
        public java.util.List<String> dstName;

        public static DescribeExporterRuleListResponseDatapointsDatapointDstName build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterRuleListResponseDatapointsDatapointDstName self = new DescribeExporterRuleListResponseDatapointsDatapointDstName();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeExporterRuleListResponseDatapointsDatapoint extends TeaModel {
        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Enabled")
        @Validation(required = true)
        public Boolean enabled;

        @NameInMap("TargetWindows")
        @Validation(required = true)
        public String targetWindows;

        @NameInMap("Describe")
        @Validation(required = true)
        public String describe;

        @NameInMap("Dimension")
        @Validation(required = true)
        public String dimension;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("DstName")
        @Validation(required = true)
        public DescribeExporterRuleListResponseDatapointsDatapointDstName dstName;

        public static DescribeExporterRuleListResponseDatapointsDatapoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterRuleListResponseDatapointsDatapoint self = new DescribeExporterRuleListResponseDatapointsDatapoint();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeExporterRuleListResponseDatapoints extends TeaModel {
        @NameInMap("Datapoint")
        @Validation(required = true)
        public java.util.List<DescribeExporterRuleListResponseDatapointsDatapoint> datapoint;

        public static DescribeExporterRuleListResponseDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterRuleListResponseDatapoints self = new DescribeExporterRuleListResponseDatapoints();
            return TeaModel.build(map, self);
        }

    }

}
