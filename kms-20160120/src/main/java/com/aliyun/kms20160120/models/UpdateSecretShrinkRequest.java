// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretShrinkRequest extends TeaModel {
    @NameInMap("ExtendedConfig")
    public UpdateSecretShrinkRequestExtendedConfig extendedConfig;

    /**
     * <p>The description of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>datainfo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
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
        /**
         * <p>The custom data in the extended configuration of the secret.</p>
         * <blockquote>
         * <ul>
         * <li>If this parameter is specified, the existing extended configuration of the secret is updated.</li>
         * <li>This parameter is unavailable for generic secrets.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DBName&quot;:&quot;app1&quot;,&quot;Port&quot;:&quot;3306&quot;}</p>
         */
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
