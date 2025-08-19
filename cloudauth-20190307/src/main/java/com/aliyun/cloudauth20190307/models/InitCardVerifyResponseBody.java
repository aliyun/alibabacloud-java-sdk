// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.
     * Important</p>
     * <ul>
     * <li>This parameter indicates whether the interface was called correctly. For detailed return code descriptions, see the error codes.</li>
     * <li>Business results should be viewed through the fields in ResultObject.</li>
     * </ul>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("ResultObject")
    public InitCardVerifyResponseBodyResultObject resultObject;

    public static InitCardVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitCardVerifyResponseBody self = new InitCardVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public InitCardVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitCardVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitCardVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitCardVerifyResponseBody setResultObject(InitCardVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitCardVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class InitCardVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification request ID, a unique identifier for the verification service\&quot;s authentication request.</p>
         * <ul>
         * <li><p>When querying the authentication result, the authentication request ID must be provided.</p>
         * </li>
         * <li><p>The CertifyId field is a billing statistics field. To facilitate subsequent bill reconciliation, please retain this field information locally. The CertifyId returned by the initialization interface is valid for 30 minutes and can only be submitted once for authentication. Please apply it within the validity period to avoid reuse.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>91707dc296d469ad38e4c5efa6a0****</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        public static InitCardVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitCardVerifyResponseBodyResultObject self = new InitCardVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public InitCardVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
