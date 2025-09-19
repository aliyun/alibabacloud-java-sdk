// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile2MetaVerifyIntlResponseBody extends TeaModel {
    /**
     * <p><a href="https://www.alibabacloud.com/help/en/ekyc/latest/mobile-2meta?spm=a2c63.p38356.0.i13#cbf2539971xzr">Status codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A detailed description of the response code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result</p>
     */
    @NameInMap("Result")
    public Mobile2MetaVerifyIntlResponseBodyResult result;

    public static Mobile2MetaVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile2MetaVerifyIntlResponseBody self = new Mobile2MetaVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile2MetaVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile2MetaVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile2MetaVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile2MetaVerifyIntlResponseBody setResult(Mobile2MetaVerifyIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public Mobile2MetaVerifyIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class Mobile2MetaVerifyIntlResponseBodyResult extends TeaModel {
        /**
         * <p>The verification result:</p>
         * <ul>
         * <li><p>1: The information is consistent. (Billed)</p>
         * </li>
         * <li><p>2: The information is inconsistent. (Billed)</p>
         * </li>
         * <li><p>3: No record is found. (Not billed)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The carrier name:</p>
         * <ul>
         * <li><p>CMCC: China Mobile</p>
         * </li>
         * <li><p>CUCC: China Unicom</p>
         * </li>
         * <li><p>CTCC: China Telecom</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static Mobile2MetaVerifyIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            Mobile2MetaVerifyIntlResponseBodyResult self = new Mobile2MetaVerifyIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public Mobile2MetaVerifyIntlResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile2MetaVerifyIntlResponseBodyResult setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

}
