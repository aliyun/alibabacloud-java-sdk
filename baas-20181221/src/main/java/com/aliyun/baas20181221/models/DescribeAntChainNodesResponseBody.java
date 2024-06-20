// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainNodesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BA9738FE-F427-44FD-A1D9-EB4EFB43075A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static DescribeAntChainNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainNodesResponseBody self = new DescribeAntChainNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainNodesResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
