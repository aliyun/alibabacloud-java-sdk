// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainConfigOptionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static DescribeAntChainConfigOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConfigOptionsResponseBody self = new DescribeAntChainConfigOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConfigOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainConfigOptionsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
