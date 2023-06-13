// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeWorkflowActivityRequest extends TeaModel {
    @NameInMap("WorkFlowId")
    public String workFlowId;

    public static DescribeWorkflowActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowActivityRequest self = new DescribeWorkflowActivityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowActivityRequest setWorkFlowId(String workFlowId) {
        this.workFlowId = workFlowId;
        return this;
    }
    public String getWorkFlowId() {
        return this.workFlowId;
    }

}
