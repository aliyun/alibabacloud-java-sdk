// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeVerifyTokenResponseBodyResultObject resultObject;

    public static DescribeVerifyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenResponseBody self = new DescribeVerifyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVerifyTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVerifyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyTokenResponseBody setResultObject(DescribeVerifyTokenResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyTokenResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyTokenResponseBodyResultObject extends TeaModel {
        @NameInMap("VerifyPageUrl")
        public String verifyPageUrl;

        @NameInMap("VerifyToken")
        public String verifyToken;

        public static DescribeVerifyTokenResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyTokenResponseBodyResultObject self = new DescribeVerifyTokenResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyTokenResponseBodyResultObject setVerifyPageUrl(String verifyPageUrl) {
            this.verifyPageUrl = verifyPageUrl;
            return this;
        }
        public String getVerifyPageUrl() {
            return this.verifyPageUrl;
        }

        public DescribeVerifyTokenResponseBodyResultObject setVerifyToken(String verifyToken) {
            this.verifyToken = verifyToken;
            return this;
        }
        public String getVerifyToken() {
            return this.verifyToken;
        }

    }

}
