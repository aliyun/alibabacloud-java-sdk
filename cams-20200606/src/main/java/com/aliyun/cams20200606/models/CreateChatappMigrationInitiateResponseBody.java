// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappMigrationInitiateResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p>A value of OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateChatappMigrationInitiateResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The ID of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>8282889****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>861390000****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The status of the phone number.
         * Valid value: MIGRATING: The phone number is being migrated.</p>
         * 
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
