// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class CreateSourcingProjectRequest extends TeaModel {
    @NameInMap("Address")
    public CreateSourcingProjectRequestAddress address;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizNo")
    public String bizNo;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Company")
    public CreateSourcingProjectRequestCompany company;

    @NameInMap("Contact")
    public CreateSourcingProjectRequestContact contact;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("ExtendInfo")
    public java.util.Map<String, String> extendInfo;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    @NameInMap("SubBizType")
    public String subBizType;

    @NameInMap("Subjects")
    public java.util.List<CreateSourcingProjectRequestSubjects> subjects;

    @NameInMap("Title")
    public String title;

    public static CreateSourcingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSourcingProjectRequest self = new CreateSourcingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSourcingProjectRequest setAddress(CreateSourcingProjectRequestAddress address) {
        this.address = address;
        return this;
    }
    public CreateSourcingProjectRequestAddress getAddress() {
        return this.address;
    }

    public CreateSourcingProjectRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateSourcingProjectRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateSourcingProjectRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateSourcingProjectRequest setCompany(CreateSourcingProjectRequestCompany company) {
        this.company = company;
        return this;
    }
    public CreateSourcingProjectRequestCompany getCompany() {
        return this.company;
    }

    public CreateSourcingProjectRequest setContact(CreateSourcingProjectRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public CreateSourcingProjectRequestContact getContact() {
        return this.contact;
    }

    public CreateSourcingProjectRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateSourcingProjectRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateSourcingProjectRequest setExtendInfo(java.util.Map<String, String> extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public java.util.Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public CreateSourcingProjectRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public CreateSourcingProjectRequest setSubBizType(String subBizType) {
        this.subBizType = subBizType;
        return this;
    }
    public String getSubBizType() {
        return this.subBizType;
    }

    public CreateSourcingProjectRequest setSubjects(java.util.List<CreateSourcingProjectRequestSubjects> subjects) {
        this.subjects = subjects;
        return this;
    }
    public java.util.List<CreateSourcingProjectRequestSubjects> getSubjects() {
        return this.subjects;
    }

    public CreateSourcingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateSourcingProjectRequestAddress extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("DistrictCode")
        public String districtCode;

        @NameInMap("ProvinceCode")
        public String provinceCode;

        public static CreateSourcingProjectRequestAddress build(java.util.Map<String, ?> map) throws Exception {
            CreateSourcingProjectRequestAddress self = new CreateSourcingProjectRequestAddress();
            return TeaModel.build(map, self);
        }

        public CreateSourcingProjectRequestAddress setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CreateSourcingProjectRequestAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateSourcingProjectRequestAddress setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public CreateSourcingProjectRequestAddress setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

    }

    public static class CreateSourcingProjectRequestCompany extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Uscc")
        public String uscc;

        public static CreateSourcingProjectRequestCompany build(java.util.Map<String, ?> map) throws Exception {
            CreateSourcingProjectRequestCompany self = new CreateSourcingProjectRequestCompany();
            return TeaModel.build(map, self);
        }

        public CreateSourcingProjectRequestCompany setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSourcingProjectRequestCompany setUscc(String uscc) {
            this.uscc = uscc;
            return this;
        }
        public String getUscc() {
            return this.uscc;
        }

    }

    public static class CreateSourcingProjectRequestContact extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phone")
        public String phone;

        public static CreateSourcingProjectRequestContact build(java.util.Map<String, ?> map) throws Exception {
            CreateSourcingProjectRequestContact self = new CreateSourcingProjectRequestContact();
            return TeaModel.build(map, self);
        }

        public CreateSourcingProjectRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateSourcingProjectRequestContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSourcingProjectRequestContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class CreateSourcingProjectRequestSubjectsAddress extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("DistrictCode")
        public String districtCode;

        @NameInMap("ProvinceCode")
        public String provinceCode;

        public static CreateSourcingProjectRequestSubjectsAddress build(java.util.Map<String, ?> map) throws Exception {
            CreateSourcingProjectRequestSubjectsAddress self = new CreateSourcingProjectRequestSubjectsAddress();
            return TeaModel.build(map, self);
        }

        public CreateSourcingProjectRequestSubjectsAddress setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CreateSourcingProjectRequestSubjectsAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateSourcingProjectRequestSubjectsAddress setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public CreateSourcingProjectRequestSubjectsAddress setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

    }

    public static class CreateSourcingProjectRequestSubjects extends TeaModel {
        @NameInMap("Address")
        public CreateSourcingProjectRequestSubjectsAddress address;

        @NameInMap("Code")
        public String code;

        @NameInMap("ExtendInfo")
        public java.util.Map<String, String> extendInfo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Quantity")
        public Double quantity;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Unit")
        public String unit;

        public static CreateSourcingProjectRequestSubjects build(java.util.Map<String, ?> map) throws Exception {
            CreateSourcingProjectRequestSubjects self = new CreateSourcingProjectRequestSubjects();
            return TeaModel.build(map, self);
        }

        public CreateSourcingProjectRequestSubjects setAddress(CreateSourcingProjectRequestSubjectsAddress address) {
            this.address = address;
            return this;
        }
        public CreateSourcingProjectRequestSubjectsAddress getAddress() {
            return this.address;
        }

        public CreateSourcingProjectRequestSubjects setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateSourcingProjectRequestSubjects setExtendInfo(java.util.Map<String, String> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        public CreateSourcingProjectRequestSubjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSourcingProjectRequestSubjects setQuantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Double getQuantity() {
            return this.quantity;
        }

        public CreateSourcingProjectRequestSubjects setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public CreateSourcingProjectRequestSubjects setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
