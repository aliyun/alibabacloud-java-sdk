// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class GetEinvoicePdfDataRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Customer")
    public GetEinvoicePdfDataRequestCustomer customer;

    @NameInMap("EncryptProps")
    public java.util.Map<String, String> encryptProps;

    @NameInMap("InvoiceCode")
    public String invoiceCode;

    @NameInMap("InvoiceNo")
    public String invoiceNo;

    @NameInMap("Language")
    public String language;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("Uuid")
    public String uuid;

    public static GetEinvoicePdfDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEinvoicePdfDataRequest self = new GetEinvoicePdfDataRequest();
        return TeaModel.build(map, self);
    }

    public GetEinvoicePdfDataRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetEinvoicePdfDataRequest setCustomer(GetEinvoicePdfDataRequestCustomer customer) {
        this.customer = customer;
        return this;
    }
    public GetEinvoicePdfDataRequestCustomer getCustomer() {
        return this.customer;
    }

    public GetEinvoicePdfDataRequest setEncryptProps(java.util.Map<String, String> encryptProps) {
        this.encryptProps = encryptProps;
        return this;
    }
    public java.util.Map<String, String> getEncryptProps() {
        return this.encryptProps;
    }

    public GetEinvoicePdfDataRequest setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public GetEinvoicePdfDataRequest setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public GetEinvoicePdfDataRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetEinvoicePdfDataRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public GetEinvoicePdfDataRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class GetEinvoicePdfDataRequestCustomer extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("CustomerSite")
        public String customerSite;

        @NameInMap("CustomerSystem")
        public String customerSystem;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("Language")
        public String language;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Uuid")
        public String uuid;

        public static GetEinvoicePdfDataRequestCustomer build(java.util.Map<String, ?> map) throws Exception {
            GetEinvoicePdfDataRequestCustomer self = new GetEinvoicePdfDataRequestCustomer();
            return TeaModel.build(map, self);
        }

        public GetEinvoicePdfDataRequestCustomer setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetEinvoicePdfDataRequestCustomer setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetEinvoicePdfDataRequestCustomer setCustomerSite(String customerSite) {
            this.customerSite = customerSite;
            return this;
        }
        public String getCustomerSite() {
            return this.customerSite;
        }

        public GetEinvoicePdfDataRequestCustomer setCustomerSystem(String customerSystem) {
            this.customerSystem = customerSystem;
            return this;
        }
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        public GetEinvoicePdfDataRequestCustomer setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public GetEinvoicePdfDataRequestCustomer setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetEinvoicePdfDataRequestCustomer setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetEinvoicePdfDataRequestCustomer setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
