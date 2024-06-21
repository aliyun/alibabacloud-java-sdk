// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappMigrationInitiateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateChatappMigrationInitiateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatappMigrationInitiateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappMigrationInitiateResponseBody self = new CreateChatappMigrationInitiateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatappMigrationInitiateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * <strong>example:</strong>
         * <p>82828893332</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>8613900001234</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>MIGRATING</p>
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
