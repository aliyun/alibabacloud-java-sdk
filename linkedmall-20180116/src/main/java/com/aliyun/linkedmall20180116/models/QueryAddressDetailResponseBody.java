// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeliveryAddress")
    public QueryAddressDetailResponseBodyDeliveryAddress deliveryAddress;

    @NameInMap("Code")
    public String code;

    public static QueryAddressDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressDetailResponseBody self = new QueryAddressDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAddressDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAddressDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAddressDetailResponseBody setDeliveryAddress(QueryAddressDetailResponseBodyDeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public QueryAddressDetailResponseBodyDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public QueryAddressDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryAddressDetailResponseBodyDeliveryAddress extends TeaModel {
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

        @NameInMap("TownDivisionCode")
        public String townDivisionCode;

        @NameInMap("Area")
        public String area;

        @NameInMap("Town")
        public String town;

        @NameInMap("Province")
        public String province;

        public static QueryAddressDetailResponseBodyDeliveryAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressDetailResponseBodyDeliveryAddress self = new QueryAddressDetailResponseBodyDeliveryAddress();
            return TeaModel.build(map, self);
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setTownDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setTown(String town) {
            this.town = town;
            return this;
        }
        public String getTown() {
            return this.town;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
