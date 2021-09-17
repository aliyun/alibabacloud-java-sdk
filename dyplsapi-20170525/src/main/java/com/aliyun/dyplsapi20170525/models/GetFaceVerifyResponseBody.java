// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetFaceVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetFaceVerifyResponseBodyData data;

    public static GetFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFaceVerifyResponseBody self = new GetFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFaceVerifyResponseBody setData(GetFaceVerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFaceVerifyResponseBodyData getData() {
        return this.data;
    }

    public static class GetFaceVerifyResponseBodyData extends TeaModel {
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static GetFaceVerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFaceVerifyResponseBodyData self = new GetFaceVerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFaceVerifyResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
