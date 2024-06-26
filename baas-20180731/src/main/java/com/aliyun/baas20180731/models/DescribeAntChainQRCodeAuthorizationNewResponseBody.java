// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainQRCodeAuthorizationNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainQRCodeAuthorizationNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationNewResponseBody self = new DescribeAntChainQRCodeAuthorizationNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setResult(DescribeAntChainQRCodeAuthorizationNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainQRCodeAuthorizationNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainQRCodeAuthorizationNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainQRCodeAuthorizationNewResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("QRCodeType")
        public String QRCodeType;

        public static DescribeAntChainQRCodeAuthorizationNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainQRCodeAuthorizationNewResponseBodyResult self = new DescribeAntChainQRCodeAuthorizationNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainQRCodeAuthorizationNewResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainQRCodeAuthorizationNewResponseBodyResult setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public DescribeAntChainQRCodeAuthorizationNewResponseBodyResult setQRCodeType(String QRCodeType) {
            this.QRCodeType = QRCodeType;
            return this;
        }
        public String getQRCodeType() {
            return this.QRCodeType;
        }

    }

}
