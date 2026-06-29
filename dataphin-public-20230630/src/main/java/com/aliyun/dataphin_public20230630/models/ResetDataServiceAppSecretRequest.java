// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResetDataServiceAppSecretRequest extends TeaModel {
    /**
     * <p>Tenant ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>Reset Data Service Application Key</p>
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

    public ResetDataServiceAppSecretRequest setUpdateCommand(ResetDataServiceAppSecretRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public ResetDataServiceAppSecretRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class ResetDataServiceAppSecretRequestUpdateCommand extends TeaModel {
        /**
         * <p>Application ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The new application key, which must be globally unique and is used when calling APIs.
         * The length is 8 to 128 English characters, and can contain digits, underscores (_), and hyphens (-).
         * Customization is supported only when using Alibaba Cloud API Gateway or the built-in gateway. This configuration is ignored when using a dedicated cloud gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>200000001</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The new application secret.
         * If this parameter is left empty, the system automatically generates a new AppSecret value.
         * The length is 8 to 127 English characters, and can contain digits, underscores (_), and hyphens (-).
         * Customization is supported only when using Alibaba Cloud API Gateway or the built-in gateway. This configuration is ignored when using a dedicated cloud gateway.</p>
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
