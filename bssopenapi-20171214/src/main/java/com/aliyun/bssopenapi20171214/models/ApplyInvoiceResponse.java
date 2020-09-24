// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public ApplyInvoiceResponseData data;

    public static ApplyInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceResponse self = new ApplyInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyInvoiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyInvoiceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyInvoiceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyInvoiceResponse setData(ApplyInvoiceResponseData data) {
        this.data = data;
        return this;
    }
    public ApplyInvoiceResponseData getData() {
        return this.data;
    }

    public static class ApplyInvoiceResponseData extends TeaModel {
        @NameInMap("InvoiceApplyId")
        @Validation(required = true)
        public Long invoiceApplyId;

        public static ApplyInvoiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ApplyInvoiceResponseData self = new ApplyInvoiceResponseData();
            return TeaModel.build(map, self);
        }

        public ApplyInvoiceResponseData setInvoiceApplyId(Long invoiceApplyId) {
            this.invoiceApplyId = invoiceApplyId;
            return this;
        }
        public Long getInvoiceApplyId() {
            return this.invoiceApplyId;
        }

    }

}
