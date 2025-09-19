// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyIntlResponseBody extends TeaModel {
    /**
     * <p><a href="https://www.alibabacloud.com/help/en/ekyc/latest/ok4bwxwmu1n94o76?spm=a2c63.p38356.0.i54#942707fca218x">Status codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed description of the response code.</p>
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
     * <p>EFA11401-C961-5E89-A2D3-BF9883E5CC3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result</p>
     */
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
         * <p>The verification result:</p>
         * <ul>
         * <li><p>1: The information is consistent. This result is billable.</p>
         * </li>
         * <li><p>2: The information is inconsistent. This result is billable.</p>
         * </li>
         * <li><p>3: No record is found. This result is not billable.</p>
         * </li>
         * </ul>
         * 
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
