// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMigrationVerifyCodeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetMigrationVerifyCodeResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the phone number.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The phone number.</p>
         */
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
