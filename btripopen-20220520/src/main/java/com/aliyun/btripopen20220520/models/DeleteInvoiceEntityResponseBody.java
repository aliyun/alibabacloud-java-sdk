// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteInvoiceEntityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public DeleteInvoiceEntityResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static DeleteInvoiceEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvoiceEntityResponseBody self = new DeleteInvoiceEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInvoiceEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInvoiceEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteInvoiceEntityResponseBody setModule(DeleteInvoiceEntityResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public DeleteInvoiceEntityResponseBodyModule getModule() {
        return this.module;
    }

    public DeleteInvoiceEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInvoiceEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteInvoiceEntityResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteInvoiceEntityResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("remove_num")
        public Integer removeNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("selected_user_num")
        public Integer selectedUserNum;

        public static DeleteInvoiceEntityResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            DeleteInvoiceEntityResponseBodyModule self = new DeleteInvoiceEntityResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public DeleteInvoiceEntityResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public DeleteInvoiceEntityResponseBodyModule setSelectedUserNum(Integer selectedUserNum) {
            this.selectedUserNum = selectedUserNum;
            return this;
        }
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

    }

}
