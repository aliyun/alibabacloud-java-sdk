// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    /**
     * <p>Environment alias.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试环境</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>Description of the environment, which can include information such as the purpose of the environment and its users.</p>
     * 
     * <strong>example:</strong>
     * <p>这是xx的xx项目测试环境</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentRequest self = new UpdateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public UpdateEnvironmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
