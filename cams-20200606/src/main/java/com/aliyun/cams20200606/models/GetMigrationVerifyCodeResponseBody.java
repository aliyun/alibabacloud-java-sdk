// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMigrationVerifyCodeResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
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
    public GetMigrationVerifyCodeResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The phone number ID.</p>
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
         * <p>861380000****</p>
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
