// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAgenticSqlExecuteCredentialResponseBody extends TeaModel {
    /**
     * <p>The temporary credential information.</p>
     */
    @NameInMap("Data")
    public CreateAgenticSqlExecuteCredentialResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_PARAMETER</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34E01EDD-6A16-4CF0-9541-C644D1BE01AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.                                 </li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgenticSqlExecuteCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticSqlExecuteCredentialResponseBody self = new CreateAgenticSqlExecuteCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgenticSqlExecuteCredentialResponseBody setData(CreateAgenticSqlExecuteCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgenticSqlExecuteCredentialResponseBodyData getData() {
        return this.data;
    }

    public CreateAgenticSqlExecuteCredentialResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAgenticSqlExecuteCredentialResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateAgenticSqlExecuteCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgenticSqlExecuteCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgenticSqlExecuteCredentialResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_xxxxxxxx</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the credential. This value is returned only once when the credential is created. Keep it secure.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("AccessSecret")
        public String accessSecret;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1xxxxxxxx</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9f8e7d6c-xxxx-xxxx-xxxx-1a2b3c4d5e6f</p>
         */
        @NameInMap("CatalogUuid")
        public String catalogUuid;

        /**
         * <p>The UUID of the database. If the credential is at the instance level, this value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>6c4e8a2b-xxxx-xxxx-xxxx-0f1d2e3c4b5a</p>
         */
        @NameInMap("DatabaseUuid")
        public String databaseUuid;

        /**
         * <p>The expiration time of the credential. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-13 12:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The total number of connections supported by the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MaxConnectTimes")
        public Long maxConnectTimes;

        /**
         * <p>The fully qualified name of the database. If the credential is at the instance level, this value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("QualifiedName")
        public String qualifiedName;

        public static CreateAgenticSqlExecuteCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgenticSqlExecuteCredentialResponseBodyData self = new CreateAgenticSqlExecuteCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setCatalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }
        public String getCatalogUuid() {
            return this.catalogUuid;
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setDatabaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
            return this;
        }
        public String getDatabaseUuid() {
            return this.databaseUuid;
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setMaxConnectTimes(Long maxConnectTimes) {
            this.maxConnectTimes = maxConnectTimes;
            return this;
        }
        public Long getMaxConnectTimes() {
            return this.maxConnectTimes;
        }

        public CreateAgenticSqlExecuteCredentialResponseBodyData setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }
        public String getQualifiedName() {
            return this.qualifiedName;
        }

    }

}
