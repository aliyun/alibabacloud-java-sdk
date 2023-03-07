// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInvoicingCustomerListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryInvoicingCustomerListResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryInvoicingCustomerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoicingCustomerListResponseBody self = new QueryInvoicingCustomerListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInvoicingCustomerListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInvoicingCustomerListResponseBody setData(QueryInvoicingCustomerListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInvoicingCustomerListResponseBodyData getData() {
        return this.data;
    }

    public QueryInvoicingCustomerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInvoicingCustomerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInvoicingCustomerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice extends TeaModel {
        /**
         * <p>The type of invoice that was changed to.</p>
         */
        @NameInMap("AdjustType")
        public Long adjustType;

        /**
         * <p>The bank that issues the invoice.</p>
         */
        @NameInMap("Bank")
        public String bank;

        /**
         * <p>The bank account number.</p>
         */
        @NameInMap("BankNo")
        public String bankNo;

        /**
         * <p>The authentication type of Alipay. Valid values:</p>
         * <br>
         * <p>*   1: individual</p>
         * <p>*   2: company</p>
         */
        @NameInMap("CustomerType")
        public Long customerType;

        /**
         * <p>The default note that is attached when the title is specified.</p>
         */
        @NameInMap("DefaultRemark")
        public String defaultRemark;

        /**
         * <p>The time when the payment ended.</p>
         */
        @NameInMap("EndCycle")
        public Long endCycle;

        /**
         * <p>The time when the invoice was created. The time was in the yyyy-mm-dd hh:mm:ss format.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The ID of the invoice.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The company name in the invoice title.</p>
         */
        @NameInMap("InvoiceTitle")
        public String invoiceTitle;

        /**
         * <p>The type of issue.</p>
         */
        @NameInMap("IssueType")
        public Long issueType;

        /**
         * <p>The address of the business license.</p>
         */
        @NameInMap("OperatingLicenseAddress")
        public String operatingLicenseAddress;

        /**
         * <p>The phone number of the business license.</p>
         */
        @NameInMap("OperatingLicensePhone")
        public String operatingLicensePhone;

        /**
         * <p>The tax registration number.</p>
         */
        @NameInMap("RegisterNo")
        public String registerNo;

        /**
         * <p>The time when the payment started.</p>
         */
        @NameInMap("StartCycle")
        public Long startCycle;

        /**
         * <p>The status of the invoice title.</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The path and file name of the scanned copy of the tax registration certificate.</p>
         */
        @NameInMap("TaxationLicense")
        public String taxationLicense;

        /**
         * <p>The type of the taxpayer. Valid values:</p>
         * <br>
         * <p>*   1: general taxpayer</p>
         * <p>*   2: special taxpayer</p>
         */
        @NameInMap("TaxpayerType")
        public Long taxpayerType;

        /**
         * <p>The instruction document of the invoice title change.</p>
         */
        @NameInMap("TitleChangeInstructions")
        public String titleChangeInstructions;

        /**
         * <p>The type of the invoice. Valid values:</p>
         * <br>
         * <p>*   0: plain value-added tax (VAT) invoice</p>
         * <p>*   1: special VAT invoice</p>
         */
        @NameInMap("Type")
        public Long type;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user.</p>
         */
        @NameInMap("UserNick")
        public String userNick;

        public static QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice self = new QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice();
            return TeaModel.build(map, self);
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setAdjustType(Long adjustType) {
            this.adjustType = adjustType;
            return this;
        }
        public Long getAdjustType() {
            return this.adjustType;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setBank(String bank) {
            this.bank = bank;
            return this;
        }
        public String getBank() {
            return this.bank;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setBankNo(String bankNo) {
            this.bankNo = bankNo;
            return this;
        }
        public String getBankNo() {
            return this.bankNo;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setCustomerType(Long customerType) {
            this.customerType = customerType;
            return this;
        }
        public Long getCustomerType() {
            return this.customerType;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setDefaultRemark(String defaultRemark) {
            this.defaultRemark = defaultRemark;
            return this;
        }
        public String getDefaultRemark() {
            return this.defaultRemark;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setEndCycle(Long endCycle) {
            this.endCycle = endCycle;
            return this;
        }
        public Long getEndCycle() {
            return this.endCycle;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setIssueType(Long issueType) {
            this.issueType = issueType;
            return this;
        }
        public Long getIssueType() {
            return this.issueType;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setOperatingLicenseAddress(String operatingLicenseAddress) {
            this.operatingLicenseAddress = operatingLicenseAddress;
            return this;
        }
        public String getOperatingLicenseAddress() {
            return this.operatingLicenseAddress;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setOperatingLicensePhone(String operatingLicensePhone) {
            this.operatingLicensePhone = operatingLicensePhone;
            return this;
        }
        public String getOperatingLicensePhone() {
            return this.operatingLicensePhone;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setRegisterNo(String registerNo) {
            this.registerNo = registerNo;
            return this;
        }
        public String getRegisterNo() {
            return this.registerNo;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setStartCycle(Long startCycle) {
            this.startCycle = startCycle;
            return this;
        }
        public Long getStartCycle() {
            return this.startCycle;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setTaxationLicense(String taxationLicense) {
            this.taxationLicense = taxationLicense;
            return this;
        }
        public String getTaxationLicense() {
            return this.taxationLicense;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setTaxpayerType(Long taxpayerType) {
            this.taxpayerType = taxpayerType;
            return this;
        }
        public Long getTaxpayerType() {
            return this.taxpayerType;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setTitleChangeInstructions(String titleChangeInstructions) {
            this.titleChangeInstructions = titleChangeInstructions;
            return this;
        }
        public String getTitleChangeInstructions() {
            return this.titleChangeInstructions;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList extends TeaModel {
        @NameInMap("CustomerInvoice")
        public java.util.List<QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice> customerInvoice;

        public static QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList self = new QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList();
            return TeaModel.build(map, self);
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList setCustomerInvoice(java.util.List<QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice> customerInvoice) {
            this.customerInvoice = customerInvoice;
            return this;
        }
        public java.util.List<QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice> getCustomerInvoice() {
            return this.customerInvoice;
        }

    }

    public static class QueryInvoicingCustomerListResponseBodyData extends TeaModel {
        /**
         * <p>The information about the invoice.</p>
         */
        @NameInMap("CustomerInvoiceList")
        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList customerInvoiceList;

        public static QueryInvoicingCustomerListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseBodyData self = new QueryInvoicingCustomerListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInvoicingCustomerListResponseBodyData setCustomerInvoiceList(QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList customerInvoiceList) {
            this.customerInvoiceList = customerInvoiceList;
            return this;
        }
        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceList getCustomerInvoiceList() {
            return this.customerInvoiceList;
        }

    }

}
