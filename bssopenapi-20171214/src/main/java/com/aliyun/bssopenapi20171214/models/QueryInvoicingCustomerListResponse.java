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

    }

    public static class QueryInvoicingCustomerListResponseDataCustomerInvoiceList extends TeaModel {
        @NameInMap("CustomerInvoice")
        @Validation(required = true)
        public java.util.List<QueryInvoicingCustomerListResponseDataCustomerInvoiceListCustomerInvoice> customerInvoice;

        public static QueryInvoicingCustomerListResponseDataCustomerInvoiceList build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoicingCustomerListResponseDataCustomerInvoiceList self = new QueryInvoicingCustomerListResponseDataCustomerInvoiceList();
            return TeaModel.build(map, self);
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

    }

}
