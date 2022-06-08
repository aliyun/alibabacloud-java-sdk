// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRequest extends TeaModel {
    @NameInMap("ExtendedConfig")
    public UpdateSecretRequestExtendedConfig extendedConfig;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRequest self = new UpdateSecretRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretRequest setExtendedConfig(UpdateSecretRequestExtendedConfig extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public UpdateSecretRequestExtendedConfig getExtendedConfig() {
        return this.extendedConfig;
    }

    public UpdateSecretRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public static class UpdateSecretRequestExtendedConfig extends TeaModel {
        @NameInMap("CustomData")
        public java.util.Map<String, ?> customData;

        public static UpdateSecretRequestExtendedConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecretRequestExtendedConfig self = new UpdateSecretRequestExtendedConfig();
            return TeaModel.build(map, self);
        }

        public UpdateSecretRequestExtendedConfig setCustomData(java.util.Map<String, ?> customData) {
            this.customData = customData;
            return this;
        }
        public java.util.Map<String, ?> getCustomData() {
            return this.customData;
        }

    }

}
