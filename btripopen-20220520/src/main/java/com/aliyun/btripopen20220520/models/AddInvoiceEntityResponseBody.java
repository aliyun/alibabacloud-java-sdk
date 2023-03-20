// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddInvoiceEntityResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public AddInvoiceEntityResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static AddInvoiceEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddInvoiceEntityResponseBody self = new AddInvoiceEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public AddInvoiceEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddInvoiceEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddInvoiceEntityResponseBody setModule(AddInvoiceEntityResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AddInvoiceEntityResponseBodyModule getModule() {
        return this.module;
    }

    public AddInvoiceEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddInvoiceEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddInvoiceEntityResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AddInvoiceEntityResponseBodyModule extends TeaModel {
        @NameInMap("add_num")
        public Integer addNum;

        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        public static AddInvoiceEntityResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AddInvoiceEntityResponseBodyModule self = new AddInvoiceEntityResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AddInvoiceEntityResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public AddInvoiceEntityResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

    }

}
