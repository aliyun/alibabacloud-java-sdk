// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile2MetaVerifyIntlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
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
