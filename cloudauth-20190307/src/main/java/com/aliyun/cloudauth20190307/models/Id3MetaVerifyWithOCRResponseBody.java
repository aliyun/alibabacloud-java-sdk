// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyWithOCRResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates success. Other values indicate failure. <strong>Important</strong></p>
     * <ul>
     * <li>This parameter indicates only whether the API call was made correctly. For more information about return codes, see error codes.</li>
     * <li>Check the fields in ResultObject for the business verification result.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message of the API call. This parameter indicates only whether an exception occurred during the API call.</p>
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
    public Id3MetaVerifyWithOCRResponseBodyResultObject resultObject;

    public static Id3MetaVerifyWithOCRResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyWithOCRResponseBody self = new Id3MetaVerifyWithOCRResponseBody();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyWithOCRResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id3MetaVerifyWithOCRResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id3MetaVerifyWithOCRResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id3MetaVerifyWithOCRResponseBody setResultObject(Id3MetaVerifyWithOCRResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Id3MetaVerifyWithOCRResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Id3MetaVerifyWithOCRResponseBodyResultObject extends TeaModel {
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

        /**
         * <p>The face comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;verifyScore&quot;: 50.28594166529785
         * }</p>
         */
        @NameInMap("FaceDetail")
        public String faceDetail;

        public static Id3MetaVerifyWithOCRResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Id3MetaVerifyWithOCRResponseBodyResultObject self = new Id3MetaVerifyWithOCRResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Id3MetaVerifyWithOCRResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Id3MetaVerifyWithOCRResponseBodyResultObject setCardInfo(String cardInfo) {
            this.cardInfo = cardInfo;
            return this;
        }
        public String getCardInfo() {
            return this.cardInfo;
        }

        public Id3MetaVerifyWithOCRResponseBodyResultObject setFaceDetail(String faceDetail) {
            this.faceDetail = faceDetail;
            return this;
        }
        public String getFaceDetail() {
            return this.faceDetail;
        }

    }

}
