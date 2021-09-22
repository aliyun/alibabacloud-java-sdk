// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class TwiceTelVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TwiceTelVerifyResult")
    public TwiceTelVerifyResponseBodyTwiceTelVerifyResult twiceTelVerifyResult;

    public static TwiceTelVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TwiceTelVerifyResponseBody self = new TwiceTelVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public TwiceTelVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TwiceTelVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TwiceTelVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TwiceTelVerifyResponseBody setTwiceTelVerifyResult(TwiceTelVerifyResponseBodyTwiceTelVerifyResult twiceTelVerifyResult) {
        this.twiceTelVerifyResult = twiceTelVerifyResult;
        return this;
    }
    public TwiceTelVerifyResponseBodyTwiceTelVerifyResult getTwiceTelVerifyResult() {
        return this.twiceTelVerifyResult;
    }

    public static class TwiceTelVerifyResponseBodyTwiceTelVerifyResult extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("VerifyResult")
        public Integer verifyResult;

        public static TwiceTelVerifyResponseBodyTwiceTelVerifyResult build(java.util.Map<String, ?> map) throws Exception {
            TwiceTelVerifyResponseBodyTwiceTelVerifyResult self = new TwiceTelVerifyResponseBodyTwiceTelVerifyResult();
            return TeaModel.build(map, self);
        }

        public TwiceTelVerifyResponseBodyTwiceTelVerifyResult setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public TwiceTelVerifyResponseBodyTwiceTelVerifyResult setVerifyResult(Integer verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Integer getVerifyResult() {
            return this.verifyResult;
        }

    }

}
