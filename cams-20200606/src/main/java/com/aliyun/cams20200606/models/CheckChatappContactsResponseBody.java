// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckChatappContactsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<CheckChatappContactsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckChatappContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckChatappContactsResponseBody self = new CheckChatappContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckChatappContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckChatappContactsResponseBody setData(java.util.List<CheckChatappContactsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CheckChatappContactsResponseBodyData> getData() {
        return this.data;
    }

    public CheckChatappContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckChatappContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckChatappContactsResponseBodyData extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Status")
        public String status;

        public static CheckChatappContactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckChatappContactsResponseBodyData self = new CheckChatappContactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckChatappContactsResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CheckChatappContactsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
