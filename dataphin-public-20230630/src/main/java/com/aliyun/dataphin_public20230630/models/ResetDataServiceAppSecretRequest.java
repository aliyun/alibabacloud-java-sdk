// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResetDataServiceAppSecretRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The update command to reset the application key of a data service.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public ResetDataServiceAppSecretRequestUpdateCommand updateCommand;

    public static ResetDataServiceAppSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDataServiceAppSecretRequest self = new ResetDataServiceAppSecretRequest();
        return TeaModel.build(map, self);
    }

    public ResetDataServiceAppSecretRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ResetDataServiceAppSecretRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ResetDataServiceAppSecretRequest setUpdateCommand(ResetDataServiceAppSecretRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public ResetDataServiceAppSecretRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class ResetDataServiceAppSecretRequestUpdateCommand extends TeaModel {
        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The new application key. The key must be globally unique and is used when you call API operations. The key must be 8 to 128 characters in length, and can contain digits, underscores (_), and hyphens (-). You can customize this parameter only when you use Alibaba Cloud API Gateway or the built-in gateway. If you use Apsara Stack Gateway, this parameter is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>200000001</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The new application secret. If you leave this parameter empty, the system automatically generates a new AppSecret value. The secret must be 8 to 127 characters in length, and can contain digits, underscores (_), and hyphens (-). You can customize this parameter only when you use Alibaba Cloud API Gateway or the built-in gateway. If you use Apsara Stack Gateway, this parameter is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>abc123456789</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        public static ResetDataServiceAppSecretRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            ResetDataServiceAppSecretRequestUpdateCommand self = new ResetDataServiceAppSecretRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public ResetDataServiceAppSecretRequestUpdateCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ResetDataServiceAppSecretRequestUpdateCommand setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ResetDataServiceAppSecretRequestUpdateCommand setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

    }

}
