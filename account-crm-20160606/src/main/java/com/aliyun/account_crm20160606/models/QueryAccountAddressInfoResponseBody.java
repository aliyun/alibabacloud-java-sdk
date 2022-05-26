// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountAddressInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProfileInfo")
    public QueryAccountAddressInfoResponseBodyProfileInfo profileInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAccountAddressInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountAddressInfoResponseBody self = new QueryAccountAddressInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountAddressInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountAddressInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountAddressInfoResponseBody setProfileInfo(QueryAccountAddressInfoResponseBodyProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }
    public QueryAccountAddressInfoResponseBodyProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public QueryAccountAddressInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountAddressInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccountAddressInfoResponseBodyProfileInfoCity extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryAccountAddressInfoResponseBodyProfileInfoCity build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountAddressInfoResponseBodyProfileInfoCity self = new QueryAccountAddressInfoResponseBodyProfileInfoCity();
            return TeaModel.build(map, self);
        }

        public QueryAccountAddressInfoResponseBodyProfileInfoCity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfoCity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAccountAddressInfoResponseBodyProfileInfoProvince extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryAccountAddressInfoResponseBodyProfileInfoProvince build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountAddressInfoResponseBodyProfileInfoProvince self = new QueryAccountAddressInfoResponseBodyProfileInfoProvince();
            return TeaModel.build(map, self);
        }

        public QueryAccountAddressInfoResponseBodyProfileInfoProvince setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfoProvince setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAccountAddressInfoResponseBodyProfileInfo extends TeaModel {
        @NameInMap("AccountAttr")
        public String accountAttr;

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

        @NameInMap("City")
        public QueryAccountAddressInfoResponseBodyProfileInfoCity city;

        @NameInMap("Email")
        public String email;

        @NameInMap("HavanaId")
        public String havanaId;

        @NameInMap("NationalityCode")
        public String nationalityCode;

        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("Province")
        public QueryAccountAddressInfoResponseBodyProfileInfoProvince province;

        @NameInMap("TrueName")
        public String trueName;

        @NameInMap("Version")
        public String version;

        public static QueryAccountAddressInfoResponseBodyProfileInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountAddressInfoResponseBodyProfileInfo self = new QueryAccountAddressInfoResponseBodyProfileInfo();
            return TeaModel.build(map, self);
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setAccountAttr(String accountAttr) {
            this.accountAttr = accountAttr;
            return this;
        }
        public String getAccountAttr() {
            return this.accountAttr;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }
        public String getAddress2() {
            return this.address2;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setAddress3(String address3) {
            this.address3 = address3;
            return this;
        }
        public String getAddress3() {
            return this.address3;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setAddress4(String address4) {
            this.address4 = address4;
            return this;
        }
        public String getAddress4() {
            return this.address4;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setAddress5(String address5) {
            this.address5 = address5;
            return this;
        }
        public String getAddress5() {
            return this.address5;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setAddress6(String address6) {
            this.address6 = address6;
            return this;
        }
        public String getAddress6() {
            return this.address6;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setCity(QueryAccountAddressInfoResponseBodyProfileInfoCity city) {
            this.city = city;
            return this;
        }
        public QueryAccountAddressInfoResponseBodyProfileInfoCity getCity() {
            return this.city;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setHavanaId(String havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public String getHavanaId() {
            return this.havanaId;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setProvince(QueryAccountAddressInfoResponseBodyProfileInfoProvince province) {
            this.province = province;
            return this;
        }
        public QueryAccountAddressInfoResponseBodyProfileInfoProvince getProvince() {
            return this.province;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setTrueName(String trueName) {
            this.trueName = trueName;
            return this;
        }
        public String getTrueName() {
            return this.trueName;
        }

        public QueryAccountAddressInfoResponseBodyProfileInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
