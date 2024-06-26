// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionQRCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DescribeTransactionQRCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionQRCodeResponseBody self = new DescribeTransactionQRCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionQRCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransactionQRCodeResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
