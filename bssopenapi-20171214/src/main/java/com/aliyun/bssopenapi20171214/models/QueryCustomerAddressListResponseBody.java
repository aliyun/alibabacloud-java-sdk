// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCustomerAddressListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryCustomerAddressListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomerAddressListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerAddressListResponseBody self = new QueryCustomerAddressListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomerAddressListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCustomerAddressListResponseBody setData(QueryCustomerAddressListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCustomerAddressListResponseBodyData getData() {
        return this.data;
    }

    public QueryCustomerAddressListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomerAddressListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomerAddressListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress extends TeaModel {
        @NameInMap("Addressee")
        public String addressee;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("City")
        public String city;

        @NameInMap("County")
        public String county;

        @NameInMap("DeliveryAddress")
        public String deliveryAddress;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("PostalCode")
        public String postalCode;

        @NameInMap("Province")
        public String province;

        @NameInMap("Street")
        public String street;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserNick")
        public String userNick;

        public static QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress self = new QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress();
            return TeaModel.build(map, self);
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setAddressee(String addressee) {
            this.addressee = addressee;
            return this;
        }
        public String getAddressee() {
            return this.addressee;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setCounty(String county) {
            this.county = county;
            return this;
        }
        public String getCounty() {
            return this.county;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setStreet(String street) {
            this.street = street;
            return this;
        }
        public String getStreet() {
            return this.street;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList extends TeaModel {
        @NameInMap("CustomerInvoiceAddress")
        public java.util.List<QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress> customerInvoiceAddress;

        public static QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList self = new QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList();
            return TeaModel.build(map, self);
        }

        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList setCustomerInvoiceAddress(java.util.List<QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress> customerInvoiceAddress) {
            this.customerInvoiceAddress = customerInvoiceAddress;
            return this;
        }
        public java.util.List<QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressListCustomerInvoiceAddress> getCustomerInvoiceAddress() {
            return this.customerInvoiceAddress;
        }

    }

    public static class QueryCustomerAddressListResponseBodyData extends TeaModel {
        @NameInMap("CustomerInvoiceAddressList")
        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList customerInvoiceAddressList;

        public static QueryCustomerAddressListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerAddressListResponseBodyData self = new QueryCustomerAddressListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomerAddressListResponseBodyData setCustomerInvoiceAddressList(QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList customerInvoiceAddressList) {
            this.customerInvoiceAddressList = customerInvoiceAddressList;
            return this;
        }
        public QueryCustomerAddressListResponseBodyDataCustomerInvoiceAddressList getCustomerInvoiceAddressList() {
            return this.customerInvoiceAddressList;
        }

    }

}
