// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCustomerAddressListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryCustomerAddressListResponseData data;

    public static QueryCustomerAddressListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerAddressListResponse self = new QueryCustomerAddressListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerAddressListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomerAddressListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCustomerAddressListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCustomerAddressListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomerAddressListResponse setData(QueryCustomerAddressListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryCustomerAddressListResponseData getData() {
        return this.data;
    }

    public static class QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("UserId")
        @Validation(required = true)
        public Long userId;

        @NameInMap("UserNick")
        @Validation(required = true)
        public String userNick;

        @NameInMap("Addressee")
        @Validation(required = true)
        public String addressee;

        @NameInMap("Province")
        @Validation(required = true)
        public String province;

        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("County")
        @Validation(required = true)
        public String county;

        @NameInMap("Street")
        @Validation(required = true)
        public String street;

        @NameInMap("PostalCode")
        @Validation(required = true)
        public String postalCode;

        @NameInMap("Phone")
        @Validation(required = true)
        public String phone;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("DeliveryAddress")
        @Validation(required = true)
        public String deliveryAddress;

        public static QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress self = new QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress();
            return TeaModel.build(map, self);
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setAddressee(String addressee) {
            this.addressee = addressee;
            return this;
        }
        public String getAddressee() {
            return this.addressee;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setCounty(String county) {
            this.county = county;
            return this;
        }
        public String getCounty() {
            return this.county;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setStreet(String street) {
            this.street = street;
            return this;
        }
        public String getStreet() {
            return this.street;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

    }

    public static class QueryCustomerAddressListResponseDataCustomerInvoiceAddressList extends TeaModel {
        @NameInMap("CustomerInvoiceAddress")
        @Validation(required = true)
        public java.util.List<QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress> customerInvoiceAddress;

        public static QueryCustomerAddressListResponseDataCustomerInvoiceAddressList build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerAddressListResponseDataCustomerInvoiceAddressList self = new QueryCustomerAddressListResponseDataCustomerInvoiceAddressList();
            return TeaModel.build(map, self);
        }

        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressList setCustomerInvoiceAddress(java.util.List<QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress> customerInvoiceAddress) {
            this.customerInvoiceAddress = customerInvoiceAddress;
            return this;
        }
        public java.util.List<QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress> getCustomerInvoiceAddress() {
            return this.customerInvoiceAddress;
        }

    }

    public static class QueryCustomerAddressListResponseData extends TeaModel {
        @NameInMap("CustomerInvoiceAddressList")
        @Validation(required = true)
        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressList customerInvoiceAddressList;

        public static QueryCustomerAddressListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerAddressListResponseData self = new QueryCustomerAddressListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryCustomerAddressListResponseData setCustomerInvoiceAddressList(QueryCustomerAddressListResponseDataCustomerInvoiceAddressList customerInvoiceAddressList) {
            this.customerInvoiceAddressList = customerInvoiceAddressList;
            return this;
        }
        public QueryCustomerAddressListResponseDataCustomerInvoiceAddressList getCustomerInvoiceAddressList() {
            return this.customerInvoiceAddressList;
        }

    }

}
