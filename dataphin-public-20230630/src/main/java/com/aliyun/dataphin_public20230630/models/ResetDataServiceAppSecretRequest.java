// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResetDataServiceAppSecretRequest extends TeaModel {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <strong>example:</strong>
         * <p>200000001</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
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
