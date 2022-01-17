// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeLicenseResponseBody extends TeaModel {
    @NameInMap("License")
    public DescribeLicenseResponseBodyLicense license;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseResponseBody self = new DescribeLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseResponseBody setLicense(DescribeLicenseResponseBodyLicense license) {
        this.license = license;
        return this;
    }
    public DescribeLicenseResponseBodyLicense getLicense() {
        return this.license;
    }

    public DescribeLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Value")
        public String value;

        public static DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute self = new DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLicenseResponseBodyLicenseExtendArray extends TeaModel {
        @NameInMap("LicenseAttribute")
        public java.util.List<DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute> licenseAttribute;

        public static DescribeLicenseResponseBodyLicenseExtendArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeLicenseResponseBodyLicenseExtendArray self = new DescribeLicenseResponseBodyLicenseExtendArray();
            return TeaModel.build(map, self);
        }

        public DescribeLicenseResponseBodyLicenseExtendArray setLicenseAttribute(java.util.List<DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute> licenseAttribute) {
            this.licenseAttribute = licenseAttribute;
            return this;
        }
        public java.util.List<DescribeLicenseResponseBodyLicenseExtendArrayLicenseAttribute> getLicenseAttribute() {
            return this.licenseAttribute;
        }

    }

    public static class DescribeLicenseResponseBodyLicenseExtendInfo extends TeaModel {
        @NameInMap("AccountQuantity")
        public Long accountQuantity;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Email")
        public String email;

        @NameInMap("Mobile")
        public String mobile;

        public static DescribeLicenseResponseBodyLicenseExtendInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLicenseResponseBodyLicenseExtendInfo self = new DescribeLicenseResponseBodyLicenseExtendInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLicenseResponseBodyLicenseExtendInfo setAccountQuantity(Long accountQuantity) {
            this.accountQuantity = accountQuantity;
            return this;
        }
        public Long getAccountQuantity() {
            return this.accountQuantity;
        }

        public DescribeLicenseResponseBodyLicenseExtendInfo setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeLicenseResponseBodyLicenseExtendInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeLicenseResponseBodyLicenseExtendInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

    public static class DescribeLicenseResponseBodyLicense extends TeaModel {
        @NameInMap("ActivateTime")
        public String activateTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ExtendArray")
        public DescribeLicenseResponseBodyLicenseExtendArray extendArray;

        @NameInMap("ExtendInfo")
        public DescribeLicenseResponseBodyLicenseExtendInfo extendInfo;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("LicenseStatus")
        public String licenseStatus;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductSkuId")
        public String productSkuId;

        @NameInMap("SupplierName")
        public String supplierName;

        public static DescribeLicenseResponseBodyLicense build(java.util.Map<String, ?> map) throws Exception {
            DescribeLicenseResponseBodyLicense self = new DescribeLicenseResponseBodyLicense();
            return TeaModel.build(map, self);
        }

        public DescribeLicenseResponseBodyLicense setActivateTime(String activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public String getActivateTime() {
            return this.activateTime;
        }

        public DescribeLicenseResponseBodyLicense setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLicenseResponseBodyLicense setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeLicenseResponseBodyLicense setExtendArray(DescribeLicenseResponseBodyLicenseExtendArray extendArray) {
            this.extendArray = extendArray;
            return this;
        }
        public DescribeLicenseResponseBodyLicenseExtendArray getExtendArray() {
            return this.extendArray;
        }

        public DescribeLicenseResponseBodyLicense setExtendInfo(DescribeLicenseResponseBodyLicenseExtendInfo extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public DescribeLicenseResponseBodyLicenseExtendInfo getExtendInfo() {
            return this.extendInfo;
        }

        public DescribeLicenseResponseBodyLicense setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLicenseResponseBodyLicense setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeLicenseResponseBodyLicense setLicenseStatus(String licenseStatus) {
            this.licenseStatus = licenseStatus;
            return this;
        }
        public String getLicenseStatus() {
            return this.licenseStatus;
        }

        public DescribeLicenseResponseBodyLicense setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeLicenseResponseBodyLicense setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeLicenseResponseBodyLicense setProductSkuId(String productSkuId) {
            this.productSkuId = productSkuId;
            return this;
        }
        public String getProductSkuId() {
            return this.productSkuId;
        }

        public DescribeLicenseResponseBodyLicense setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

    }

}
