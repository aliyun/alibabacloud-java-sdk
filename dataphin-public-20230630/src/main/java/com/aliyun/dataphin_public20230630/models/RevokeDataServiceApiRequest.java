// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RevokeDataServiceApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RevokeCommand")
    public RevokeDataServiceApiRequestRevokeCommand revokeCommand;

    public static RevokeDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeDataServiceApiRequest self = new RevokeDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public RevokeDataServiceApiRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RevokeDataServiceApiRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public RevokeDataServiceApiRequest setRevokeCommand(RevokeDataServiceApiRequestRevokeCommand revokeCommand) {
        this.revokeCommand = revokeCommand;
        return this;
    }
    public RevokeDataServiceApiRequestRevokeCommand getRevokeCommand() {
        return this.revokeCommand;
    }

    public static class RevokeDataServiceApiRequestRevokeCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <strong>example:</strong>
         * <p>1203</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <strong>example:</strong>
         * <p>USE</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>APP</p>
         */
        @NameInMap("GranteeType")
        public String granteeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RevokeDataServiceApiRequestRevokeCommand build(java.util.Map<String, ?> map) throws Exception {
            RevokeDataServiceApiRequestRevokeCommand self = new RevokeDataServiceApiRequestRevokeCommand();
            return TeaModel.build(map, self);
        }

        public RevokeDataServiceApiRequestRevokeCommand setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public RevokeDataServiceApiRequestRevokeCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public RevokeDataServiceApiRequestRevokeCommand setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public RevokeDataServiceApiRequestRevokeCommand setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public RevokeDataServiceApiRequestRevokeCommand setGranteeType(String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public String getGranteeType() {
            return this.granteeType;
        }

        public RevokeDataServiceApiRequestRevokeCommand setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RevokeDataServiceApiRequestRevokeCommand setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
