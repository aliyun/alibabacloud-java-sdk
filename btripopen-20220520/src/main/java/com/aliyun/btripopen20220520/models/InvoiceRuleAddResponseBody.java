// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleAddResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InvoiceRuleAddResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InvoiceRuleAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleAddResponseBody self = new InvoiceRuleAddResponseBody();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleAddResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvoiceRuleAddResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvoiceRuleAddResponseBody setModule(InvoiceRuleAddResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InvoiceRuleAddResponseBodyModule getModule() {
        return this.module;
    }

    public InvoiceRuleAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvoiceRuleAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvoiceRuleAddResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InvoiceRuleAddResponseBodyModule extends TeaModel {
        @NameInMap("add_num")
        public Integer addNum;

        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        public static InvoiceRuleAddResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InvoiceRuleAddResponseBodyModule self = new InvoiceRuleAddResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InvoiceRuleAddResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public InvoiceRuleAddResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

    }

}
