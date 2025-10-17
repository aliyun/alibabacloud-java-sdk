// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialGetResultIntlResponseBody extends TeaModel {
    /**
     * <p>Return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("Result")
    public CredentialGetResultIntlResponseBodyResult result;

    public static CredentialGetResultIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialGetResultIntlResponseBody self = new CredentialGetResultIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialGetResultIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialGetResultIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialGetResultIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialGetResultIntlResponseBody setResult(CredentialGetResultIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CredentialGetResultIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class CredentialGetResultIntlResponseBodyResult extends TeaModel {
        /**
         * <p>Identified key information, in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;address&quot;: &quot;&quot;,
         *   &quot;name&quot;:&quot;&quot;
         * }</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>Task status:</p>
         * <ul>
         * <li>PROCESSING: In progress (please continue polling)</li>
         * <li>SUCCESS: Execution succeeded</li>
         * <li>FAILED: Execution failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Authentication result description. For more information, see ResultObject.SubCode error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static CredentialGetResultIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CredentialGetResultIntlResponseBodyResult self = new CredentialGetResultIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CredentialGetResultIntlResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public CredentialGetResultIntlResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CredentialGetResultIntlResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
