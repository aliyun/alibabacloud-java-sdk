// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    /**
     * <p>Schema of Response</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The request ID, which is used to trace the API call link.</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The response message returned.</p>
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
