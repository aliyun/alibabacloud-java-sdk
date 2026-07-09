// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateInvoiceResponseBody extends TeaModel {
    /**
     * <p>Data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<CreateInvoiceResponseBodyData> data;

    /**
     * <p>Response metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInvoiceResponseBody self = new CreateInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInvoiceResponseBody setData(java.util.List<CreateInvoiceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateInvoiceResponseBodyData> getData() {
        return this.data;
    }

    public CreateInvoiceResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CreateInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateInvoiceResponseBodyData extends TeaModel {
        /**
         * <p>Account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>Invoice amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Invoice issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_SERVICE</p>
         */
        @NameInMap("InvoiceIssuer")
        public String invoiceIssuer;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>不可开票</p>
         */
        @NameInMap("Message")
        public String message;

        public static CreateInvoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateInvoiceResponseBodyData self = new CreateInvoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateInvoiceResponseBodyData setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public CreateInvoiceResponseBodyData setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public CreateInvoiceResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateInvoiceResponseBodyData setInvoiceIssuer(String invoiceIssuer) {
            this.invoiceIssuer = invoiceIssuer;
            return this;
        }
        public String getInvoiceIssuer() {
            return this.invoiceIssuer;
        }

        public CreateInvoiceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
