// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryApiKeysResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryApiKeysResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retryAble")
    public Boolean retryAble;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static QueryApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApiKeysResponseBody self = new QueryApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApiKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryApiKeysResponseBody setData(java.util.List<QueryApiKeysResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryApiKeysResponseBodyData> getData() {
        return this.data;
    }

    public QueryApiKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryApiKeysResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public QueryApiKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryApiKeysResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-12-31T23:59:59Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>a1b2c3d4e5f6...</p>
         */
        @NameInMap("keyHash")
        public String keyHash;

        /**
         * <p><strong>API Key ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>key_001</p>
         */
        @NameInMap("keyId")
        public String keyId;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryApiKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryApiKeysResponseBodyData self = new QueryApiKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryApiKeysResponseBodyData setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public QueryApiKeysResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryApiKeysResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryApiKeysResponseBodyData setKeyHash(String keyHash) {
            this.keyHash = keyHash;
            return this;
        }
        public String getKeyHash() {
            return this.keyHash;
        }

        public QueryApiKeysResponseBodyData setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public QueryApiKeysResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryApiKeysResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
