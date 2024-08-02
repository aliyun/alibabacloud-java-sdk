// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetContactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Contact")
    public GetContactResponseBodyContact contact;

    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>FF1EFA25-9DB3-13E4-9643-5D3AD301C1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>账号UID</p>
         * 
         * <strong>example:</strong>
         * <p>12306</p>
         */
        @NameInMap("AccountUid")
        public Long accountUid;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>联系人名称</p>
         * 
         * <strong>example:</strong>
         * <p>turing</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>联系人电子邮箱</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:turing@addr.cs">turing@addr.cs</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>是否是账号本身</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAccount")
        public Boolean isAccount;

        /**
         * <p>是否过期</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsObsolete")
        public Boolean isObsolete;

        /**
         * <p>电子邮箱是否验证</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsVerifiedEmail")
        public Boolean isVerifiedEmail;

        /**
         * <p>电话是否验证</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsVerifiedMobile")
        public Boolean isVerifiedMobile;

        /**
         * <p>上封验证邮件发送时间</p>
         * 
         * <strong>example:</strong>
         * <p>1629429213</p>
         */
        @NameInMap("LastEmailVerificationTimeStamp")
        public Long lastEmailVerificationTimeStamp;

        /**
         * <p>上条验证短信发送时间</p>
         * 
         * <strong>example:</strong>
         * <p>1629429213</p>
         */
        @NameInMap("LastMobileVerificationTimeStamp")
        public Long lastMobileVerificationTimeStamp;

        /**
         * <p>用户电话</p>
         * 
         * <strong>example:</strong>
         * <p>1399999999</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>职位</p>
         */
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
