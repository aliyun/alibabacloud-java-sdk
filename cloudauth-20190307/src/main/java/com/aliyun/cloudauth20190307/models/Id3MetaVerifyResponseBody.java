// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 indicates success, others indicate failure.
     * <strong>Important</strong></p>
     * <ul>
     * <li>This parameter indicates whether the interface was called correctly. For detailed return code explanations, please refer to the error codes.</li>
     * <li>Check the business verification result through the fields in <code>ResultObject</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Interface call return message.</p>
     * <p><strong>Important</strong></p>
     * <p>This parameter only indicates whether there was an exception with the interface.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF03****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object.</p>
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
         * <p>Identity verification result:</p>
         * <ul>
         * <li>1: Consistent</li>
         * <li>2: Inconsistent</li>
         * <li>3: No record found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Image comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;verifyScore&quot;: 50.28594166529785
         * }</p>
         */
        @NameInMap("FaceDetail")
        public String faceDetail;

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

    }

}
