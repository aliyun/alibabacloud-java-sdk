// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketCreateOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Contact")
    public TicketCreateOrderRequestContact contact;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DistributorOrderId")
    public String distributorOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderProduct")
    public TicketCreateOrderRequestOrderProduct orderProduct;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TotalDistributionPrice")
    public TicketCreateOrderRequestTotalDistributionPrice totalDistributionPrice;

    @NameInMap("Travelers")
    public java.util.List<TicketCreateOrderRequestTravelers> travelers;

    public static TicketCreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketCreateOrderRequest self = new TicketCreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public TicketCreateOrderRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public TicketCreateOrderRequest setContact(TicketCreateOrderRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public TicketCreateOrderRequestContact getContact() {
        return this.contact;
    }

    public TicketCreateOrderRequest setDistributorOrderId(String distributorOrderId) {
        this.distributorOrderId = distributorOrderId;
        return this;
    }
    public String getDistributorOrderId() {
        return this.distributorOrderId;
    }

    public TicketCreateOrderRequest setOrderProduct(TicketCreateOrderRequestOrderProduct orderProduct) {
        this.orderProduct = orderProduct;
        return this;
    }
    public TicketCreateOrderRequestOrderProduct getOrderProduct() {
        return this.orderProduct;
    }

    public TicketCreateOrderRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public TicketCreateOrderRequest setTotalDistributionPrice(TicketCreateOrderRequestTotalDistributionPrice totalDistributionPrice) {
        this.totalDistributionPrice = totalDistributionPrice;
        return this;
    }
    public TicketCreateOrderRequestTotalDistributionPrice getTotalDistributionPrice() {
        return this.totalDistributionPrice;
    }

    public TicketCreateOrderRequest setTravelers(java.util.List<TicketCreateOrderRequestTravelers> travelers) {
        this.travelers = travelers;
        return this;
    }
    public java.util.List<TicketCreateOrderRequestTravelers> getTravelers() {
        return this.travelers;
    }

    public static class TicketCreateOrderRequestContact extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11010519900301001X</p>
         */
        @NameInMap("CertificateNo")
        public String certificateNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CertificateType")
        public Integer certificateType;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("DialingCode")
        public String dialingCode;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.com">test@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>13800000000</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Name")
        public String name;

        public static TicketCreateOrderRequestContact build(java.util.Map<String, ?> map) throws Exception {
            TicketCreateOrderRequestContact self = new TicketCreateOrderRequestContact();
            return TeaModel.build(map, self);
        }

        public TicketCreateOrderRequestContact setCertificateNo(String certificateNo) {
            this.certificateNo = certificateNo;
            return this;
        }
        public String getCertificateNo() {
            return this.certificateNo;
        }

        public TicketCreateOrderRequestContact setCertificateType(Integer certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public Integer getCertificateType() {
            return this.certificateType;
        }

        public TicketCreateOrderRequestContact setDialingCode(String dialingCode) {
            this.dialingCode = dialingCode;
            return this;
        }
        public String getDialingCode() {
            return this.dialingCode;
        }

        public TicketCreateOrderRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public TicketCreateOrderRequestContact setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public TicketCreateOrderRequestContact setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public TicketCreateOrderRequestContact setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public TicketCreateOrderRequestContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TicketCreateOrderRequestOrderProductDistributionPrice extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketCreateOrderRequestOrderProductDistributionPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketCreateOrderRequestOrderProductDistributionPrice self = new TicketCreateOrderRequestOrderProductDistributionPrice();
            return TeaModel.build(map, self);
        }

        public TicketCreateOrderRequestOrderProductDistributionPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketCreateOrderRequestOrderProductDistributionPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketCreateOrderRequestOrderProduct extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DistributionPrice")
        public TicketCreateOrderRequestOrderProductDistributionPrice distributionPrice;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01</p>
         */
        @NameInMap("TravelDate")
        public String travelDate;

        public static TicketCreateOrderRequestOrderProduct build(java.util.Map<String, ?> map) throws Exception {
            TicketCreateOrderRequestOrderProduct self = new TicketCreateOrderRequestOrderProduct();
            return TeaModel.build(map, self);
        }

        public TicketCreateOrderRequestOrderProduct setDistributionPrice(TicketCreateOrderRequestOrderProductDistributionPrice distributionPrice) {
            this.distributionPrice = distributionPrice;
            return this;
        }
        public TicketCreateOrderRequestOrderProductDistributionPrice getDistributionPrice() {
            return this.distributionPrice;
        }

        public TicketCreateOrderRequestOrderProduct setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public TicketCreateOrderRequestOrderProduct setTravelDate(String travelDate) {
            this.travelDate = travelDate;
            return this;
        }
        public String getTravelDate() {
            return this.travelDate;
        }

    }

    public static class TicketCreateOrderRequestTotalDistributionPrice extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketCreateOrderRequestTotalDistributionPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketCreateOrderRequestTotalDistributionPrice self = new TicketCreateOrderRequestTotalDistributionPrice();
            return TeaModel.build(map, self);
        }

        public TicketCreateOrderRequestTotalDistributionPrice setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketCreateOrderRequestTotalDistributionPrice setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketCreateOrderRequestTravelers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1990-01-01</p>
         */
        @NameInMap("Birthday")
        public String birthday;

        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("CertificateNo")
        public String certificateNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CertificateType")
        public Integer certificateType;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("DialingCode")
        public String dialingCode;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:example@example.com">example@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>Zhang</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>San</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>13800000000</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Nationality")
        public String nationality;

        public static TicketCreateOrderRequestTravelers build(java.util.Map<String, ?> map) throws Exception {
            TicketCreateOrderRequestTravelers self = new TicketCreateOrderRequestTravelers();
            return TeaModel.build(map, self);
        }

        public TicketCreateOrderRequestTravelers setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public TicketCreateOrderRequestTravelers setCertificateNo(String certificateNo) {
            this.certificateNo = certificateNo;
            return this;
        }
        public String getCertificateNo() {
            return this.certificateNo;
        }

        public TicketCreateOrderRequestTravelers setCertificateType(Integer certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public Integer getCertificateType() {
            return this.certificateType;
        }

        public TicketCreateOrderRequestTravelers setDialingCode(String dialingCode) {
            this.dialingCode = dialingCode;
            return this;
        }
        public String getDialingCode() {
            return this.dialingCode;
        }

        public TicketCreateOrderRequestTravelers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public TicketCreateOrderRequestTravelers setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public TicketCreateOrderRequestTravelers setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public TicketCreateOrderRequestTravelers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public TicketCreateOrderRequestTravelers setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public TicketCreateOrderRequestTravelers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TicketCreateOrderRequestTravelers setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

    }

}
