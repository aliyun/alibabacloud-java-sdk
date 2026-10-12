// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    /**
     * <p>The alias of the environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test environment</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The description of the environment. You can specify information such as the purpose of the environment and the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the test environment for the xx project of xx</p>
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
