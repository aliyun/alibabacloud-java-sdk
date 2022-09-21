// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneTwiceTelVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneTwiceTelVerifyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneTwiceTelVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneTwiceTelVerifyResponseBody self = new DescribePhoneTwiceTelVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneTwiceTelVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setData(DescribePhoneTwiceTelVerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneTwiceTelVerifyResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneTwiceTelVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneTwiceTelVerifyResponseBodyData extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("VerifyResult")
        public String verifyResult;

        public static DescribePhoneTwiceTelVerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneTwiceTelVerifyResponseBodyData self = new DescribePhoneTwiceTelVerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneTwiceTelVerifyResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneTwiceTelVerifyResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
