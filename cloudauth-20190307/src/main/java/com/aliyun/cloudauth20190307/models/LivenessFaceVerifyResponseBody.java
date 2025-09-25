// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class LivenessFaceVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code, <strong>200</strong> indicates successful API response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("ResultObject")
    public LivenessFaceVerifyResponseBodyResultObject resultObject;

    public static LivenessFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LivenessFaceVerifyResponseBody self = new LivenessFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public LivenessFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LivenessFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LivenessFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LivenessFaceVerifyResponseBody setResultObject(LivenessFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public LivenessFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class LivenessFaceVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Unique identifier for the real-person authentication request.</p>
         * 
         * <strong>example:</strong>
         * <p>91707dc296d469ad38e4c5efa6a0f24b</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Attachment information of the face authentication subject, including data such as face quality, face attack, face or OCR image, and intent verification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;faceAttack&quot;: &quot;F&quot;,&quot;facialPictureFront&quot;: {&quot;qualityScore&quot;: 88.3615493774414,&quot;verifyScore&quot;: 50.28594166529785}}</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <p>Authentication result, values:</p>
         * <ul>
         * <li><p>T: Passed</p>
         * </li>
         * <li><p>F: Not passed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Authentication result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static LivenessFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            LivenessFaceVerifyResponseBodyResultObject self = new LivenessFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public LivenessFaceVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public LivenessFaceVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public LivenessFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public LivenessFaceVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
