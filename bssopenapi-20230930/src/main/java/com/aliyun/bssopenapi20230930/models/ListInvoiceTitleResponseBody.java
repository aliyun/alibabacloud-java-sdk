// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListInvoiceTitleResponseBody extends TeaModel {
    /**
     * <p>Invoice title list</p>
     */
    @NameInMap("Data")
    public java.util.List<ListInvoiceTitleResponseBodyData> data;

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
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInvoiceTitleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInvoiceTitleResponseBody self = new ListInvoiceTitleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInvoiceTitleResponseBody setData(java.util.List<ListInvoiceTitleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInvoiceTitleResponseBodyData> getData() {
        return this.data;
    }

    public ListInvoiceTitleResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public ListInvoiceTitleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInvoiceTitleResponseBodyData extends TeaModel {
        /**
         * <p>Bank name.</p>
         * 
         * <strong>example:</strong>
         * <p>招商银行</p>
         */
        @NameInMap("AccountBankName")
        public String accountBankName;

        /**
         * <p>Account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>Basic bank account number.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("BankAccountNumber")
        public String bankAccountNumber;

        /**
         * <p>The time when the invoice title was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-01 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Invoice title ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Invoice title.</p>
         * 
         * <strong>example:</strong>
         * <p>xx公司</p>
         */
        @NameInMap("InvoiceTitle")
        public String invoiceTitle;

        /**
         * <p>Registered address.</p>
         * 
         * <strong>example:</strong>
         * <p>北京市朝阳区</p>
         */
        @NameInMap("RegisteredAddress")
        public String registeredAddress;

        /**
         * <p>Registered landline number.</p>
         * 
         * <strong>example:</strong>
         * <p>010-12345678</p>
         */
        @NameInMap("RegisteredLandline")
        public String registeredLandline;

        /**
         * <p>Unified social credit code. 15, 17, 18, or 20 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111111111</p>
         */
        @NameInMap("UnifiedSocialCreditCode")
        public String unifiedSocialCreditCode;

        public static ListInvoiceTitleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInvoiceTitleResponseBodyData self = new ListInvoiceTitleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInvoiceTitleResponseBodyData setAccountBankName(String accountBankName) {
            this.accountBankName = accountBankName;
            return this;
        }
        public String getAccountBankName() {
            return this.accountBankName;
        }

        public ListInvoiceTitleResponseBodyData setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListInvoiceTitleResponseBodyData setBankAccountNumber(String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }
        public String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        public ListInvoiceTitleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInvoiceTitleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInvoiceTitleResponseBodyData setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public ListInvoiceTitleResponseBodyData setRegisteredAddress(String registeredAddress) {
            this.registeredAddress = registeredAddress;
            return this;
        }
        public String getRegisteredAddress() {
            return this.registeredAddress;
        }

        public ListInvoiceTitleResponseBodyData setRegisteredLandline(String registeredLandline) {
            this.registeredLandline = registeredLandline;
            return this;
        }
        public String getRegisteredLandline() {
            return this.registeredLandline;
        }

        public ListInvoiceTitleResponseBodyData setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
            this.unifiedSocialCreditCode = unifiedSocialCreditCode;
            return this;
        }
        public String getUnifiedSocialCreditCode() {
            return this.unifiedSocialCreditCode;
        }

    }

}
