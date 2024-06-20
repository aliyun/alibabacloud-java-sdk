// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeEthereumDeletableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeEthereumDeletableResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Deletable")
        public Boolean deletable;

        /**
         * <strong>example:</strong>
         * <p>eth-1ilrhcav4ibdl</p>
         */
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
