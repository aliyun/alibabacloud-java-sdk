// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B52C552F-DDE6-4779-9BA2-9DD455275528</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static DescribeAntChainLatestBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestBlocksResponseBody self = new DescribeAntChainLatestBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestBlocksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainLatestBlocksResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
