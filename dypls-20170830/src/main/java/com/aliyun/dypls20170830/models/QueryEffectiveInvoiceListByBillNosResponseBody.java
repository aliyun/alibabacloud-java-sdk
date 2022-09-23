// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryEffectiveInvoiceListByBillNosResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ReturnValue")
    public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue returnValue;

    public static QueryEffectiveInvoiceListByBillNosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEffectiveInvoiceListByBillNosResponseBody self = new QueryEffectiveInvoiceListByBillNosResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEffectiveInvoiceListByBillNosResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryEffectiveInvoiceListByBillNosResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEffectiveInvoiceListByBillNosResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public QueryEffectiveInvoiceListByBillNosResponseBody setReturnValue(QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static class QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList extends TeaModel {
        @NameInMap("AliCompany")
        public String aliCompany;

        @NameInMap("AliId")
        public Long aliId;

        @NameInMap("Amount")
        public Double amount;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("BuildAmount")
        public Double buildAmount;

        @NameInMap("Category")
        public String category;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("InvoiceNo")
        public String invoiceNo;

        @NameInMap("InvoiceStatus")
        public String invoiceStatus;

        @NameInMap("InvoiceTitle")
        public String invoiceTitle;

        @NameInMap("Language")
        public String language;

        @NameInMap("OrderItemNo")
        public String orderItemNo;

        @NameInMap("ParentContractNo")
        public String parentContractNo;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Site")
        public String site;

        @NameInMap("TaxRegisgerNo")
        public String taxRegisgerNo;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList build(java.util.Map<String, ?> map) throws Exception {
            QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList self = new QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList();
            return TeaModel.build(map, self);
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setAliCompany(String aliCompany) {
            this.aliCompany = aliCompany;
            return this;
        }
        public String getAliCompany() {
            return this.aliCompany;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setAliId(Long aliId) {
            this.aliId = aliId;
            return this;
        }
        public Long getAliId() {
            return this.aliId;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setBuildAmount(Double buildAmount) {
            this.buildAmount = buildAmount;
            return this;
        }
        public Double getBuildAmount() {
            return this.buildAmount;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setInvoiceStatus(String invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            return this;
        }
        public String getInvoiceStatus() {
            return this.invoiceStatus;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setOrderItemNo(String orderItemNo) {
            this.orderItemNo = orderItemNo;
            return this;
        }
        public String getOrderItemNo() {
            return this.orderItemNo;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setParentContractNo(String parentContractNo) {
            this.parentContractNo = parentContractNo;
            return this;
        }
        public String getParentContractNo() {
            return this.parentContractNo;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setTaxRegisgerNo(String taxRegisgerNo) {
            this.taxRegisgerNo = taxRegisgerNo;
            return this;
        }
        public String getTaxRegisgerNo() {
            return this.taxRegisgerNo;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue extends TeaModel {
        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("List")
        public java.util.List<QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList> list;

        @NameInMap("Sign")
        public String sign;

        public static QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue self = new QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue setList(java.util.List<QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryEffectiveInvoiceListByBillNosResponseBodyReturnValueList> getList() {
            return this.list;
        }

        public QueryEffectiveInvoiceListByBillNosResponseBodyReturnValue setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

}
