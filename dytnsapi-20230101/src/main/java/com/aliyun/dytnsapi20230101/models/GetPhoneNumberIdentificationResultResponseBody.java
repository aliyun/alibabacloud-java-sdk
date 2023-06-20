// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetPhoneNumberIdentificationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPhoneNumberIdentificationResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPhoneNumberIdentificationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberIdentificationResultResponseBody self = new GetPhoneNumberIdentificationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberIdentificationResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhoneNumberIdentificationResultResponseBody setData(GetPhoneNumberIdentificationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPhoneNumberIdentificationResultResponseBodyData getData() {
        return this.data;
    }

    public GetPhoneNumberIdentificationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhoneNumberIdentificationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPhoneNumberIdentificationResultResponseBodyData extends TeaModel {
        @NameInMap("IsIdentified")
        public String isIdentified;

        public static GetPhoneNumberIdentificationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberIdentificationResultResponseBodyData self = new GetPhoneNumberIdentificationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberIdentificationResultResponseBodyData setIsIdentified(String isIdentified) {
            this.isIdentified = isIdentified;
            return this;
        }
        public String getIsIdentified() {
            return this.isIdentified;
        }

    }

}
