// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainCreationConfigOptionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static DescribeBlockchainCreationConfigOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainCreationConfigOptionsResponseBody self = new DescribeBlockchainCreationConfigOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainCreationConfigOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainCreationConfigOptionsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
