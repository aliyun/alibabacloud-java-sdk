// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyAndMainUserCreateResponseBody extends TeaModel {
    @NameInMap("Company")
    public CompanyAndMainUserCreateResponseBodyCompany company;

    @NameInMap("Main")
    public CompanyAndMainUserCreateResponseBodyMain main;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CompanyAndMainUserCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyAndMainUserCreateResponseBody self = new CompanyAndMainUserCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyAndMainUserCreateResponseBody setCompany(CompanyAndMainUserCreateResponseBodyCompany company) {
        this.company = company;
        return this;
    }
    public CompanyAndMainUserCreateResponseBodyCompany getCompany() {
        return this.company;
    }

    public CompanyAndMainUserCreateResponseBody setMain(CompanyAndMainUserCreateResponseBodyMain main) {
        this.main = main;
        return this;
    }
    public CompanyAndMainUserCreateResponseBodyMain getMain() {
        return this.main;
    }

    public CompanyAndMainUserCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompanyAndMainUserCreateResponseBodyCompanyExtraInfo extends TeaModel {
        @NameInMap("ExtInfoMap")
        public String extInfoMap;

        @NameInMap("IsvTypeEnumList")
        public java.util.List<String> isvTypeEnumList;

        @NameInMap("SupportTypeEnumList")
        public java.util.List<String> supportTypeEnumList;

        public static CompanyAndMainUserCreateResponseBodyCompanyExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyAndMainUserCreateResponseBodyCompanyExtraInfo self = new CompanyAndMainUserCreateResponseBodyCompanyExtraInfo();
            return TeaModel.build(map, self);
        }

        public CompanyAndMainUserCreateResponseBodyCompanyExtraInfo setExtInfoMap(String extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public String getExtInfoMap() {
            return this.extInfoMap;
        }

        public CompanyAndMainUserCreateResponseBodyCompanyExtraInfo setIsvTypeEnumList(java.util.List<String> isvTypeEnumList) {
            this.isvTypeEnumList = isvTypeEnumList;
            return this;
        }
        public java.util.List<String> getIsvTypeEnumList() {
            return this.isvTypeEnumList;
        }

        public CompanyAndMainUserCreateResponseBodyCompanyExtraInfo setSupportTypeEnumList(java.util.List<String> supportTypeEnumList) {
            this.supportTypeEnumList = supportTypeEnumList;
            return this;
        }
        public java.util.List<String> getSupportTypeEnumList() {
            return this.supportTypeEnumList;
        }

    }

    public static class CompanyAndMainUserCreateResponseBodyCompany extends TeaModel {
        @NameInMap("ContactPerson")
        public String contactPerson;

        @NameInMap("ExtraInfo")
        public CompanyAndMainUserCreateResponseBodyCompanyExtraInfo extraInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Status")
        public String status;

        public static CompanyAndMainUserCreateResponseBodyCompany build(java.util.Map<String, ?> map) throws Exception {
            CompanyAndMainUserCreateResponseBodyCompany self = new CompanyAndMainUserCreateResponseBodyCompany();
            return TeaModel.build(map, self);
        }

        public CompanyAndMainUserCreateResponseBodyCompany setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }
        public String getContactPerson() {
            return this.contactPerson;
        }

        public CompanyAndMainUserCreateResponseBodyCompany setExtraInfo(CompanyAndMainUserCreateResponseBodyCompanyExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public CompanyAndMainUserCreateResponseBodyCompanyExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public CompanyAndMainUserCreateResponseBodyCompany setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CompanyAndMainUserCreateResponseBodyCompany setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CompanyAndMainUserCreateResponseBodyCompany setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CompanyAndMainUserCreateResponseBodyCompany setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompanyAndMainUserCreateResponseBodyCompany setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CompanyAndMainUserCreateResponseBodyCompany setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CompanyAndMainUserCreateResponseBodyMain extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("AliyunUidType")
        public String aliyunUidType;

        @NameInMap("CompanyId")
        public Long companyId;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Ext1")
        public String ext1;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Status")
        public String status;

        public static CompanyAndMainUserCreateResponseBodyMain build(java.util.Map<String, ?> map) throws Exception {
            CompanyAndMainUserCreateResponseBodyMain self = new CompanyAndMainUserCreateResponseBodyMain();
            return TeaModel.build(map, self);
        }

        public CompanyAndMainUserCreateResponseBodyMain setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public CompanyAndMainUserCreateResponseBodyMain setAliyunUidType(String aliyunUidType) {
            this.aliyunUidType = aliyunUidType;
            return this;
        }
        public String getAliyunUidType() {
            return this.aliyunUidType;
        }

        public CompanyAndMainUserCreateResponseBodyMain setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public CompanyAndMainUserCreateResponseBodyMain setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public CompanyAndMainUserCreateResponseBodyMain setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CompanyAndMainUserCreateResponseBodyMain setExt1(String ext1) {
            this.ext1 = ext1;
            return this;
        }
        public String getExt1() {
            return this.ext1;
        }

        public CompanyAndMainUserCreateResponseBodyMain setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CompanyAndMainUserCreateResponseBodyMain setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CompanyAndMainUserCreateResponseBodyMain setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompanyAndMainUserCreateResponseBodyMain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompanyAndMainUserCreateResponseBodyMain setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CompanyAndMainUserCreateResponseBodyMain setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
