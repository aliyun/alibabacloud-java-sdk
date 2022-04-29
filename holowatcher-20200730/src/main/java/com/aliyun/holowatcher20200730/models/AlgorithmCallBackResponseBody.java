// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmCallBackResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AlgorithmCallBackResponseBodyResult result;

    public static AlgorithmCallBackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmCallBackResponseBody self = new AlgorithmCallBackResponseBody();
        return TeaModel.build(map, self);
    }

    public AlgorithmCallBackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AlgorithmCallBackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AlgorithmCallBackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AlgorithmCallBackResponseBody setResult(AlgorithmCallBackResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AlgorithmCallBackResponseBodyResult getResult() {
        return this.result;
    }

    public static class AlgorithmCallBackResponseBodyResult extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static AlgorithmCallBackResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmCallBackResponseBodyResult self = new AlgorithmCallBackResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AlgorithmCallBackResponseBodyResult setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
