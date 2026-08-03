// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CreateAndPayRequest extends TeaModel {
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
    public CreateAndPayRequestContact contact;

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
    public java.util.List<java.util.List<CreateAndPayRequestGuests>> guests;

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
     * <p>TracerId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static CreateAndPayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPayRequest self = new CreateAndPayRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndPayRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public CreateAndPayRequest setContact(CreateAndPayRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public CreateAndPayRequestContact getContact() {
        return this.contact;
    }

    public CreateAndPayRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public CreateAndPayRequest setGuests(java.util.List<java.util.List<CreateAndPayRequestGuests>> guests) {
        this.guests = guests;
        return this;
    }
    public java.util.List<java.util.List<CreateAndPayRequestGuests>> getGuests() {
        return this.guests;
    }

    public CreateAndPayRequest setItemOfferId(String itemOfferId) {
        this.itemOfferId = itemOfferId;
        return this;
    }
    public String getItemOfferId() {
        return this.itemOfferId;
    }

    public CreateAndPayRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public CreateAndPayRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class CreateAndPayRequestContact extends TeaModel {
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

        public static CreateAndPayRequestContact build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPayRequestContact self = new CreateAndPayRequestContact();
            return TeaModel.build(map, self);
        }

        public CreateAndPayRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateAndPayRequestContact setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public CreateAndPayRequestContact setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public CreateAndPayRequestContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateAndPayRequestContact setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class CreateAndPayRequestGuests extends TeaModel {
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
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static CreateAndPayRequestGuests build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPayRequestGuests self = new CreateAndPayRequestGuests();
            return TeaModel.build(map, self);
        }

        public CreateAndPayRequestGuests setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public CreateAndPayRequestGuests setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public CreateAndPayRequestGuests setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
