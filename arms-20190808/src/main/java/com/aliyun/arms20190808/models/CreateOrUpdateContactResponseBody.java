// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactResponseBody extends TeaModel {
    @NameInMap("AlertContact")
    public CreateOrUpdateContactResponseBodyAlertContact alertContact;

    // Id of the request
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
        // 告警联系人ID
        @NameInMap("ContactId")
        public Float contactId;

        // 告警联系人名称
        @NameInMap("ContactName")
        public String contactName;

        // 告警联系人邮箱
        @NameInMap("Email")
        public String email;

        // 手机号码验证标识
        @NameInMap("IsVerify")
        public Boolean isVerify;

        // 告警联系人手机号
        @NameInMap("Phone")
        public String phone;

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

    }

}
