// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. Other values indicate failure.</p>
     * <p><strong>Important</strong></p>
     * <ul>
     * <li>This parameter indicates only whether the API call is successful. For more information about return codes, see error codes.</li>
     * <li>Check the fields in ResultObject for the business verification result.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message of the API call.</p>
     * <p><strong>Important</strong></p>
     * <p>This parameter indicates only whether the API call is abnormal.</p>
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
    public Id3MetaVerifyResponseBodyResultObject resultObject;

    public static Id3MetaVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyResponseBody self = new Id3MetaVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id3MetaVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id3MetaVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id3MetaVerifyResponseBody setResultObject(Id3MetaVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Id3MetaVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Id3MetaVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>The identity verification result. Valid values:</p>
         * <ul>
         * <li>1: Consistent.</li>
         * <li>2: Inconsistent.</li>
         * <li>3: No record found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

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

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static Id3MetaVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Id3MetaVerifyResponseBodyResultObject self = new Id3MetaVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Id3MetaVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Id3MetaVerifyResponseBodyResultObject setFaceDetail(String faceDetail) {
            this.faceDetail = faceDetail;
            return this;
        }
        public String getFaceDetail() {
            return this.faceDetail;
        }

        public Id3MetaVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
