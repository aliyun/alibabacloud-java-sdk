// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappMigrationInitiateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](https://www.alibabacloud.com/help/zh/cams/latest/api-error-codes).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateChatappMigrationInitiateResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatappMigrationInitiateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappMigrationInitiateResponseBody self = new CreateChatappMigrationInitiateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatappMigrationInitiateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatappMigrationInitiateResponseBody setData(CreateChatappMigrationInitiateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatappMigrationInitiateResponseBodyData getData() {
        return this.data;
    }

    public CreateChatappMigrationInitiateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatappMigrationInitiateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateChatappMigrationInitiateResponseBodyData extends TeaModel {
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

        /**
         * <p>The status of the phone number.</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateChatappMigrationInitiateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappMigrationInitiateResponseBodyData self = new CreateChatappMigrationInitiateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChatappMigrationInitiateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateChatappMigrationInitiateResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreateChatappMigrationInitiateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
