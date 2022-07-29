// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactResponseBody extends TeaModel {
    @NameInMap("AlertContact")
    public CreateOrUpdateContactResponseBodyAlertContact alertContact;

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
        @NameInMap("ContactId")
        public Float contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Email")
        public String email;

        @NameInMap("IsVerify")
        public Boolean isVerify;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("ReissueSendNotice")
        public Long reissueSendNotice;

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

        public CreateOrUpdateContactResponseBodyAlertContact setReissueSendNotice(Long reissueSendNotice) {
            this.reissueSendNotice = reissueSendNotice;
            return this;
        }
        public Long getReissueSendNotice() {
            return this.reissueSendNotice;
        }

    }

}
