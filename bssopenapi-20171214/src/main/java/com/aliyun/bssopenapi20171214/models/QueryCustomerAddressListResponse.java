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

    }

    public static class QueryCustomerAddressListResponseDataCustomerInvoiceAddressList extends TeaModel {
        @NameInMap("CustomerInvoiceAddress")
        @Validation(required = true)
        public java.util.List<QueryCustomerAddressListResponseDataCustomerInvoiceAddressListCustomerInvoiceAddress> customerInvoiceAddress;

        public static QueryCustomerAddressListResponseDataCustomerInvoiceAddressList build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerAddressListResponseDataCustomerInvoiceAddressList self = new QueryCustomerAddressListResponseDataCustomerInvoiceAddressList();
            return TeaModel.build(map, self);
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

    }

}
