// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindFinanceTaxResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FinanceVersion")
    public FindFinanceTaxResponseBodyFinanceVersion financeVersion;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindFinanceTaxResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindFinanceTaxResponseBody self = new FindFinanceTaxResponseBody();
        return TeaModel.build(map, self);
    }

    public FindFinanceTaxResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindFinanceTaxResponseBody setFinanceVersion(FindFinanceTaxResponseBodyFinanceVersion financeVersion) {
        this.financeVersion = financeVersion;
        return this;
    }
    public FindFinanceTaxResponseBodyFinanceVersion getFinanceVersion() {
        return this.financeVersion;
    }

    public FindFinanceTaxResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindFinanceTaxResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindFinanceTaxResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindFinanceTaxResponseBodyFinanceVersion extends TeaModel {
        @NameInMap("FinanceTaxCertificateImgName")
        public String financeTaxCertificateImgName;

        @NameInMap("FinanceTaxCertificateImgUrl")
        public String financeTaxCertificateImgUrl;

        @NameInMap("SecondFinanceTax")
        public String secondFinanceTax;

        @NameInMap("SecondFinanceTaxCertificateImgName")
        public String secondFinanceTaxCertificateImgName;

        @NameInMap("SecondFinanceTaxCertificateImgUrl")
        public String secondFinanceTaxCertificateImgUrl;

        @NameInMap("Tax")
        public String tax;

        @NameInMap("Version")
        public String version;

        public static FindFinanceTaxResponseBodyFinanceVersion build(java.util.Map<String, ?> map) throws Exception {
            FindFinanceTaxResponseBodyFinanceVersion self = new FindFinanceTaxResponseBodyFinanceVersion();
            return TeaModel.build(map, self);
        }

        public FindFinanceTaxResponseBodyFinanceVersion setFinanceTaxCertificateImgName(String financeTaxCertificateImgName) {
            this.financeTaxCertificateImgName = financeTaxCertificateImgName;
            return this;
        }
        public String getFinanceTaxCertificateImgName() {
            return this.financeTaxCertificateImgName;
        }

        public FindFinanceTaxResponseBodyFinanceVersion setFinanceTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
            this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
            return this;
        }
        public String getFinanceTaxCertificateImgUrl() {
            return this.financeTaxCertificateImgUrl;
        }

        public FindFinanceTaxResponseBodyFinanceVersion setSecondFinanceTax(String secondFinanceTax) {
            this.secondFinanceTax = secondFinanceTax;
            return this;
        }
        public String getSecondFinanceTax() {
            return this.secondFinanceTax;
        }

        public FindFinanceTaxResponseBodyFinanceVersion setSecondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
            this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
            return this;
        }
        public String getSecondFinanceTaxCertificateImgName() {
            return this.secondFinanceTaxCertificateImgName;
        }

        public FindFinanceTaxResponseBodyFinanceVersion setSecondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
            this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
            return this;
        }
        public String getSecondFinanceTaxCertificateImgUrl() {
            return this.secondFinanceTaxCertificateImgUrl;
        }

        public FindFinanceTaxResponseBodyFinanceVersion setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

        public FindFinanceTaxResponseBodyFinanceVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
