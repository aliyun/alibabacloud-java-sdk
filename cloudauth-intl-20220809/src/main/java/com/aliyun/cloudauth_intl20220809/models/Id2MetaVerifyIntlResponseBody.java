// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyIntlResponseBody extends TeaModel {
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
     * <strong>example:</strong>
     * <p>EFA11401-C961-5E89-A2D3-BF9883E5CC3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Id2MetaVerifyIntlResponseBodyResult result;

    public static Id2MetaVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyIntlResponseBody self = new Id2MetaVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id2MetaVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id2MetaVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id2MetaVerifyIntlResponseBody setResult(Id2MetaVerifyIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public Id2MetaVerifyIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class Id2MetaVerifyIntlResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        public static Id2MetaVerifyIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            Id2MetaVerifyIntlResponseBodyResult self = new Id2MetaVerifyIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public Id2MetaVerifyIntlResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

    }

}
