// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyWithOCRResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. Any other value indicates failure.
     * <strong>Important</strong></p>
     * <ul>
     * <li>This parameter indicates only whether the API call was made correctly. For detailed response codes, see error codes.</li>
     * <li>Check the fields in ResultObject for the business verification result.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message of the API call.
     * <strong>Important</strong>
     * This parameter indicates only whether the API call is abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF03****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result object.</p>
     */
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
         * <p>The identity verification result. Valid values:</p>
         * <ul>
         * <li>1: consistent.</li>
         * <li>2: inconsistent.</li>
         * <li>3: no record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>{&quot;address&quot;:&quot;浙江省杭州市余*****&quot;,&quot;birthDate&quot;:&quot;19901226&quot;,&quot;certName&quot;:&quot;张三&quot;,&quot;certNo&quot;:&quot;1234561990122*****&quot;,&quot;nationality&quot;:&quot;汉&quot;,&quot;authority&quot;:&quot;xxx公安局&quot;,&quot;startDate&quot;:&quot;20201130&quot;,&quot;endDate&quot;:&quot;20301130&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>OCR读取的身份证信息。</p>
         */
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
