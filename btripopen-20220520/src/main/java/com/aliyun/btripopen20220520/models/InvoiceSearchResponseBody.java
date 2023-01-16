// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<InvoiceSearchResponseBodyModule> module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InvoiceSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvoiceSearchResponseBody self = new InvoiceSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public InvoiceSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvoiceSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvoiceSearchResponseBody setModule(java.util.List<InvoiceSearchResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<InvoiceSearchResponseBodyModule> getModule() {
        return this.module;
    }

    public InvoiceSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvoiceSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvoiceSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InvoiceSearchResponseBodyModule extends TeaModel {
        /**
         * <p>ID</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        @NameInMap("title")
        public String title;

        public static InvoiceSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InvoiceSearchResponseBodyModule self = new InvoiceSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InvoiceSearchResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public InvoiceSearchResponseBodyModule setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public InvoiceSearchResponseBodyModule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
