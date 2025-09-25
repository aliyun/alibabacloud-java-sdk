// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 indicates success, other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error message.</p>
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
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object.</p>
     */
    @NameInMap("ResultObject")
    public InitFaceVerifyResponseBodyResultObject resultObject;

    public static InitFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitFaceVerifyResponseBody self = new InitFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public InitFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitFaceVerifyResponseBody setResultObject(InitFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class InitFaceVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Unique identifier for real-person authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>91707dc296d469ad38e4c5efa6a0f24b</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>URL for real-person authentication in a Web browser, which will redirect according to the ReturnUrl parameter after authentication.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li><p>The CertifyUrl returned by the initialization interface is valid for <strong>30 minutes and can only be used once</strong>. Please use it within the validity period to avoid reuse.</p>
         * </li>
         * <li><p>This parameter requires the correct input of <strong>MetaInfo</strong> to return a CertifyUrl that matches the client. If you cannot obtain it, please check whether <strong>MetaInfo</strong> and other input parameters are correct.</p>
         * </li>
         * <li><p>The domain name of this URL may change with service updates. To ensure normal service availability, it is recommended not to apply access control to this domain name.</p>
         * </li>
         * <li><p>When redirecting in the browser, try not to use incognito mode or modify the URL, as this may result in a <strong>signature error</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://t.aliyun.com/">https://t.aliyun.com/</a>****</p>
         */
        @NameInMap("CertifyUrl")
        public String certifyUrl;

        public static InitFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitFaceVerifyResponseBodyResultObject self = new InitFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public InitFaceVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public InitFaceVerifyResponseBodyResultObject setCertifyUrl(String certifyUrl) {
            this.certifyUrl = certifyUrl;
            return this;
        }
        public String getCertifyUrl() {
            return this.certifyUrl;
        }

    }

}
