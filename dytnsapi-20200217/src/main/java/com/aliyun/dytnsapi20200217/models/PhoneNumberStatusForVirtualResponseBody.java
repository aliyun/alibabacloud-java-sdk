// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVirtualResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PhoneNumberStatusForVirtualResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForVirtualResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForVirtualResponseBody self = new PhoneNumberStatusForVirtualResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForVirtualResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForVirtualResponseBody setData(PhoneNumberStatusForVirtualResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForVirtualResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForVirtualResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForVirtualResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForVirtualResponseBodyData extends TeaModel {
        @NameInMap("IsPrivacyNumber")
        public Boolean isPrivacyNumber;

        public static PhoneNumberStatusForVirtualResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForVirtualResponseBodyData self = new PhoneNumberStatusForVirtualResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForVirtualResponseBodyData setIsPrivacyNumber(Boolean isPrivacyNumber) {
            this.isPrivacyNumber = isPrivacyNumber;
            return this;
        }
        public Boolean getIsPrivacyNumber() {
            return this.isPrivacyNumber;
        }

    }

}
