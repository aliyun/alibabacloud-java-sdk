// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleSaveResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InvoiceRuleSaveResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static InvoiceRuleSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleSaveResponseBody self = new InvoiceRuleSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleSaveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvoiceRuleSaveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvoiceRuleSaveResponseBody setModule(InvoiceRuleSaveResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InvoiceRuleSaveResponseBodyModule getModule() {
        return this.module;
    }

    public InvoiceRuleSaveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvoiceRuleSaveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvoiceRuleSaveResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InvoiceRuleSaveResponseBodyModule extends TeaModel {
        @NameInMap("add_num")
        public Integer addNum;

        @NameInMap("remove_num")
        public Integer removeNum;

        public static InvoiceRuleSaveResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InvoiceRuleSaveResponseBodyModule self = new InvoiceRuleSaveResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InvoiceRuleSaveResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public InvoiceRuleSaveResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

    }

}
