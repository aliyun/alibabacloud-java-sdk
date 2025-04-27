// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyWithOCRResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF03****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public Id2MetaVerifyWithOCRResponseBodyResultObject resultObject;

    public static Id2MetaVerifyWithOCRResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyWithOCRResponseBody self = new Id2MetaVerifyWithOCRResponseBody();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyWithOCRResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id2MetaVerifyWithOCRResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id2MetaVerifyWithOCRResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id2MetaVerifyWithOCRResponseBody setResultObject(Id2MetaVerifyWithOCRResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Id2MetaVerifyWithOCRResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Id2MetaVerifyWithOCRResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("CardInfo")
        public String cardInfo;

        public static Id2MetaVerifyWithOCRResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Id2MetaVerifyWithOCRResponseBodyResultObject self = new Id2MetaVerifyWithOCRResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Id2MetaVerifyWithOCRResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Id2MetaVerifyWithOCRResponseBodyResultObject setCardInfo(String cardInfo) {
            this.cardInfo = cardInfo;
            return this;
        }
        public String getCardInfo() {
            return this.cardInfo;
        }

    }

}
