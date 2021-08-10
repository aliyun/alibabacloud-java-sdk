// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCopyrightPersonDetailResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetCopyrightPersonDetailResponseBodyData data;

    public static GetCopyrightPersonDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCopyrightPersonDetailResponseBody self = new GetCopyrightPersonDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCopyrightPersonDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCopyrightPersonDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCopyrightPersonDetailResponseBody setData(GetCopyrightPersonDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCopyrightPersonDetailResponseBodyData getData() {
        return this.data;
    }

    public static class GetCopyrightPersonDetailResponseBodyData extends TeaModel {
        @NameInMap("LegalPersonType")
        public String legalPersonType;

        @NameInMap("RoleType")
        public Integer roleType;

        @NameInMap("EnterpriseLicensePath")
        public String enterpriseLicensePath;

        @NameInMap("City")
        public String city;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("IdBackImage")
        public String idBackImage;

        @NameInMap("County")
        public String county;

        @NameInMap("EnterpriseTime")
        public String enterpriseTime;

        @NameInMap("UserPk")
        public String userPk;

        @NameInMap("CardType")
        public String cardType;

        @NameInMap("Email")
        public String email;

        @NameInMap("CardNum")
        public String cardNum;

        @NameInMap("EnterprisePark")
        public String enterprisePark;

        @NameInMap("Address")
        public String address;

        @NameInMap("OwnerType")
        public Integer ownerType;

        @NameInMap("Name")
        public String name;

        @NameInMap("IdFrontImage")
        public String idFrontImage;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("Province")
        public String province;

        @NameInMap("IdHandedImage")
        public String idHandedImage;

        @NameInMap("EnterpriseType")
        public String enterpriseType;

        public static GetCopyrightPersonDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCopyrightPersonDetailResponseBodyData self = new GetCopyrightPersonDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCopyrightPersonDetailResponseBodyData setLegalPersonType(String legalPersonType) {
            this.legalPersonType = legalPersonType;
            return this;
        }
        public String getLegalPersonType() {
            return this.legalPersonType;
        }

        public GetCopyrightPersonDetailResponseBodyData setRoleType(Integer roleType) {
            this.roleType = roleType;
            return this;
        }
        public Integer getRoleType() {
            return this.roleType;
        }

        public GetCopyrightPersonDetailResponseBodyData setEnterpriseLicensePath(String enterpriseLicensePath) {
            this.enterpriseLicensePath = enterpriseLicensePath;
            return this;
        }
        public String getEnterpriseLicensePath() {
            return this.enterpriseLicensePath;
        }

        public GetCopyrightPersonDetailResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetCopyrightPersonDetailResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCopyrightPersonDetailResponseBodyData setIdBackImage(String idBackImage) {
            this.idBackImage = idBackImage;
            return this;
        }
        public String getIdBackImage() {
            return this.idBackImage;
        }

        public GetCopyrightPersonDetailResponseBodyData setCounty(String county) {
            this.county = county;
            return this;
        }
        public String getCounty() {
            return this.county;
        }

        public GetCopyrightPersonDetailResponseBodyData setEnterpriseTime(String enterpriseTime) {
            this.enterpriseTime = enterpriseTime;
            return this;
        }
        public String getEnterpriseTime() {
            return this.enterpriseTime;
        }

        public GetCopyrightPersonDetailResponseBodyData setUserPk(String userPk) {
            this.userPk = userPk;
            return this;
        }
        public String getUserPk() {
            return this.userPk;
        }

        public GetCopyrightPersonDetailResponseBodyData setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public GetCopyrightPersonDetailResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCopyrightPersonDetailResponseBodyData setCardNum(String cardNum) {
            this.cardNum = cardNum;
            return this;
        }
        public String getCardNum() {
            return this.cardNum;
        }

        public GetCopyrightPersonDetailResponseBodyData setEnterprisePark(String enterprisePark) {
            this.enterprisePark = enterprisePark;
            return this;
        }
        public String getEnterprisePark() {
            return this.enterprisePark;
        }

        public GetCopyrightPersonDetailResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetCopyrightPersonDetailResponseBodyData setOwnerType(Integer ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public Integer getOwnerType() {
            return this.ownerType;
        }

        public GetCopyrightPersonDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCopyrightPersonDetailResponseBodyData setIdFrontImage(String idFrontImage) {
            this.idFrontImage = idFrontImage;
            return this;
        }
        public String getIdFrontImage() {
            return this.idFrontImage;
        }

        public GetCopyrightPersonDetailResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetCopyrightPersonDetailResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetCopyrightPersonDetailResponseBodyData setIdHandedImage(String idHandedImage) {
            this.idHandedImage = idHandedImage;
            return this;
        }
        public String getIdHandedImage() {
            return this.idHandedImage;
        }

        public GetCopyrightPersonDetailResponseBodyData setEnterpriseType(String enterpriseType) {
            this.enterpriseType = enterpriseType;
            return this;
        }
        public String getEnterpriseType() {
            return this.enterpriseType;
        }

    }

}
