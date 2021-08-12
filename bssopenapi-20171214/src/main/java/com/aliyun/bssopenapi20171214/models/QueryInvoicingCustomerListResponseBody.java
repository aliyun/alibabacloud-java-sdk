// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInvoicingCustomerListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryInvoicingCustomerListResponseBodyData data;

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

    public QueryInvoicingCustomerListResponseBody setData(QueryInvoicingCustomerListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInvoicingCustomerListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice extends TeaModel {
        @NameInMap("Type")
        public Long type;

        @NameInMap("Status")
        public Long status;

        @NameInMap("AdjustType")
        public Long adjustType;

        @NameInMap("Bank")
        public String bank;

        @NameInMap("StartCycle")
        public Long startCycle;

        @NameInMap("TitleChangeInstructions")
        public String titleChangeInstructions;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("OperatingLicenseAddress")
        public String operatingLicenseAddress;

        @NameInMap("InvoiceTitle")
        public String invoiceTitle;

        @NameInMap("UserNick")
        public String userNick;

        @NameInMap("OperatingLicensePhone")
        public String operatingLicensePhone;

        @NameInMap("EndCycle")
        public Long endCycle;

        @NameInMap("DefaultRemark")
        public String defaultRemark;

        @NameInMap("TaxationLicense")
        public String taxationLicense;

        @NameInMap("RegisterNo")
        public String registerNo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("TaxpayerType")
        public Long taxpayerType;

        @NameInMap("CustomerType")
        public Long customerType;

        @NameInMap("IssueType")
        public Long issueType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("BankNo")
        public String bankNo;

        public static QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice self = new QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice();
            return TeaModel.build(map, self);
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
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

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setStartCycle(Long startCycle) {
            this.startCycle = startCycle;
            return this;
        }
        public Long getStartCycle() {
            return this.startCycle;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setTitleChangeInstructions(String titleChangeInstructions) {
            this.titleChangeInstructions = titleChangeInstructions;
            return this;
        }
        public String getTitleChangeInstructions() {
            return this.titleChangeInstructions;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setOperatingLicenseAddress(String operatingLicenseAddress) {
            this.operatingLicenseAddress = operatingLicenseAddress;
            return this;
        }
        public String getOperatingLicenseAddress() {
            return this.operatingLicenseAddress;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setOperatingLicensePhone(String operatingLicensePhone) {
            this.operatingLicensePhone = operatingLicensePhone;
            return this;
        }
        public String getOperatingLicensePhone() {
            return this.operatingLicensePhone;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setEndCycle(Long endCycle) {
            this.endCycle = endCycle;
            return this;
        }
        public Long getEndCycle() {
            return this.endCycle;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setDefaultRemark(String defaultRemark) {
            this.defaultRemark = defaultRemark;
            return this;
        }
        public String getDefaultRemark() {
            return this.defaultRemark;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setTaxationLicense(String taxationLicense) {
            this.taxationLicense = taxationLicense;
            return this;
        }
        public String getTaxationLicense() {
            return this.taxationLicense;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setRegisterNo(String registerNo) {
            this.registerNo = registerNo;
            return this;
        }
        public String getRegisterNo() {
            return this.registerNo;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setTaxpayerType(Long taxpayerType) {
            this.taxpayerType = taxpayerType;
            return this;
        }
        public Long getTaxpayerType() {
            return this.taxpayerType;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setCustomerType(Long customerType) {
            this.customerType = customerType;
            return this;
        }
        public Long getCustomerType() {
            return this.customerType;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setIssueType(Long issueType) {
            this.issueType = issueType;
            return this;
        }
        public Long getIssueType() {
            return this.issueType;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryInvoicingCustomerListResponseBodyDataCustomerInvoiceListCustomerInvoice setBankNo(String bankNo) {
            this.bankNo = bankNo;
            return this;
        }
        public String getBankNo() {
            return this.bankNo;
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
