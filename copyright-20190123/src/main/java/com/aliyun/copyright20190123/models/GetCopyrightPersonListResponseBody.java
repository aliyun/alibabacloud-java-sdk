// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCopyrightPersonListResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("Data")
    public java.util.List<GetCopyrightPersonListResponseBodyData> data;

    public static GetCopyrightPersonListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCopyrightPersonListResponseBody self = new GetCopyrightPersonListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCopyrightPersonListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetCopyrightPersonListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCopyrightPersonListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCopyrightPersonListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCopyrightPersonListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public GetCopyrightPersonListResponseBody setData(java.util.List<GetCopyrightPersonListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCopyrightPersonListResponseBodyData> getData() {
        return this.data;
    }

    public static class GetCopyrightPersonListResponseBodyData extends TeaModel {
        @NameInMap("LegalPersonType")
        public String legalPersonType;

        @NameInMap("RoleType")
        public Integer roleType;

        @NameInMap("City")
        public String city;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("County")
        public String county;

        @NameInMap("UserPk")
        public String userPk;

        @NameInMap("CardType")
        public String cardType;

        @NameInMap("Email")
        public String email;

        @NameInMap("CardNum")
        public String cardNum;

        @NameInMap("Address")
        public String address;

        @NameInMap("OwnerType")
        public Integer ownerType;

        @NameInMap("Name")
        public String name;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("Province")
        public String province;

        public static GetCopyrightPersonListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCopyrightPersonListResponseBodyData self = new GetCopyrightPersonListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCopyrightPersonListResponseBodyData setLegalPersonType(String legalPersonType) {
            this.legalPersonType = legalPersonType;
            return this;
        }
        public String getLegalPersonType() {
            return this.legalPersonType;
        }

        public GetCopyrightPersonListResponseBodyData setRoleType(Integer roleType) {
            this.roleType = roleType;
            return this;
        }
        public Integer getRoleType() {
            return this.roleType;
        }

        public GetCopyrightPersonListResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetCopyrightPersonListResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCopyrightPersonListResponseBodyData setCounty(String county) {
            this.county = county;
            return this;
        }
        public String getCounty() {
            return this.county;
        }

        public GetCopyrightPersonListResponseBodyData setUserPk(String userPk) {
            this.userPk = userPk;
            return this;
        }
        public String getUserPk() {
            return this.userPk;
        }

        public GetCopyrightPersonListResponseBodyData setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public GetCopyrightPersonListResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCopyrightPersonListResponseBodyData setCardNum(String cardNum) {
            this.cardNum = cardNum;
            return this;
        }
        public String getCardNum() {
            return this.cardNum;
        }

        public GetCopyrightPersonListResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetCopyrightPersonListResponseBodyData setOwnerType(Integer ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public Integer getOwnerType() {
            return this.ownerType;
        }

        public GetCopyrightPersonListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCopyrightPersonListResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetCopyrightPersonListResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
