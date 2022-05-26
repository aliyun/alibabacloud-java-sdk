// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindFinanceTaxDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Finance")
    public FindFinanceTaxDetailResponseBodyFinance finance;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindFinanceTaxDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindFinanceTaxDetailResponseBody self = new FindFinanceTaxDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public FindFinanceTaxDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindFinanceTaxDetailResponseBody setFinance(FindFinanceTaxDetailResponseBodyFinance finance) {
        this.finance = finance;
        return this;
    }
    public FindFinanceTaxDetailResponseBodyFinance getFinance() {
        return this.finance;
    }

    public FindFinanceTaxDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindFinanceTaxDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindFinanceTaxDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindFinanceTaxDetailResponseBodyFinance extends TeaModel {
        @NameInMap("FinanceTaxCertificateImgName")
        public String financeTaxCertificateImgName;

        @NameInMap("Tax")
        public String tax;

        @NameInMap("financeTaxCertificateImgUrl")
        public String financeTaxCertificateImgUrl;

        @NameInMap("secondFinanceTax")
        public String secondFinanceTax;

        @NameInMap("secondFinanceTaxCertificateImgName")
        public String secondFinanceTaxCertificateImgName;

        @NameInMap("secondFinanceTaxCertificateImgUrl")
        public String secondFinanceTaxCertificateImgUrl;

        public static FindFinanceTaxDetailResponseBodyFinance build(java.util.Map<String, ?> map) throws Exception {
            FindFinanceTaxDetailResponseBodyFinance self = new FindFinanceTaxDetailResponseBodyFinance();
            return TeaModel.build(map, self);
        }

        public FindFinanceTaxDetailResponseBodyFinance setFinanceTaxCertificateImgName(String financeTaxCertificateImgName) {
            this.financeTaxCertificateImgName = financeTaxCertificateImgName;
            return this;
        }
        public String getFinanceTaxCertificateImgName() {
            return this.financeTaxCertificateImgName;
        }

        public FindFinanceTaxDetailResponseBodyFinance setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

        public FindFinanceTaxDetailResponseBodyFinance setFinanceTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
            this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
            return this;
        }
        public String getFinanceTaxCertificateImgUrl() {
            return this.financeTaxCertificateImgUrl;
        }

        public FindFinanceTaxDetailResponseBodyFinance setSecondFinanceTax(String secondFinanceTax) {
            this.secondFinanceTax = secondFinanceTax;
            return this;
        }
        public String getSecondFinanceTax() {
            return this.secondFinanceTax;
        }

        public FindFinanceTaxDetailResponseBodyFinance setSecondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
            this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
            return this;
        }
        public String getSecondFinanceTaxCertificateImgName() {
            return this.secondFinanceTaxCertificateImgName;
        }

        public FindFinanceTaxDetailResponseBodyFinance setSecondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
            this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
            return this;
        }
        public String getSecondFinanceTaxCertificateImgUrl() {
            return this.secondFinanceTaxCertificateImgUrl;
        }

    }

}
