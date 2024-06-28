// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCustomerAddressListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryCustomerAddressListResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BBEF51A3-E933-4F40-A534-C673CBDB9C80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The addressee.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Addressee")
        public String addressee;

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The city to which the invoice is mailed.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The name of the district to which the invoice is mailed.</p>
         * 
         * <strong>example:</strong>
         * <p>Test District</p>
         */
        @NameInMap("County")
        public String county;

        /**
         * <p>The detailed address to which the invoice is mailed. This parameter is returned after fields are concatenated.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Address</p>
         */
        @NameInMap("DeliveryAddress")
        public String deliveryAddress;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>311601051</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The phone number of the addressee.</p>
         * 
         * <strong>example:</strong>
         * <p>138xxxxxxxx</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The postcode.</p>
         * 
         * <strong>example:</strong>
         * <p>000000</p>
         */
        @NameInMap("PostalCode")
        public String postalCode;

        /**
         * <p>The province to which the invoice is mailed.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The name of the street to which the invoice is mailed.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Street</p>
         */
        @NameInMap("Street")
        public String street;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>4382956342857</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>testNick</p>
         */
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
        /**
         * <p>The details of addresses to which invoices are mailed.</p>
         */
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
