// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatestBlocksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static DescribeLatestBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestBlocksResponseBody self = new DescribeLatestBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLatestBlocksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLatestBlocksResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
