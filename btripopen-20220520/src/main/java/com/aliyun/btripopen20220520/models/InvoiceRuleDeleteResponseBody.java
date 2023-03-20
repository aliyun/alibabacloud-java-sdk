// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleDeleteResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InvoiceRuleDeleteResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InvoiceRuleDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleDeleteResponseBody self = new InvoiceRuleDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleDeleteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvoiceRuleDeleteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvoiceRuleDeleteResponseBody setModule(InvoiceRuleDeleteResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InvoiceRuleDeleteResponseBodyModule getModule() {
        return this.module;
    }

    public InvoiceRuleDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvoiceRuleDeleteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvoiceRuleDeleteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InvoiceRuleDeleteResponseBodyModule extends TeaModel {
        @NameInMap("remove_num")
        public Integer removeNum;

        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        public static InvoiceRuleDeleteResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InvoiceRuleDeleteResponseBodyModule self = new InvoiceRuleDeleteResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InvoiceRuleDeleteResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public InvoiceRuleDeleteResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

    }

}
