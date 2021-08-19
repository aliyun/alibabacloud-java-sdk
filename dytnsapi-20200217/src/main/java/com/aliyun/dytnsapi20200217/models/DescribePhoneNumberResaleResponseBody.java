// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberResaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TwiceTelVerify")
    public DescribePhoneNumberResaleResponseBodyTwiceTelVerify twiceTelVerify;

    public static DescribePhoneNumberResaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberResaleResponseBody self = new DescribePhoneNumberResaleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberResaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberResaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberResaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhoneNumberResaleResponseBody setTwiceTelVerify(DescribePhoneNumberResaleResponseBodyTwiceTelVerify twiceTelVerify) {
        this.twiceTelVerify = twiceTelVerify;
        return this;
    }
    public DescribePhoneNumberResaleResponseBodyTwiceTelVerify getTwiceTelVerify() {
        return this.twiceTelVerify;
    }

    public static class DescribePhoneNumberResaleResponseBodyTwiceTelVerify extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("VerifyResult")
        public Integer verifyResult;

        public static DescribePhoneNumberResaleResponseBodyTwiceTelVerify build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberResaleResponseBodyTwiceTelVerify self = new DescribePhoneNumberResaleResponseBodyTwiceTelVerify();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberResaleResponseBodyTwiceTelVerify setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneNumberResaleResponseBodyTwiceTelVerify setVerifyResult(Integer verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Integer getVerifyResult() {
            return this.verifyResult;
        }

    }

}
