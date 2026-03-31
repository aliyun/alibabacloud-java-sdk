// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateApiKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>update description.</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyRequest self = new UpdateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
