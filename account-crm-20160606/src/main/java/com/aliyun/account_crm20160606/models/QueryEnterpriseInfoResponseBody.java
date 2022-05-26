// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEnterpriseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProfileInfo")
    public QueryEnterpriseInfoResponseBodyProfileInfo profileInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEnterpriseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseInfoResponseBody self = new QueryEnterpriseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEnterpriseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEnterpriseInfoResponseBody setProfileInfo(QueryEnterpriseInfoResponseBodyProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }
    public QueryEnterpriseInfoResponseBodyProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public QueryEnterpriseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEnterpriseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEnterpriseInfoResponseBodyProfileInfoCity extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryEnterpriseInfoResponseBodyProfileInfoCity build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseInfoResponseBodyProfileInfoCity self = new QueryEnterpriseInfoResponseBodyProfileInfoCity();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseInfoResponseBodyProfileInfoCity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfoCity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryEnterpriseInfoResponseBodyProfileInfoProvince extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryEnterpriseInfoResponseBodyProfileInfoProvince build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseInfoResponseBodyProfileInfoProvince self = new QueryEnterpriseInfoResponseBodyProfileInfoProvince();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseInfoResponseBodyProfileInfoProvince setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfoProvince setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryEnterpriseInfoResponseBodyProfileInfo extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("AliyunPK")
        public String aliyunPK;

        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("BusinessLicenseImgSrc")
        public String businessLicenseImgSrc;

        @NameInMap("BusinessLicenseNumber")
        public String businessLicenseNumber;

        @NameInMap("BusinessLicenseType")
        public String businessLicenseType;

        @NameInMap("CertifiedFrom")
        public String certifiedFrom;

        @NameInMap("CertifiedTime")
        public String certifiedTime;

        @NameInMap("City")
        public QueryEnterpriseInfoResponseBodyProfileInfoCity city;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DetailAddress")
        public String detailAddress;

        @NameInMap("EInterpriseSize")
        public String EInterpriseSize;

        @NameInMap("EnterpriseEntity")
        public String enterpriseEntity;

        @NameInMap("EntityIDNumber")
        public String entityIDNumber;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("Fax")
        public String fax;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("PostalCode")
        public String postalCode;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Province")
        public QueryEnterpriseInfoResponseBodyProfileInfoProvince province;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Years")
        public String years;

        public static QueryEnterpriseInfoResponseBodyProfileInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseInfoResponseBodyProfileInfo self = new QueryEnterpriseInfoResponseBodyProfileInfo();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setAliyunPK(String aliyunPK) {
            this.aliyunPK = aliyunPK;
            return this;
        }
        public String getAliyunPK() {
            return this.aliyunPK;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setBusinessLicenseImgSrc(String businessLicenseImgSrc) {
            this.businessLicenseImgSrc = businessLicenseImgSrc;
            return this;
        }
        public String getBusinessLicenseImgSrc() {
            return this.businessLicenseImgSrc;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setBusinessLicenseNumber(String businessLicenseNumber) {
            this.businessLicenseNumber = businessLicenseNumber;
            return this;
        }
        public String getBusinessLicenseNumber() {
            return this.businessLicenseNumber;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setBusinessLicenseType(String businessLicenseType) {
            this.businessLicenseType = businessLicenseType;
            return this;
        }
        public String getBusinessLicenseType() {
            return this.businessLicenseType;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setCertifiedFrom(String certifiedFrom) {
            this.certifiedFrom = certifiedFrom;
            return this;
        }
        public String getCertifiedFrom() {
            return this.certifiedFrom;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setCertifiedTime(String certifiedTime) {
            this.certifiedTime = certifiedTime;
            return this;
        }
        public String getCertifiedTime() {
            return this.certifiedTime;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setCity(QueryEnterpriseInfoResponseBodyProfileInfoCity city) {
            this.city = city;
            return this;
        }
        public QueryEnterpriseInfoResponseBodyProfileInfoCity getCity() {
            return this.city;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setDetailAddress(String detailAddress) {
            this.detailAddress = detailAddress;
            return this;
        }
        public String getDetailAddress() {
            return this.detailAddress;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setEInterpriseSize(String EInterpriseSize) {
            this.EInterpriseSize = EInterpriseSize;
            return this;
        }
        public String getEInterpriseSize() {
            return this.EInterpriseSize;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setEnterpriseEntity(String enterpriseEntity) {
            this.enterpriseEntity = enterpriseEntity;
            return this;
        }
        public String getEnterpriseEntity() {
            return this.enterpriseEntity;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setEntityIDNumber(String entityIDNumber) {
            this.entityIDNumber = entityIDNumber;
            return this;
        }
        public String getEntityIDNumber() {
            return this.entityIDNumber;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setFax(String fax) {
            this.fax = fax;
            return this;
        }
        public String getFax() {
            return this.fax;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setProvince(QueryEnterpriseInfoResponseBodyProfileInfoProvince province) {
            this.province = province;
            return this;
        }
        public QueryEnterpriseInfoResponseBodyProfileInfoProvince getProvince() {
            return this.province;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryEnterpriseInfoResponseBodyProfileInfo setYears(String years) {
            this.years = years;
            return this;
        }
        public String getYears() {
            return this.years;
        }

    }

}
