// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteUserConfigRequest extends TeaModel {
    /**
     * <p>The configuration item keys. Currently, only customizePAIAssumedRole.</p>
     * 
     * <strong>example:</strong>
     * <p>tempStoragePath</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    @NameInMap("Scope")
    public String scope;

    public static DeleteUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserConfigRequest self = new DeleteUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public DeleteUserConfigRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
