// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCreateOrderRequest extends TeaModel {
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
    public GlobalHotelCreateOrderRequestContact contact;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXT_ORDER_001</p>
     */
    @NameInMap("ExternalOrderNo")
    public String externalOrderNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Guests")
    public java.util.List<java.util.List<GlobalHotelCreateOrderRequestGuests>> guests;

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

    public static GlobalHotelCreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCreateOrderRequest self = new GlobalHotelCreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCreateOrderRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelCreateOrderRequest setContact(GlobalHotelCreateOrderRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public GlobalHotelCreateOrderRequestContact getContact() {
        return this.contact;
    }

    public GlobalHotelCreateOrderRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public GlobalHotelCreateOrderRequest setGuests(java.util.List<java.util.List<GlobalHotelCreateOrderRequestGuests>> guests) {
        this.guests = guests;
        return this;
    }
    public java.util.List<java.util.List<GlobalHotelCreateOrderRequestGuests>> getGuests() {
        return this.guests;
    }

    public GlobalHotelCreateOrderRequest setItemOfferId(String itemOfferId) {
        this.itemOfferId = itemOfferId;
        return this;
    }
    public String getItemOfferId() {
        return this.itemOfferId;
    }

    public GlobalHotelCreateOrderRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelCreateOrderRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelCreateOrderRequestContact extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@example.com">john@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>This parameter is required.</p>
         * 
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

        public static GlobalHotelCreateOrderRequestContact build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCreateOrderRequestContact self = new GlobalHotelCreateOrderRequestContact();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCreateOrderRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GlobalHotelCreateOrderRequestContact setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public GlobalHotelCreateOrderRequestContact setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GlobalHotelCreateOrderRequestContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GlobalHotelCreateOrderRequestContact setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelCreateOrderRequestGuests extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>This parameter is required.</p>
         * 
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

        public static GlobalHotelCreateOrderRequestGuests build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCreateOrderRequestGuests self = new GlobalHotelCreateOrderRequestGuests();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCreateOrderRequestGuests setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public GlobalHotelCreateOrderRequestGuests setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GlobalHotelCreateOrderRequestGuests setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
