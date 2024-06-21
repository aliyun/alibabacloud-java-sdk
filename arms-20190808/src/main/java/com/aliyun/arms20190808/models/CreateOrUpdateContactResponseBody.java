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
     * 
     * <strong>example:</strong>
     * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
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
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ContactId")
        public Float contactId;

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>JohnDoe</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test1.com">https://test1.com</a></p>
         */
        @NameInMap("DingRobotUrl")
        public String dingRobotUrl;

        /**
         * <p>The email address of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the mobile number was verified. Valid values:</p>
         * <ul>
         * <li><code>false</code> (default value): No</li>
         * <li><code>true</code>: Yes</li>
         * </ul>
         * <p>You can call the <strong>SendTTSVerifyLink</strong> operation to verify the mobile number of an alert contact. Only verified mobile numbers can be specified in a notification policy to receive phone calls.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsVerify")
        public Boolean isVerify;

        /**
         * <p>The mobile number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The operation that you want to perform if phone calls fail to be answered. Valid values: 0: No operation is performed. 1: A phone call is made again. 2: A text message is sent. 3 (default value): The global default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReissueSendNotice")
        public Long reissueSendNotice;

        /**
         * <p>Indicates whether the email address was verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
