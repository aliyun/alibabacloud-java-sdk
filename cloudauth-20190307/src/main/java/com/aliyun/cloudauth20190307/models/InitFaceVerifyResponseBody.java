// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates success. Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
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
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result object.</p>
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
         * <p>The unique identifier for ID Verification.</p>
         * 
         * <strong>example:</strong>
         * <p>91707dc296d469ad38e4c5efa6a0f24b</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>The URL for performing ID Verification in a web browser. After authentication is complete, the page redirects based on the ReturnUrl parameter.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li><p>The CertifyUrl returned by the initialization operation is <strong>valid for 30 minutes and can be submitted for authentication only once</strong>. Use it within the validity period and do not reuse it.</p>
         * </li>
         * <li><p>This parameter requires the <strong>MetaInfo</strong> parameter to be correctly passed in to return a CertifyUrl that matches the client. If the URL cannot be obtained, check whether <strong>MetaInfo</strong> and other input parameters are correct.</p>
         * </li>
         * <li><p>The domain name of this URL may change with service updates. To ensure normal service availability, do not apply access control to this domain name.</p>
         * </li>
         * <li><p>Do not use incognito mode or modify the URL during browser redirection. Otherwise, a <strong>signature exception</strong> error may occur.</p>
         * </li>
         * </ul>
         * <p>.</p>
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
