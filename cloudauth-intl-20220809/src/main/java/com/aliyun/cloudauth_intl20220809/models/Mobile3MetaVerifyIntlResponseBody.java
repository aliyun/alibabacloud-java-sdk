// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile3MetaVerifyIntlResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>D241532C-4EE9-5A2A-A5A5-C1FD98CE2EDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result</p>
     */
    @NameInMap("Result")
    public Mobile3MetaVerifyIntlResponseBodyResult result;

    public static Mobile3MetaVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaVerifyIntlResponseBody self = new Mobile3MetaVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile3MetaVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile3MetaVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile3MetaVerifyIntlResponseBody setResult(Mobile3MetaVerifyIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public Mobile3MetaVerifyIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class Mobile3MetaVerifyIntlResponseBodyResult extends TeaModel {
        /**
         * <p>Verification result code.</p>
         * <ul>
         * <li>1: Verification consistent</li>
         * <li>2: Verification inconsistent</li>
         * <li>3: No record found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>ISP name</p>
         * <ul>
         * <li>CMCC: China Mobile</li>
         * <li>CUCC: China Unicom</li>
         * <li>CTCC: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Detailed verification results</p>
         * <ul>
         * <li>101: Verification passed </li>
         * <li>201: Mobile number and name do not match, mobile number and ID number do not match </li>
         * <li>202: Mobile number and name match, but mobile number and ID number do not match </li>
         * <li>203: Mobile number and ID number match, but mobile number and name do not match </li>
         * <li>204: Other inconsistencies</li>
         * <li>301: No record found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static Mobile3MetaVerifyIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            Mobile3MetaVerifyIntlResponseBodyResult self = new Mobile3MetaVerifyIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public Mobile3MetaVerifyIntlResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile3MetaVerifyIntlResponseBodyResult setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public Mobile3MetaVerifyIntlResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
