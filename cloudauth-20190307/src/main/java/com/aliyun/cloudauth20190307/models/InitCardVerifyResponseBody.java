// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success, and other values indicate failure.
     * Important:</p>
     * <ul>
     * <li>This parameter indicates whether the API is called successfully. For more information about return codes, see Error codes.</li>
     * <li>To view the business result, check the fields in ResultObject.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
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
     * <p>The returned result.</p>
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
         * <p>The verification request ID, which is the unique identifier of the authentication request in the verification service.</p>
         * <ul>
         * <li>When you query the authentication result, you must specify the authentication request ID.</li>
         * <li>The CertifyId field is used for billing statistics. To facilitate subsequent bill reconciliation, store the field information locally. The CertifyId returned by the initialization API is valid for 30 minutes and can be submitted for authentication only once. Use it within the validity period to avoid repeated use.</li>
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
