// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AddressList")
    public java.util.List<QueryAddressListResponseBodyAddressList> addressList;

    public static QueryAddressListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressListResponseBody self = new QueryAddressListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAddressListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAddressListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAddressListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAddressListResponseBody setAddressList(java.util.List<QueryAddressListResponseBodyAddressList> addressList) {
        this.addressList = addressList;
        return this;
    }
    public java.util.List<QueryAddressListResponseBodyAddressList> getAddressList() {
        return this.addressList;
    }

    public static class QueryAddressListResponseBodyAddressList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("AddressDetail")
        public String addressDetail;

        @NameInMap("City")
        public String city;

        @NameInMap("AddressId")
        public Long addressId;

        @NameInMap("DivisionCode")
        public String divisionCode;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Country")
        public String country;

        @NameInMap("Area")
        public String area;

        @NameInMap("TownDivisionCode")
        public String townDivisionCode;

        @NameInMap("Town")
        public String town;

        @NameInMap("Province")
        public String province;

        public static QueryAddressListResponseBodyAddressList build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressListResponseBodyAddressList self = new QueryAddressListResponseBodyAddressList();
            return TeaModel.build(map, self);
        }

        public QueryAddressListResponseBodyAddressList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAddressListResponseBodyAddressList setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAddressListResponseBodyAddressList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public QueryAddressListResponseBodyAddressList setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public QueryAddressListResponseBodyAddressList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryAddressListResponseBodyAddressList setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public QueryAddressListResponseBodyAddressList setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public QueryAddressListResponseBodyAddressList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAddressListResponseBodyAddressList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryAddressListResponseBodyAddressList setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public QueryAddressListResponseBodyAddressList setTownDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

        public QueryAddressListResponseBodyAddressList setTown(String town) {
            this.town = town;
            return this;
        }
        public String getTown() {
            return this.town;
        }

        public QueryAddressListResponseBodyAddressList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
