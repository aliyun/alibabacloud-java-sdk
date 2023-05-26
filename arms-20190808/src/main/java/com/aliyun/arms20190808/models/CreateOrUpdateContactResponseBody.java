// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactResponseBody extends TeaModel {
    /**
     * <p>The object of the alert contact.</p>
     */
    @NameInMap("AlertContact")
    public CreateOrUpdateContactResponseBodyAlertContact alertContact;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the alert contact.</p>
         */
        @NameInMap("ContactId")
        public Float contactId;

        /**
         * <p>The name of the alert contact.</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("DingRobotUrl")
        public String dingRobotUrl;

        /**
         * <p>The email address of the alert contact.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the mobile number was verified. Valid values:</p>
         * <br>
         * <p>*   `false` (default value): No</p>
         * <p>*   `true`: Yes</p>
         * <br>
         * <p>You can call the **SendTTSVerifyLink** operation to verify the mobile number of an alert contact. Only verified mobile numbers can be specified in a notification policy to receive phone calls.</p>
         */
        @NameInMap("IsVerify")
        public Boolean isVerify;

        /**
         * <p>The mobile number of the alert contact.</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The operation that you want to perform if phone calls fail to be answered. Valid values: 0: No operation is performed. 1: A phone call is made again. 2: A text message is sent. 3 (default value): The global default value is used.</p>
         */
        @NameInMap("ReissueSendNotice")
        public Long reissueSendNotice;

        /**
         * <p>Indicates whether the email address was verified.</p>
         */
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
