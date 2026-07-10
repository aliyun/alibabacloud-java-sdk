// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. Other values indicate failure.</p>
     * <blockquote>
     * <p><strong>Important</strong> This parameter indicates whether the operation is called correctly. For more information about return codes, see error codes. Check the fields in ResultObject for the business result.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
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
         * <p>The verification request ID, which is the unique identifier of the verification service authentication request.</p>
         * <ul>
         * <li><p>You must specify the authentication request ID when you query the authentication result.</p>
         * </li>
         * <li><p>The CertifyId field is used for billing statistics. Save this field locally for future bill reconciliation. The CertifyId returned by the initialization operation is valid for 30 minutes and can be submitted for authentication only once. Use it within the validity period and do not reuse it.</p>
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
