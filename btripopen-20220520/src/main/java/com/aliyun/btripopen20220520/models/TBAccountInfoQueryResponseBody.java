// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TBAccountInfoQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TBAccountInfoQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>456456575656757</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210f07f316603757445272547d959f</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TBAccountInfoQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TBAccountInfoQueryResponseBody self = new TBAccountInfoQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TBAccountInfoQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TBAccountInfoQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TBAccountInfoQueryResponseBody setModule(TBAccountInfoQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TBAccountInfoQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TBAccountInfoQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TBAccountInfoQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TBAccountInfoQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TBAccountInfoQueryResponseBodyModule extends TeaModel {
        @NameInMap("tb_account")
        public String tbAccount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("tb_bond")
        public Boolean tbBond;

        public static TBAccountInfoQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TBAccountInfoQueryResponseBodyModule self = new TBAccountInfoQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TBAccountInfoQueryResponseBodyModule setTbAccount(String tbAccount) {
            this.tbAccount = tbAccount;
            return this;
        }
        public String getTbAccount() {
            return this.tbAccount;
        }

        public TBAccountInfoQueryResponseBodyModule setTbBond(Boolean tbBond) {
            this.tbBond = tbBond;
            return this;
        }
        public Boolean getTbBond() {
            return this.tbBond;
        }

    }

}
