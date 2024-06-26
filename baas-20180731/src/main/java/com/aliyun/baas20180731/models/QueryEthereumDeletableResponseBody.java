// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryEthereumDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryEthereumDeletableResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEthereumDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEthereumDeletableResponseBody self = new QueryEthereumDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEthereumDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public QueryEthereumDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEthereumDeletableResponseBody setResult(QueryEthereumDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryEthereumDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public QueryEthereumDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEthereumDeletableResponseBodyResult extends TeaModel {
        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("EthereumId")
        public String ethereumId;

        public static QueryEthereumDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryEthereumDeletableResponseBodyResult self = new QueryEthereumDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryEthereumDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public QueryEthereumDeletableResponseBodyResult setEthereumId(String ethereumId) {
            this.ethereumId = ethereumId;
            return this;
        }
        public String getEthereumId() {
            return this.ethereumId;
        }

    }

}
