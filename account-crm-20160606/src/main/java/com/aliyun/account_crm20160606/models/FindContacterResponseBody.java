// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindContacterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FindContacterResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindContacterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindContacterResponseBody self = new FindContacterResponseBody();
        return TeaModel.build(map, self);
    }

    public FindContacterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindContacterResponseBody setData(FindContacterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindContacterResponseBodyData getData() {
        return this.data;
    }

    public FindContacterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindContacterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindContacterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindContacterResponseBodyData extends TeaModel {
        @NameInMap("ContacterAddress")
        public String contacterAddress;

        @NameInMap("ContacterDingding")
        public String contacterDingding;

        @NameInMap("ContacterEmail")
        public String contacterEmail;

        @NameInMap("ContacterId")
        public Long contacterId;

        @NameInMap("ContacterMobile")
        public String contacterMobile;

        @NameInMap("ContacterName")
        public String contacterName;

        @NameInMap("ContacterPosition")
        public String contacterPosition;

        @NameInMap("ContacterStaffNo")
        public String contacterStaffNo;

        @NameInMap("ContacterType")
        public String contacterType;

        @NameInMap("ContacterWangwang")
        public String contacterWangwang;

        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        public static FindContacterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindContacterResponseBodyData self = new FindContacterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindContacterResponseBodyData setContacterAddress(String contacterAddress) {
            this.contacterAddress = contacterAddress;
            return this;
        }
        public String getContacterAddress() {
            return this.contacterAddress;
        }

        public FindContacterResponseBodyData setContacterDingding(String contacterDingding) {
            this.contacterDingding = contacterDingding;
            return this;
        }
        public String getContacterDingding() {
            return this.contacterDingding;
        }

        public FindContacterResponseBodyData setContacterEmail(String contacterEmail) {
            this.contacterEmail = contacterEmail;
            return this;
        }
        public String getContacterEmail() {
            return this.contacterEmail;
        }

        public FindContacterResponseBodyData setContacterId(Long contacterId) {
            this.contacterId = contacterId;
            return this;
        }
        public Long getContacterId() {
            return this.contacterId;
        }

        public FindContacterResponseBodyData setContacterMobile(String contacterMobile) {
            this.contacterMobile = contacterMobile;
            return this;
        }
        public String getContacterMobile() {
            return this.contacterMobile;
        }

        public FindContacterResponseBodyData setContacterName(String contacterName) {
            this.contacterName = contacterName;
            return this;
        }
        public String getContacterName() {
            return this.contacterName;
        }

        public FindContacterResponseBodyData setContacterPosition(String contacterPosition) {
            this.contacterPosition = contacterPosition;
            return this;
        }
        public String getContacterPosition() {
            return this.contacterPosition;
        }

        public FindContacterResponseBodyData setContacterStaffNo(String contacterStaffNo) {
            this.contacterStaffNo = contacterStaffNo;
            return this;
        }
        public String getContacterStaffNo() {
            return this.contacterStaffNo;
        }

        public FindContacterResponseBodyData setContacterType(String contacterType) {
            this.contacterType = contacterType;
            return this;
        }
        public String getContacterType() {
            return this.contacterType;
        }

        public FindContacterResponseBodyData setContacterWangwang(String contacterWangwang) {
            this.contacterWangwang = contacterWangwang;
            return this;
        }
        public String getContacterWangwang() {
            return this.contacterWangwang;
        }

        public FindContacterResponseBodyData setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public FindContacterResponseBodyData setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

    }

}
