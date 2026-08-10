// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCreateAndPayRequest extends TeaModel {
    /**
     * <p>The distributor account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>The contact information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Contact")
    public GlobalHotelCreateAndPayRequestContact contact;

    /**
     * <p>The external order number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXT_ORDER_001</p>
     */
    @NameInMap("ExternalOrderNo")
    public String externalOrderNo;

    /**
     * <p>The guests grouped by room.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Guests")
    public java.util.List<java.util.List<GlobalHotelCreateAndPayRequestGuests>> guests;

    /**
     * <p>The offer ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>itemOffer_123</p>
     */
    @NameInMap("ItemOfferId")
    public String itemOfferId;

    /**
     * <p>The number of rooms.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoomCount")
    public Integer roomCount;

    /**
     * <p>TraceId</p>
     * 
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelCreateAndPayRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCreateAndPayRequest self = new GlobalHotelCreateAndPayRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCreateAndPayRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelCreateAndPayRequest setContact(GlobalHotelCreateAndPayRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public GlobalHotelCreateAndPayRequestContact getContact() {
        return this.contact;
    }

    public GlobalHotelCreateAndPayRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public GlobalHotelCreateAndPayRequest setGuests(java.util.List<java.util.List<GlobalHotelCreateAndPayRequestGuests>> guests) {
        this.guests = guests;
        return this;
    }
    public java.util.List<java.util.List<GlobalHotelCreateAndPayRequestGuests>> getGuests() {
        return this.guests;
    }

    public GlobalHotelCreateAndPayRequest setItemOfferId(String itemOfferId) {
        this.itemOfferId = itemOfferId;
        return this;
    }
    public String getItemOfferId() {
        return this.itemOfferId;
    }

    public GlobalHotelCreateAndPayRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelCreateAndPayRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelCreateAndPayRequestContact extends TeaModel {
        /**
         * <p>The email address of the contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@example.com">john@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The first name of the contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>The last name of the contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Doe</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <p>The phone number of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>+86-13800138000</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelCreateAndPayRequestContact build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCreateAndPayRequestContact self = new GlobalHotelCreateAndPayRequestContact();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCreateAndPayRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GlobalHotelCreateAndPayRequestContact setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public GlobalHotelCreateAndPayRequestContact setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GlobalHotelCreateAndPayRequestContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GlobalHotelCreateAndPayRequestContact setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelCreateAndPayRequestGuests extends TeaModel {
        /**
         * <p>The first name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>The last name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Doe</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelCreateAndPayRequestGuests build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCreateAndPayRequestGuests self = new GlobalHotelCreateAndPayRequestGuests();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCreateAndPayRequestGuests setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public GlobalHotelCreateAndPayRequestGuests setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GlobalHotelCreateAndPayRequestGuests setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
