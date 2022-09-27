// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetContactResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Contact")
    public GetContactResponseBodyContact contact;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContactResponseBody self = new GetContactResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContactResponseBody setContact(GetContactResponseBodyContact contact) {
        this.contact = contact;
        return this;
    }
    public GetContactResponseBodyContact getContact() {
        return this.contact;
    }

    public GetContactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContactResponseBodyContact extends TeaModel {
        @NameInMap("AccountUid")
        public Long accountUid;

        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Email")
        public String email;

        @NameInMap("IsAccount")
        public Boolean isAccount;

        @NameInMap("IsObsolete")
        public Boolean isObsolete;

        @NameInMap("IsVerifiedEmail")
        public Boolean isVerifiedEmail;

        @NameInMap("IsVerifiedMobile")
        public Boolean isVerifiedMobile;

        @NameInMap("LastEmailVerificationTimeStamp")
        public Long lastEmailVerificationTimeStamp;

        @NameInMap("LastMobileVerificationTimeStamp")
        public Long lastMobileVerificationTimeStamp;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Position")
        public String position;

        public static GetContactResponseBodyContact build(java.util.Map<String, ?> map) throws Exception {
            GetContactResponseBodyContact self = new GetContactResponseBodyContact();
            return TeaModel.build(map, self);
        }

        public GetContactResponseBodyContact setAccountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }
        public Long getAccountUid() {
            return this.accountUid;
        }

        public GetContactResponseBodyContact setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public GetContactResponseBodyContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetContactResponseBodyContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetContactResponseBodyContact setIsAccount(Boolean isAccount) {
            this.isAccount = isAccount;
            return this;
        }
        public Boolean getIsAccount() {
            return this.isAccount;
        }

        public GetContactResponseBodyContact setIsObsolete(Boolean isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }
        public Boolean getIsObsolete() {
            return this.isObsolete;
        }

        public GetContactResponseBodyContact setIsVerifiedEmail(Boolean isVerifiedEmail) {
            this.isVerifiedEmail = isVerifiedEmail;
            return this;
        }
        public Boolean getIsVerifiedEmail() {
            return this.isVerifiedEmail;
        }

        public GetContactResponseBodyContact setIsVerifiedMobile(Boolean isVerifiedMobile) {
            this.isVerifiedMobile = isVerifiedMobile;
            return this;
        }
        public Boolean getIsVerifiedMobile() {
            return this.isVerifiedMobile;
        }

        public GetContactResponseBodyContact setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
            this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
            return this;
        }
        public Long getLastEmailVerificationTimeStamp() {
            return this.lastEmailVerificationTimeStamp;
        }

        public GetContactResponseBodyContact setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
            this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
            return this;
        }
        public Long getLastMobileVerificationTimeStamp() {
            return this.lastMobileVerificationTimeStamp;
        }

        public GetContactResponseBodyContact setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetContactResponseBodyContact setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

}
