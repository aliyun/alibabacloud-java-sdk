// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestTransactionDigestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static DescribeAntChainLatestTransactionDigestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestTransactionDigestsResponseBody self = new DescribeAntChainLatestTransactionDigestsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestTransactionDigestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainLatestTransactionDigestsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
