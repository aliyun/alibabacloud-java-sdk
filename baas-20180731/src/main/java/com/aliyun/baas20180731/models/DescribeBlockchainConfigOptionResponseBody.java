// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainConfigOptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static DescribeBlockchainConfigOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainConfigOptionResponseBody self = new DescribeBlockchainConfigOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainConfigOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainConfigOptionResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
