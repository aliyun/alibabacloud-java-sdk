// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMigrationVerifyCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMigrationVerifyCodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMigrationVerifyCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationVerifyCodeResponseBody self = new GetMigrationVerifyCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrationVerifyCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMigrationVerifyCodeResponseBody setData(GetMigrationVerifyCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMigrationVerifyCodeResponseBodyData getData() {
        return this.data;
    }

    public GetMigrationVerifyCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMigrationVerifyCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMigrationVerifyCodeResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static GetMigrationVerifyCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationVerifyCodeResponseBodyData self = new GetMigrationVerifyCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMigrationVerifyCodeResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMigrationVerifyCodeResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
