// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetFaceVerifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetFaceVerifyResponseData data;

    public static GetFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceVerifyResponse self = new GetFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFaceVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFaceVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFaceVerifyResponse setData(GetFaceVerifyResponseData data) {
        this.data = data;
        return this;
    }
    public GetFaceVerifyResponseData getData() {
        return this.data;
    }

    public static class GetFaceVerifyResponseData extends TeaModel {
        @NameInMap("VerifyResult")
        @Validation(required = true)
        public String verifyResult;

        public static GetFaceVerifyResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFaceVerifyResponseData self = new GetFaceVerifyResponseData();
            return TeaModel.build(map, self);
        }

        public GetFaceVerifyResponseData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
