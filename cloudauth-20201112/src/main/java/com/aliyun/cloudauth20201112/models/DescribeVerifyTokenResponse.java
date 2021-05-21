// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public DescribeVerifyTokenResponseResultObject resultObject;

    public static DescribeVerifyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenResponse self = new DescribeVerifyTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyTokenResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVerifyTokenResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVerifyTokenResponse setResultObject(DescribeVerifyTokenResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyTokenResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyTokenResponseResultObject extends TeaModel {
        @NameInMap("VerifyPageUrl")
        @Validation(required = true)
        public String verifyPageUrl;

        @NameInMap("VerifyToken")
        @Validation(required = true)
        public String verifyToken;

        public static DescribeVerifyTokenResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyTokenResponseResultObject self = new DescribeVerifyTokenResponseResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyTokenResponseResultObject setVerifyPageUrl(String verifyPageUrl) {
            this.verifyPageUrl = verifyPageUrl;
            return this;
        }
        public String getVerifyPageUrl() {
            return this.verifyPageUrl;
        }

        public DescribeVerifyTokenResponseResultObject setVerifyToken(String verifyToken) {
            this.verifyToken = verifyToken;
            return this;
        }
        public String getVerifyToken() {
            return this.verifyToken;
        }

    }

}
