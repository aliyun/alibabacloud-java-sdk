// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddressList")
    @Validation(required = true)
    public java.util.List<QueryAddressListResponseAddressList> addressList;

    public static QueryAddressListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressListResponse self = new QueryAddressListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAddressListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAddressListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAddressListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAddressListResponse setAddressList(java.util.List<QueryAddressListResponseAddressList> addressList) {
        this.addressList = addressList;
        return this;
    }
    public java.util.List<QueryAddressListResponseAddressList> getAddressList() {
        return this.addressList;
    }

    public static class QueryAddressListResponseAddressList extends TeaModel {
        @NameInMap("AddressId")
        @Validation(required = true)
        public Long addressId;

        @NameInMap("FullName")
        @Validation(required = true)
        public String fullName;

        @NameInMap("Mobile")
        @Validation(required = true)
        public String mobile;

        @NameInMap("Country")
        @Validation(required = true)
        public String country;

        @NameInMap("Province")
        @Validation(required = true)
        public String province;

        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("Town")
        @Validation(required = true)
        public String town;

        @NameInMap("TownDivisionCode")
        @Validation(required = true)
        public String townDivisionCode;

        @NameInMap("AddressDetail")
        @Validation(required = true)
        public String addressDetail;

        @NameInMap("PostCode")
        @Validation(required = true)
        public String postCode;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("DivisionCode")
        @Validation(required = true)
        public String divisionCode;

        @NameInMap("Area")
        @Validation(required = true)
        public String area;

        public static QueryAddressListResponseAddressList build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressListResponseAddressList self = new QueryAddressListResponseAddressList();
            return TeaModel.build(map, self);
        }

        public QueryAddressListResponseAddressList setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public QueryAddressListResponseAddressList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public QueryAddressListResponseAddressList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAddressListResponseAddressList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryAddressListResponseAddressList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryAddressListResponseAddressList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryAddressListResponseAddressList setTown(String town) {
            this.town = town;
            return this;
        }
        public String getTown() {
            return this.town;
        }

        public QueryAddressListResponseAddressList setTownDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

        public QueryAddressListResponseAddressList setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public QueryAddressListResponseAddressList setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAddressListResponseAddressList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAddressListResponseAddressList setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public QueryAddressListResponseAddressList setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

    }

}
