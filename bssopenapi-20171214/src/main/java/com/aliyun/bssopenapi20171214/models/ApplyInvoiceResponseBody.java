// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ApplyInvoiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ApplyInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceResponseBody self = new ApplyInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyInvoiceResponseBody setData(ApplyInvoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyInvoiceResponseBodyData getData() {
        return this.data;
    }

    public ApplyInvoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyInvoiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyInvoiceResponseBodyData extends TeaModel {
        @NameInMap("InvoiceApplyId")
        public Long invoiceApplyId;

        public static ApplyInvoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyInvoiceResponseBodyData self = new ApplyInvoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyInvoiceResponseBodyData setInvoiceApplyId(Long invoiceApplyId) {
            this.invoiceApplyId = invoiceApplyId;
            return this;
        }
        public Long getInvoiceApplyId() {
            return this.invoiceApplyId;
        }

    }

}
