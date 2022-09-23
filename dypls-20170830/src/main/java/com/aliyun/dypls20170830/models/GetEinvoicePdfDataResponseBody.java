// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class GetEinvoicePdfDataResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ReturnValue")
    public GetEinvoicePdfDataResponseBodyReturnValue returnValue;

    public static GetEinvoicePdfDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEinvoicePdfDataResponseBody self = new GetEinvoicePdfDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEinvoicePdfDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetEinvoicePdfDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEinvoicePdfDataResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetEinvoicePdfDataResponseBody setReturnValue(GetEinvoicePdfDataResponseBodyReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public GetEinvoicePdfDataResponseBodyReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static class GetEinvoicePdfDataResponseBodyReturnValue extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("EInvoiceData")
        public java.util.List<Integer> EInvoiceData;

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

        public static GetEinvoicePdfDataResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            GetEinvoicePdfDataResponseBodyReturnValue self = new GetEinvoicePdfDataResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setEInvoiceData(java.util.List<Integer> EInvoiceData) {
            this.EInvoiceData = EInvoiceData;
            return this;
        }
        public java.util.List<Integer> getEInvoiceData() {
            return this.EInvoiceData;
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetEinvoicePdfDataResponseBodyReturnValue setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
