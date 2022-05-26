// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindCustomerSnapshotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CustomerSnapshot")
    public FindCustomerSnapshotResponseBodyCustomerSnapshot customerSnapshot;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindCustomerSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindCustomerSnapshotResponseBody self = new FindCustomerSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public FindCustomerSnapshotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindCustomerSnapshotResponseBody setCustomerSnapshot(FindCustomerSnapshotResponseBodyCustomerSnapshot customerSnapshot) {
        this.customerSnapshot = customerSnapshot;
        return this;
    }
    public FindCustomerSnapshotResponseBodyCustomerSnapshot getCustomerSnapshot() {
        return this.customerSnapshot;
    }

    public FindCustomerSnapshotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindCustomerSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindCustomerSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Address2")
        public String address2;

        @NameInMap("Address3")
        public String address3;

        @NameInMap("Address4")
        public String address4;

        @NameInMap("Address5")
        public String address5;

        @NameInMap("Address6")
        public String address6;

        @NameInMap("CityId")
        public String cityId;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("ProvinceId")
        public String provinceId;

        @NameInMap("ProvinceName")
        public String provinceName;

        @NameInMap("TrueName")
        public String trueName;

        public static FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel build(java.util.Map<String, ?> map) throws Exception {
            FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel self = new FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel();
            return TeaModel.build(map, self);
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }
        public String getAddress2() {
            return this.address2;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setAddress3(String address3) {
            this.address3 = address3;
            return this;
        }
        public String getAddress3() {
            return this.address3;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setAddress4(String address4) {
            this.address4 = address4;
            return this;
        }
        public String getAddress4() {
            return this.address4;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setAddress5(String address5) {
            this.address5 = address5;
            return this;
        }
        public String getAddress5() {
            return this.address5;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setAddress6(String address6) {
            this.address6 = address6;
            return this;
        }
        public String getAddress6() {
            return this.address6;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }
        public String getCityId() {
            return this.cityId;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel setTrueName(String trueName) {
            this.trueName = trueName;
            return this;
        }
        public String getTrueName() {
            return this.trueName;
        }

    }

    public static class FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel extends TeaModel {
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

        public static FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel build(java.util.Map<String, ?> map) throws Exception {
            FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel self = new FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel();
            return TeaModel.build(map, self);
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel setFinanceTaxCertificateImgName(String financeTaxCertificateImgName) {
            this.financeTaxCertificateImgName = financeTaxCertificateImgName;
            return this;
        }
        public String getFinanceTaxCertificateImgName() {
            return this.financeTaxCertificateImgName;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel setFinanceTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
            this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
            return this;
        }
        public String getFinanceTaxCertificateImgUrl() {
            return this.financeTaxCertificateImgUrl;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel setSecondFinanceTax(String secondFinanceTax) {
            this.secondFinanceTax = secondFinanceTax;
            return this;
        }
        public String getSecondFinanceTax() {
            return this.secondFinanceTax;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel setSecondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
            this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
            return this;
        }
        public String getSecondFinanceTaxCertificateImgName() {
            return this.secondFinanceTaxCertificateImgName;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel setSecondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
            this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
            return this;
        }
        public String getSecondFinanceTaxCertificateImgUrl() {
            return this.secondFinanceTaxCertificateImgUrl;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

    }

    public static class FindCustomerSnapshotResponseBodyCustomerSnapshot extends TeaModel {
        @NameInMap("AccountInfoSnapshotModel")
        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel accountInfoSnapshotModel;

        @NameInMap("AccountTaxSnapshotModel")
        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel accountTaxSnapshotModel;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InfoType")
        public String infoType;

        @NameInMap("KpId")
        public Long kpId;

        public static FindCustomerSnapshotResponseBodyCustomerSnapshot build(java.util.Map<String, ?> map) throws Exception {
            FindCustomerSnapshotResponseBodyCustomerSnapshot self = new FindCustomerSnapshotResponseBodyCustomerSnapshot();
            return TeaModel.build(map, self);
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshot setAccountInfoSnapshotModel(FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel accountInfoSnapshotModel) {
            this.accountInfoSnapshotModel = accountInfoSnapshotModel;
            return this;
        }
        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountInfoSnapshotModel getAccountInfoSnapshotModel() {
            return this.accountInfoSnapshotModel;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshot setAccountTaxSnapshotModel(FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel accountTaxSnapshotModel) {
            this.accountTaxSnapshotModel = accountTaxSnapshotModel;
            return this;
        }
        public FindCustomerSnapshotResponseBodyCustomerSnapshotAccountTaxSnapshotModel getAccountTaxSnapshotModel() {
            return this.accountTaxSnapshotModel;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshot setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshot setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshot setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public FindCustomerSnapshotResponseBodyCustomerSnapshot setKpId(Long kpId) {
            this.kpId = kpId;
            return this;
        }
        public Long getKpId() {
            return this.kpId;
        }

    }

}
