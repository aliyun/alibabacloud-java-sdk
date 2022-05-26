// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountAddressInfoWithoutHavanaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProfileInfo")
    public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo profileInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAccountAddressInfoWithoutHavanaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountAddressInfoWithoutHavanaResponseBody self = new QueryAccountAddressInfoWithoutHavanaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountAddressInfoWithoutHavanaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountAddressInfoWithoutHavanaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountAddressInfoWithoutHavanaResponseBody setProfileInfo(QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }
    public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public QueryAccountAddressInfoWithoutHavanaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountAddressInfoWithoutHavanaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity self = new QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity();
            return TeaModel.build(map, self);
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince self = new QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince();
            return TeaModel.build(map, self);
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo extends TeaModel {
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
        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity city;

        @NameInMap("HavanaId")
        public String havanaId;

        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("Province")
        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince province;

        @NameInMap("TrueName")
        public String trueName;

        @NameInMap("Version")
        public String version;

        public static QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo self = new QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo();
            return TeaModel.build(map, self);
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setAccountAttr(String accountAttr) {
            this.accountAttr = accountAttr;
            return this;
        }
        public String getAccountAttr() {
            return this.accountAttr;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }
        public String getAddress2() {
            return this.address2;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setAddress3(String address3) {
            this.address3 = address3;
            return this;
        }
        public String getAddress3() {
            return this.address3;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setAddress4(String address4) {
            this.address4 = address4;
            return this;
        }
        public String getAddress4() {
            return this.address4;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setAddress5(String address5) {
            this.address5 = address5;
            return this;
        }
        public String getAddress5() {
            return this.address5;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setAddress6(String address6) {
            this.address6 = address6;
            return this;
        }
        public String getAddress6() {
            return this.address6;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setCity(QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity city) {
            this.city = city;
            return this;
        }
        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoCity getCity() {
            return this.city;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setHavanaId(String havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public String getHavanaId() {
            return this.havanaId;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setProvince(QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince province) {
            this.province = province;
            return this;
        }
        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfoProvince getProvince() {
            return this.province;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setTrueName(String trueName) {
            this.trueName = trueName;
            return this;
        }
        public String getTrueName() {
            return this.trueName;
        }

        public QueryAccountAddressInfoWithoutHavanaResponseBodyProfileInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
