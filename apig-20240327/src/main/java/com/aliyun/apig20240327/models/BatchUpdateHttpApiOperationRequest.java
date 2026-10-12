// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchUpdateHttpApiOperationRequest extends TeaModel {
    /**
     * <p>The authentication configuration. This parameter is required when enableAuth is set to true.</p>
     */
    @NameInMap("authConfig")
    public BatchUpdateHttpApiOperationRequestAuthConfig authConfig;

    /**
     * <p>Specifies whether to enable consumer authentication. If set to true, a valid authConfig must be provided. If set to false, authConfig is not validated and the existing configuration remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The list of operation IDs to update in batches. This parameter cannot be empty.</p>
     */
    @NameInMap("operationIds")
    public java.util.List<String> operationIds;

    public static BatchUpdateHttpApiOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateHttpApiOperationRequest self = new BatchUpdateHttpApiOperationRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateHttpApiOperationRequest setAuthConfig(BatchUpdateHttpApiOperationRequestAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public BatchUpdateHttpApiOperationRequestAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public BatchUpdateHttpApiOperationRequest setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public BatchUpdateHttpApiOperationRequest setOperationIds(java.util.List<String> operationIds) {
        this.operationIds = operationIds;
        return this;
    }
    public java.util.List<String> getOperationIds() {
        return this.operationIds;
    }

    public static class BatchUpdateHttpApiOperationRequestAuthConfig extends TeaModel {
        /**
         * <p>The authentication mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("authMode")
        public String authMode;

        /**
         * <p>The authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>Jwt</p>
         */
        @NameInMap("authType")
        public String authType;

        public static BatchUpdateHttpApiOperationRequestAuthConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateHttpApiOperationRequestAuthConfig self = new BatchUpdateHttpApiOperationRequestAuthConfig();
            return TeaModel.build(map, self);
        }

        public BatchUpdateHttpApiOperationRequestAuthConfig setAuthMode(String authMode) {
            this.authMode = authMode;
            return this;
        }
        public String getAuthMode() {
            return this.authMode;
        }

        public BatchUpdateHttpApiOperationRequestAuthConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

    }

}
