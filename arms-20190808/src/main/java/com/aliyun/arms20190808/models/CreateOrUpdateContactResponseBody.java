// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactResponseBody extends TeaModel {
    // The object of the alert contact.
    @NameInMap("AlertContact")
    public CreateOrUpdateContactResponseBodyAlertContact alertContact;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactResponseBody self = new CreateOrUpdateContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactResponseBody setAlertContact(CreateOrUpdateContactResponseBodyAlertContact alertContact) {
        this.alertContact = alertContact;
        return this;
    }
    public CreateOrUpdateContactResponseBodyAlertContact getAlertContact() {
        return this.alertContact;
    }

    public CreateOrUpdateContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrUpdateContactResponseBodyAlertContact extends TeaModel {
        // The ID of the alert contact.
        @NameInMap("ContactId")
        public Float contactId;

        // The name of the alert contact.
        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("DingRobotUrl")
        public String dingRobotUrl;

        // The email address of the alert contact.
        @NameInMap("Email")
        public String email;

        // Indicates whether the mobile number is verified. Valid values:
        // 
        // *   `false` (default value): The mobile number is not verified.
        // *   `true`: The mobile number is verified.
        // 
        // You can call the **SendTTSVerifyLink** operation to verify the mobile number of an alert contact. Only verified mobile numbers can be specified in a notification policy.
        @NameInMap("IsVerify")
        public Boolean isVerify;

        // The mobile number of the alert contact.
        @NameInMap("Phone")
        public String phone;

        // The method to resend notifications if phone notifications fail. Valid values: 0: do not resend notifications. 1: make a phone call again. 2: send a text message. 3 (default value): use the global default value.
        @NameInMap("ReissueSendNotice")
        public Long reissueSendNotice;

        @NameInMap("isEmailVerify")
        public Boolean isEmailVerify;

        public static CreateOrUpdateContactResponseBodyAlertContact build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateContactResponseBodyAlertContact self = new CreateOrUpdateContactResponseBodyAlertContact();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateContactResponseBodyAlertContact setContactId(Float contactId) {
            this.contactId = contactId;
            return this;
        }
        public Float getContactId() {
            return this.contactId;
        }

        public CreateOrUpdateContactResponseBodyAlertContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public CreateOrUpdateContactResponseBodyAlertContact setDingRobotUrl(String dingRobotUrl) {
            this.dingRobotUrl = dingRobotUrl;
            return this;
        }
        public String getDingRobotUrl() {
            return this.dingRobotUrl;
        }

        public CreateOrUpdateContactResponseBodyAlertContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateOrUpdateContactResponseBodyAlertContact setIsVerify(Boolean isVerify) {
            this.isVerify = isVerify;
            return this;
        }
        public Boolean getIsVerify() {
            return this.isVerify;
        }

        public CreateOrUpdateContactResponseBodyAlertContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateOrUpdateContactResponseBodyAlertContact setReissueSendNotice(Long reissueSendNotice) {
            this.reissueSendNotice = reissueSendNotice;
            return this;
        }
        public Long getReissueSendNotice() {
            return this.reissueSendNotice;
        }

        public CreateOrUpdateContactResponseBodyAlertContact setIsEmailVerify(Boolean isEmailVerify) {
            this.isEmailVerify = isEmailVerify;
            return this;
        }
        public Boolean getIsEmailVerify() {
            return this.isEmailVerify;
        }

    }

}
