// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckContactsResponseBody extends TeaModel {
    @NameInMap("Contacts")
    public java.util.List<CheckContactsResponseBodyContacts> contacts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CheckContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckContactsResponseBody self = new CheckContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckContactsResponseBody setContacts(java.util.List<CheckContactsResponseBodyContacts> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<CheckContactsResponseBodyContacts> getContacts() {
        return this.contacts;
    }

    public CheckContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckContactsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckContactsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CheckContactsResponseBodyContacts extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Status")
        public String status;

        public static CheckContactsResponseBodyContacts build(java.util.Map<String, ?> map) throws Exception {
            CheckContactsResponseBodyContacts self = new CheckContactsResponseBodyContacts();
            return TeaModel.build(map, self);
        }

        public CheckContactsResponseBodyContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CheckContactsResponseBodyContacts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
