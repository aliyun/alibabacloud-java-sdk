// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListContactsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Contacts")
    public java.util.List<ListContactsResponseBodyContacts> contacts;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactsResponseBody self = new ListContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContactsResponseBody setContacts(java.util.List<ListContactsResponseBodyContacts> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<ListContactsResponseBodyContacts> getContacts() {
        return this.contacts;
    }

    public ListContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContactsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListContactsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListContactsResponseBodyContacts extends TeaModel {
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

        public static ListContactsResponseBodyContacts build(java.util.Map<String, ?> map) throws Exception {
            ListContactsResponseBodyContacts self = new ListContactsResponseBodyContacts();
            return TeaModel.build(map, self);
        }

        public ListContactsResponseBodyContacts setAccountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }
        public Long getAccountUid() {
            return this.accountUid;
        }

        public ListContactsResponseBodyContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ListContactsResponseBodyContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListContactsResponseBodyContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListContactsResponseBodyContacts setIsAccount(Boolean isAccount) {
            this.isAccount = isAccount;
            return this;
        }
        public Boolean getIsAccount() {
            return this.isAccount;
        }

        public ListContactsResponseBodyContacts setIsObsolete(Boolean isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }
        public Boolean getIsObsolete() {
            return this.isObsolete;
        }

        public ListContactsResponseBodyContacts setIsVerifiedEmail(Boolean isVerifiedEmail) {
            this.isVerifiedEmail = isVerifiedEmail;
            return this;
        }
        public Boolean getIsVerifiedEmail() {
            return this.isVerifiedEmail;
        }

        public ListContactsResponseBodyContacts setIsVerifiedMobile(Boolean isVerifiedMobile) {
            this.isVerifiedMobile = isVerifiedMobile;
            return this;
        }
        public Boolean getIsVerifiedMobile() {
            return this.isVerifiedMobile;
        }

        public ListContactsResponseBodyContacts setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
            this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
            return this;
        }
        public Long getLastEmailVerificationTimeStamp() {
            return this.lastEmailVerificationTimeStamp;
        }

        public ListContactsResponseBodyContacts setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
            this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
            return this;
        }
        public Long getLastMobileVerificationTimeStamp() {
            return this.lastMobileVerificationTimeStamp;
        }

        public ListContactsResponseBodyContacts setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListContactsResponseBodyContacts setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

}
