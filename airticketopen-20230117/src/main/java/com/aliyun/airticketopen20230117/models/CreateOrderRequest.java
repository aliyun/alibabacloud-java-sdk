// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
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
    public CreateOrderRequestContact contact;

    /**
     * <strong>example:</strong>
     * <p>EXT_ORDER_001</p>
     */
    @NameInMap("ExternalOrderNo")
    public String externalOrderNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Guests")
    public java.util.List<java.util.List<CreateOrderRequestGuests>> guests;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>itemOffer_123</p>
     */
    @NameInMap("ItemOfferId")
    public String itemOfferId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoomCount")
    public Integer roomCount;

    /**
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public CreateOrderRequest setContact(CreateOrderRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public CreateOrderRequestContact getContact() {
        return this.contact;
    }

    public CreateOrderRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public CreateOrderRequest setGuests(java.util.List<java.util.List<CreateOrderRequestGuests>> guests) {
        this.guests = guests;
        return this;
    }
    public java.util.List<java.util.List<CreateOrderRequestGuests>> getGuests() {
        return this.guests;
    }

    public CreateOrderRequest setItemOfferId(String itemOfferId) {
        this.itemOfferId = itemOfferId;
        return this;
    }
    public String getItemOfferId() {
        return this.itemOfferId;
    }

    public CreateOrderRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public CreateOrderRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class CreateOrderRequestContact extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:john@example.com">john@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>Doe</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>+86-13800138000</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static CreateOrderRequestContact build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderRequestContact self = new CreateOrderRequestContact();
            return TeaModel.build(map, self);
        }

        public CreateOrderRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateOrderRequestContact setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public CreateOrderRequestContact setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public CreateOrderRequestContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateOrderRequestContact setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class CreateOrderRequestGuests extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>Doe</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static CreateOrderRequestGuests build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderRequestGuests self = new CreateOrderRequestGuests();
            return TeaModel.build(map, self);
        }

        public CreateOrderRequestGuests setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public CreateOrderRequestGuests setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public CreateOrderRequestGuests setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
