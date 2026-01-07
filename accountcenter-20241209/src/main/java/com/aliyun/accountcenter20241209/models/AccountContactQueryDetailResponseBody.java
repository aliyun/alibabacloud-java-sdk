// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactQueryDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AccountContactQueryDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DA632E90-32DB-52DE-823B-4A182169D954</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AccountContactQueryDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccountContactQueryDetailResponseBody self = new AccountContactQueryDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public AccountContactQueryDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AccountContactQueryDetailResponseBody setData(AccountContactQueryDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AccountContactQueryDetailResponseBodyData getData() {
        return this.data;
    }

    public AccountContactQueryDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AccountContactQueryDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccountContactQueryDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AccountContactQueryDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@xxx.xx">xxx@xxx.xx</a></p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <strong>example:</strong>
         * <p>1xxxxxxxxxx</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ContactPosition")
        public String contactPosition;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>leId/customerId</p>
         * 
         * <strong>example:</strong>
         * <p>customerId</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("HasSubscription")
        public Boolean hasSubscription;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SharedContact")
        public Boolean sharedContact;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UpdateDate")
        public Long updateDate;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        public static AccountContactQueryDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccountContactQueryDetailResponseBodyData self = new AccountContactQueryDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccountContactQueryDetailResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public AccountContactQueryDetailResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public AccountContactQueryDetailResponseBodyData setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public AccountContactQueryDetailResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public AccountContactQueryDetailResponseBodyData setContactPosition(String contactPosition) {
            this.contactPosition = contactPosition;
            return this;
        }
        public String getContactPosition() {
            return this.contactPosition;
        }

        public AccountContactQueryDetailResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public AccountContactQueryDetailResponseBodyData setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public AccountContactQueryDetailResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public AccountContactQueryDetailResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public AccountContactQueryDetailResponseBodyData setHasSubscription(Boolean hasSubscription) {
            this.hasSubscription = hasSubscription;
            return this;
        }
        public Boolean getHasSubscription() {
            return this.hasSubscription;
        }

        public AccountContactQueryDetailResponseBodyData setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public AccountContactQueryDetailResponseBodyData setSharedContact(Boolean sharedContact) {
            this.sharedContact = sharedContact;
            return this;
        }
        public Boolean getSharedContact() {
            return this.sharedContact;
        }

        public AccountContactQueryDetailResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public AccountContactQueryDetailResponseBodyData setUpdateDate(Long updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public Long getUpdateDate() {
            return this.updateDate;
        }

        public AccountContactQueryDetailResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

}
