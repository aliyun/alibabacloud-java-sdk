// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ApplyArInvoiceWithSourceResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ReturnValue")
    public ApplyArInvoiceWithSourceResponseBodyReturnValue returnValue;

    public static ApplyArInvoiceWithSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyArInvoiceWithSourceResponseBody self = new ApplyArInvoiceWithSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyArInvoiceWithSourceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ApplyArInvoiceWithSourceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ApplyArInvoiceWithSourceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ApplyArInvoiceWithSourceResponseBody setReturnValue(ApplyArInvoiceWithSourceResponseBodyReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public ApplyArInvoiceWithSourceResponseBodyReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static class ApplyArInvoiceWithSourceResponseBodyReturnValue extends TeaModel {
        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("OuterSystemEncryptStr")
        public String outerSystemEncryptStr;

        @NameInMap("OuterSystemSignStr")
        public String outerSystemSignStr;

        @NameInMap("Sign")
        public String sign;

        public static ApplyArInvoiceWithSourceResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            ApplyArInvoiceWithSourceResponseBodyReturnValue self = new ApplyArInvoiceWithSourceResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public ApplyArInvoiceWithSourceResponseBodyReturnValue setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public ApplyArInvoiceWithSourceResponseBodyReturnValue setOuterSystemEncryptStr(String outerSystemEncryptStr) {
            this.outerSystemEncryptStr = outerSystemEncryptStr;
            return this;
        }
        public String getOuterSystemEncryptStr() {
            return this.outerSystemEncryptStr;
        }

        public ApplyArInvoiceWithSourceResponseBodyReturnValue setOuterSystemSignStr(String outerSystemSignStr) {
            this.outerSystemSignStr = outerSystemSignStr;
            return this;
        }
        public String getOuterSystemSignStr() {
            return this.outerSystemSignStr;
        }

        public ApplyArInvoiceWithSourceResponseBodyReturnValue setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

}
