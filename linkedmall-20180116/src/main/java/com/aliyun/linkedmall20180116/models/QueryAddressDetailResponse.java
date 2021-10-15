// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressDetailResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DeliveryAddress")
    @Validation(required = true)
    public QueryAddressDetailResponseDeliveryAddress deliveryAddress;

    public static QueryAddressDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressDetailResponse self = new QueryAddressDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAddressDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAddressDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAddressDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAddressDetailResponse setDeliveryAddress(QueryAddressDetailResponseDeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public QueryAddressDetailResponseDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public static class QueryAddressDetailResponseDeliveryAddress extends TeaModel {
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

        @NameInMap("Area")
        @Validation(required = true)
        public String area;

        @NameInMap("DivisionCode")
        @Validation(required = true)
        public String divisionCode;

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

        public static QueryAddressDetailResponseDeliveryAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressDetailResponseDeliveryAddress self = new QueryAddressDetailResponseDeliveryAddress();
            return TeaModel.build(map, self);
        }

        public QueryAddressDetailResponseDeliveryAddress setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public QueryAddressDetailResponseDeliveryAddress setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public QueryAddressDetailResponseDeliveryAddress setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAddressDetailResponseDeliveryAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryAddressDetailResponseDeliveryAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryAddressDetailResponseDeliveryAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryAddressDetailResponseDeliveryAddress setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public QueryAddressDetailResponseDeliveryAddress setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public QueryAddressDetailResponseDeliveryAddress setTown(String town) {
            this.town = town;
            return this;
        }
        public String getTown() {
            return this.town;
        }

        public QueryAddressDetailResponseDeliveryAddress setTownDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

        public QueryAddressDetailResponseDeliveryAddress setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public QueryAddressDetailResponseDeliveryAddress setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAddressDetailResponseDeliveryAddress setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
