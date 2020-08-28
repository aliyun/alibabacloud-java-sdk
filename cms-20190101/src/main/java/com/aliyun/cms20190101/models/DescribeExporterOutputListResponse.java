// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterOutputListResponse extends TeaModel {
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
    public DescribeExporterOutputListResponseDatapoints datapoints;

    public static DescribeExporterOutputListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterOutputListResponse self = new DescribeExporterOutputListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeExporterOutputListResponseDatapointsDatapointConfigJson extends TeaModel {
        @NameInMap("logstore")
        @Validation(required = true)
        public String logstore;

        @NameInMap("project")
        @Validation(required = true)
        public String project;

        @NameInMap("endpoint")
        @Validation(required = true)
        public String endpoint;

        @NameInMap("as")
        @Validation(required = true)
        public String as;

        @NameInMap("ak")
        @Validation(required = true)
        public String ak;

        public static DescribeExporterOutputListResponseDatapointsDatapointConfigJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterOutputListResponseDatapointsDatapointConfigJson self = new DescribeExporterOutputListResponseDatapointsDatapointConfigJson();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeExporterOutputListResponseDatapointsDatapoint extends TeaModel {
        @NameInMap("DestName")
        @Validation(required = true)
        public String destName;

        @NameInMap("DestType")
        @Validation(required = true)
        public String destType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ConfigJson")
        @Validation(required = true)
        public DescribeExporterOutputListResponseDatapointsDatapointConfigJson configJson;

        public static DescribeExporterOutputListResponseDatapointsDatapoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterOutputListResponseDatapointsDatapoint self = new DescribeExporterOutputListResponseDatapointsDatapoint();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeExporterOutputListResponseDatapoints extends TeaModel {
        @NameInMap("Datapoint")
        @Validation(required = true)
        public java.util.List<DescribeExporterOutputListResponseDatapointsDatapoint> datapoint;

        public static DescribeExporterOutputListResponseDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterOutputListResponseDatapoints self = new DescribeExporterOutputListResponseDatapoints();
            return TeaModel.build(map, self);
        }

    }

}
