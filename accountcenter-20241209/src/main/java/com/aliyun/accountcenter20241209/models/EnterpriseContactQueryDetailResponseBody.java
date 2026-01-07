// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactQueryDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseContactQueryDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F81F2090-8260-5052-BB93-7DF8996D25EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseContactQueryDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactQueryDetailResponseBody self = new EnterpriseContactQueryDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactQueryDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseContactQueryDetailResponseBody setData(EnterpriseContactQueryDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnterpriseContactQueryDetailResponseBodyData getData() {
        return this.data;
    }

    public EnterpriseContactQueryDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseContactQueryDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseContactQueryDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseContactQueryDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xx@xx.xx">xx@xx.xx</a></p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
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
         * <p>false</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        /**
         * <strong>example:</strong>
         * <p>3489d3bc-077a-449b-b41e-dd81f7451a42</p>
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
         * <p>false</p>
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

        public static EnterpriseContactQueryDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseContactQueryDetailResponseBodyData self = new EnterpriseContactQueryDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseContactQueryDetailResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public EnterpriseContactQueryDetailResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public EnterpriseContactQueryDetailResponseBodyData setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public EnterpriseContactQueryDetailResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public EnterpriseContactQueryDetailResponseBodyData setContactPosition(String contactPosition) {
            this.contactPosition = contactPosition;
            return this;
        }
        public String getContactPosition() {
            return this.contactPosition;
        }

        public EnterpriseContactQueryDetailResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public EnterpriseContactQueryDetailResponseBodyData setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public EnterpriseContactQueryDetailResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public EnterpriseContactQueryDetailResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public EnterpriseContactQueryDetailResponseBodyData setHasSubscription(Boolean hasSubscription) {
            this.hasSubscription = hasSubscription;
            return this;
        }
        public Boolean getHasSubscription() {
            return this.hasSubscription;
        }

        public EnterpriseContactQueryDetailResponseBodyData setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public EnterpriseContactQueryDetailResponseBodyData setSharedContact(Boolean sharedContact) {
            this.sharedContact = sharedContact;
            return this;
        }
        public Boolean getSharedContact() {
            return this.sharedContact;
        }

        public EnterpriseContactQueryDetailResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public EnterpriseContactQueryDetailResponseBodyData setUpdateDate(Long updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public Long getUpdateDate() {
            return this.updateDate;
        }

        public EnterpriseContactQueryDetailResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

}
