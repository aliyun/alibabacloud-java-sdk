// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretShrinkRequest extends TeaModel {
    @NameInMap("ExtendedConfig")
    public UpdateSecretShrinkRequestExtendedConfig extendedConfig;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretShrinkRequest self = new UpdateSecretShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretShrinkRequest setExtendedConfig(UpdateSecretShrinkRequestExtendedConfig extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public UpdateSecretShrinkRequestExtendedConfig getExtendedConfig() {
        return this.extendedConfig;
    }

    public UpdateSecretShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSecretShrinkRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public static class UpdateSecretShrinkRequestExtendedConfig extends TeaModel {
        @NameInMap("CustomData")
        public String customData;

        public static UpdateSecretShrinkRequestExtendedConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecretShrinkRequestExtendedConfig self = new UpdateSecretShrinkRequestExtendedConfig();
            return TeaModel.build(map, self);
        }

        public UpdateSecretShrinkRequestExtendedConfig setCustomData(String customData) {
            this.customData = customData;
            return this;
        }
        public String getCustomData() {
            return this.customData;
        }

    }

}
