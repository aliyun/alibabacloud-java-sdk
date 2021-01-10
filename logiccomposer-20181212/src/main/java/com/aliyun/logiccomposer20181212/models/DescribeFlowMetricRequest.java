// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    public static DescribeFlowMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowMetricRequest self = new DescribeFlowMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowMetricRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
