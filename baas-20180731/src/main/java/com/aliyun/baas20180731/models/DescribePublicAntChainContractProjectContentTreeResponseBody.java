// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicAntChainContractProjectContentTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePublicAntChainContractProjectContentTreeResponseBodyResult result;

    public static DescribePublicAntChainContractProjectContentTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicAntChainContractProjectContentTreeResponseBody self = new DescribePublicAntChainContractProjectContentTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePublicAntChainContractProjectContentTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublicAntChainContractProjectContentTreeResponseBody setResult(DescribePublicAntChainContractProjectContentTreeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePublicAntChainContractProjectContentTreeResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribePublicAntChainContractProjectContentTreeResponseBodyResult extends TeaModel {
        @NameInMap("Children")
        public java.util.List<java.util.Map<String, ?>> children;

        public static DescribePublicAntChainContractProjectContentTreeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePublicAntChainContractProjectContentTreeResponseBodyResult self = new DescribePublicAntChainContractProjectContentTreeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePublicAntChainContractProjectContentTreeResponseBodyResult setChildren(java.util.List<java.util.Map<String, ?>> children) {
            this.children = children;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

    }

}
