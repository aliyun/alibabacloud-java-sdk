// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindAllContacterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FindAllContacterResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindAllContacterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindAllContacterResponseBody self = new FindAllContacterResponseBody();
        return TeaModel.build(map, self);
    }

    public FindAllContacterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindAllContacterResponseBody setData(FindAllContacterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindAllContacterResponseBodyData getData() {
        return this.data;
    }

    public FindAllContacterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindAllContacterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindAllContacterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindAllContacterResponseBodyDataContacterInfo extends TeaModel {
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

        public static FindAllContacterResponseBodyDataContacterInfo build(java.util.Map<String, ?> map) throws Exception {
            FindAllContacterResponseBodyDataContacterInfo self = new FindAllContacterResponseBodyDataContacterInfo();
            return TeaModel.build(map, self);
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterAddress(String contacterAddress) {
            this.contacterAddress = contacterAddress;
            return this;
        }
        public String getContacterAddress() {
            return this.contacterAddress;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterDingding(String contacterDingding) {
            this.contacterDingding = contacterDingding;
            return this;
        }
        public String getContacterDingding() {
            return this.contacterDingding;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterEmail(String contacterEmail) {
            this.contacterEmail = contacterEmail;
            return this;
        }
        public String getContacterEmail() {
            return this.contacterEmail;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterId(Long contacterId) {
            this.contacterId = contacterId;
            return this;
        }
        public Long getContacterId() {
            return this.contacterId;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterMobile(String contacterMobile) {
            this.contacterMobile = contacterMobile;
            return this;
        }
        public String getContacterMobile() {
            return this.contacterMobile;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterName(String contacterName) {
            this.contacterName = contacterName;
            return this;
        }
        public String getContacterName() {
            return this.contacterName;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterPosition(String contacterPosition) {
            this.contacterPosition = contacterPosition;
            return this;
        }
        public String getContacterPosition() {
            return this.contacterPosition;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterStaffNo(String contacterStaffNo) {
            this.contacterStaffNo = contacterStaffNo;
            return this;
        }
        public String getContacterStaffNo() {
            return this.contacterStaffNo;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterType(String contacterType) {
            this.contacterType = contacterType;
            return this;
        }
        public String getContacterType() {
            return this.contacterType;
        }

        public FindAllContacterResponseBodyDataContacterInfo setContacterWangwang(String contacterWangwang) {
            this.contacterWangwang = contacterWangwang;
            return this;
        }
        public String getContacterWangwang() {
            return this.contacterWangwang;
        }

        public FindAllContacterResponseBodyDataContacterInfo setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public FindAllContacterResponseBodyDataContacterInfo setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

    }

    public static class FindAllContacterResponseBodyData extends TeaModel {
        @NameInMap("ContacterInfo")
        public java.util.List<FindAllContacterResponseBodyDataContacterInfo> contacterInfo;

        public static FindAllContacterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindAllContacterResponseBodyData self = new FindAllContacterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindAllContacterResponseBodyData setContacterInfo(java.util.List<FindAllContacterResponseBodyDataContacterInfo> contacterInfo) {
            this.contacterInfo = contacterInfo;
            return this;
        }
        public java.util.List<FindAllContacterResponseBodyDataContacterInfo> getContacterInfo() {
            return this.contacterInfo;
        }

    }

}
