// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMigrationVerifyCodeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMigrationVerifyCodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMigrationVerifyCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationVerifyCodeResponseBody self = new GetMigrationVerifyCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrationVerifyCodeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * <strong>example:</strong>
         * <p>82828893332</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>8613800001234</p>
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
