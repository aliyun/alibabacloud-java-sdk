// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowVariableCollectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DescribeFlowVariableCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowVariableCollectionResponseBody self = new DescribeFlowVariableCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowVariableCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowVariableCollectionResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
