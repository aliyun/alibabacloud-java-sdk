// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInvoicingCustomerListResponse extends TeaModel {
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
    public QueryInvoicingCustomerListResponseData data;

    public static QueryInvoicingCustomerListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoicingCustomerListResponse self = new QueryInvoicingCustomerListResponse();
        return TeaModel.build(map, self);
    }

    public QueryInvoicingCustomerListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInvoicingCustomerListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryInvoicingCustomerListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInvoicingCustomerListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInvoicingCustomerListResponse setData(QueryInvoicingCustomerListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryInvoicingCustomerListResponseData getData() {
        return this.data;
    }

    public static class QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("UserId")
        @Validation(required = true)
        public Long userId;

        @NameInMap("UserNick")
        @Validation(required = true)
        public String userNick;

        @NameInMap("InvoiceTitle")
        @Validation(required = true)
        public String invoiceTitle;

        @NameInMap("CustomerType")
        @Validation(required = true)
        public Long customerType;

        @NameInMap("TaxpayerType")
        @Validation(required = true)
        public Long taxpayerType;

        @NameInMap("Bank")
        @Validation(required = true)
        public String bank;

        @NameInMap("BankNo")
        @Validation(required = true)
        public String bankNo;

        @NameInMap("OperatingLicenseAddress")
        @Validation(required = true)
        public String operatingLicenseAddress;

        @NameInMap("OperatingLicensePhone")
        @Validation(required = true)
        public String operatingLicensePhone;

        @NameInMap("RegisterNo")
        @Validation(required = true)
        public String registerNo;

        @NameInMap("StartCycle")
        @Validation(required = true)
        public Long startCycle;

        @NameInMap("Status")
        @Validation(required = true)
        public Long status;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("TaxationLicense")
        @Validation(required = true)
        public String taxationLicense;

        @NameInMap("AdjustType")
        @Validation(required = true)
        public Long adjustType;

        @NameInMap("EndCycle")
        @Validation(required = true)
        public Long endCycle;

        @NameInMap("TitleChangeInstructions")
        @Validation(required = true)
        public String titleChangeInstructions;

        @NameInMap("IssueType")
        @Validation(required = true)
        public Long issueType;

        @NameInMap("Type")
        @Validation(required = true)
        public Long type;

        @NameInMap("DefaultRemark")
        @Validation(required = true)
        public String defaultRemark;

        public static QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice self = new QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice();
            return TeaModel.build(map, self);
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setCustomerType(Long customerType) {
            this.customerType = customerType;
            return this;
        }
        public Long getCustomerType() {
            return this.customerType;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setTaxpayerType(Long taxpayerType) {
            this.taxpayerType = taxpayerType;
            return this;
        }
        public Long getTaxpayerType() {
            return this.taxpayerType;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setBank(String bank) {
            this.bank = bank;
            return this;
        }
        public String getBank() {
            return this.bank;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setBankNo(String bankNo) {
            this.bankNo = bankNo;
            return this;
        }
        public String getBankNo() {
            return this.bankNo;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setOperatingLicenseAddress(String operatingLicenseAddress) {
            this.operatingLicenseAddress = operatingLicenseAddress;
            return this;
        }
        public String getOperatingLicenseAddress() {
            return this.operatingLicenseAddress;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setOperatingLicensePhone(String operatingLicensePhone) {
            this.operatingLicensePhone = operatingLicensePhone;
            return this;
        }
        public String getOperatingLicensePhone() {
            return this.operatingLicensePhone;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setRegisterNo(String registerNo) {
            this.registerNo = registerNo;
            return this;
        }
        public String getRegisterNo() {
            return this.registerNo;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setStartCycle(Long startCycle) {
            this.startCycle = startCycle;
            return this;
        }
        public Long getStartCycle() {
            return this.startCycle;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setTaxationLicense(String taxationLicense) {
            this.taxationLicense = taxationLicense;
            return this;
        }
        public String getTaxationLicense() {
            return this.taxationLicense;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setAdjustType(Long adjustType) {
            this.adjustType = adjustType;
            return this;
        }
        public Long getAdjustType() {
            return this.adjustType;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setEndCycle(Long endCycle) {
            this.endCycle = endCycle;
            return this;
        }
        public Long getEndCycle() {
            return this.endCycle;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setTitleChangeInstructions(String titleChangeInstructions) {
            this.titleChangeInstructions = titleChangeInstructions;
            return this;
        }
        public String getTitleChangeInstructions() {
            return this.titleChangeInstructions;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setIssueType(Long issueType) {
            this.issueType = issueType;
            return this;
        }
        public Long getIssueType() {
            return this.issueType;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice setDefaultRemark(String defaultRemark) {
            this.defaultRemark = defaultRemark;
            return this;
        }
        public String getDefaultRemark() {
            return this.defaultRemark;
        }

    }

    public static class QueryInvoicingCustomerListResponseDataCustomerInvoiceList extends TeaModel {
        @NameInMap("CustomerInvoice")
        @Validation(required = true)
        public java.util.List<QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice> customerInvoice;

        public static QueryInvoicingCustomerListResponseDataCustomerInvoiceList build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseDataCustomerInvoiceList self = new QueryInvoicingCustomerListResponseDataCustomerInvoiceList();
            return TeaModel.build(map, self);
        }

        public QueryInvoicingCustomerListResponseDataCustomerInvoiceList setCustomerInvoice(java.util.List<QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice> customerInvoice) {
            this.customerInvoice = customerInvoice;
            return this;
        }
        public java.util.List<QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice> getCustomerInvoice() {
            return this.customerInvoice;
        }

    }

    public static class QueryInvoicingCustomerListResponseData extends TeaModel {
        @NameInMap("CustomerInvoiceList")
        @Validation(required = true)
        public QueryInvoicingCustomerListResponseDataCustomerInvoiceList customerInvoiceList;

        public static QueryInvoicingCustomerListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseData self = new QueryInvoicingCustomerListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryInvoicingCustomerListResponseData setCustomerInvoiceList(QueryInvoicingCustomerListResponseDataCustomerInvoiceList customerInvoiceList) {
            this.customerInvoiceList = customerInvoiceList;
            return this;
        }
        public QueryInvoicingCustomerListResponseDataCustomerInvoiceList getCustomerInvoiceList() {
            return this.customerInvoiceList;
        }

    }

}
