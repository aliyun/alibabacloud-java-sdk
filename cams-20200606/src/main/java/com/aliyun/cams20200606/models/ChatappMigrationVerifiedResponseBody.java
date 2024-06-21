// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappMigrationVerifiedResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <ul>
     * <li>A value of OK indicates that the call is successful.</li>
     * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ChatappMigrationVerifiedResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChatappMigrationVerifiedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappMigrationVerifiedResponseBody self = new ChatappMigrationVerifiedResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatappMigrationVerifiedResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ChatappMigrationVerifiedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChatappMigrationVerifiedResponseBody setData(ChatappMigrationVerifiedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChatappMigrationVerifiedResponseBodyData getData() {
        return this.data;
    }

    public ChatappMigrationVerifiedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatappMigrationVerifiedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChatappMigrationVerifiedResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>82828893332</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>8613800001234</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static ChatappMigrationVerifiedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChatappMigrationVerifiedResponseBodyData self = new ChatappMigrationVerifiedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChatappMigrationVerifiedResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatappMigrationVerifiedResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
