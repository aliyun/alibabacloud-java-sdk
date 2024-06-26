// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatestTransactionDigestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static DescribeLatestTransactionDigestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestTransactionDigestsResponseBody self = new DescribeLatestTransactionDigestsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLatestTransactionDigestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLatestTransactionDigestsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
