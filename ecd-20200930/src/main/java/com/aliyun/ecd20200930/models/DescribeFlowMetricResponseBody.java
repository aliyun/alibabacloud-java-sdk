// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowMetricResponseBody self = new DescribeFlowMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowMetricResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeFlowMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
