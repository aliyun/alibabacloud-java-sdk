// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DeliveryAddress")
    public QueryAddressDetailResponseBodyDeliveryAddress deliveryAddress;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6103AD7B-21C2-523B-89D0-579DA58D08E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAddressDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressDetailResponseBody self = new QueryAddressDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAddressDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAddressDetailResponseBody setDeliveryAddress(QueryAddressDetailResponseBodyDeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public QueryAddressDetailResponseBodyDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
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

    public static class QueryAddressDetailResponseBodyDeliveryAddress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <strong>example:</strong>
         * <p>313312207</p>
         */
        @NameInMap("AddressId")
        public Long addressId;

        /**
         * <strong>example:</strong>
         * <p>fujian</p>
         */
        @NameInMap("Area")
        public String area;

        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>321112104</p>
         */
        @NameInMap("DivisionCode")
        public String divisionCode;

        @NameInMap("FullName")
        public String fullName;

        /**
         * <strong>example:</strong>
         * <p>18941288583</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>518055</p>
         */
        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("Province")
        public String province;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Town")
        public String town;

        @NameInMap("TownDivisionCode")
        public String townDivisionCode;

        public static QueryAddressDetailResponseBodyDeliveryAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressDetailResponseBodyDeliveryAddress self = new QueryAddressDetailResponseBodyDeliveryAddress();
            return TeaModel.build(map, self);
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Long getAddressId() {
            return this.addressId;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setDivisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public String getDivisionCode() {
            return this.divisionCode;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setTown(String town) {
            this.town = town;
            return this;
        }
        public String getTown() {
            return this.town;
        }

        public QueryAddressDetailResponseBodyDeliveryAddress setTownDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

    }

}
