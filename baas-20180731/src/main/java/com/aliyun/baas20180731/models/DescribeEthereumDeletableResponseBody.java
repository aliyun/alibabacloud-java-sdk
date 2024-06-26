// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeEthereumDeletableResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumDeletableResponseBody self = new DescribeEthereumDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumDeletableResponseBody setResult(DescribeEthereumDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeEthereumDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeEthereumDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumDeletableResponseBodyResult extends TeaModel {
        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("EthereumId")
        public String ethereumId;

        public static DescribeEthereumDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumDeletableResponseBodyResult self = new DescribeEthereumDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public DescribeEthereumDeletableResponseBodyResult setEthereumId(String ethereumId) {
            this.ethereumId = ethereumId;
            return this;
        }
        public String getEthereumId() {
            return this.ethereumId;
        }

    }

}
