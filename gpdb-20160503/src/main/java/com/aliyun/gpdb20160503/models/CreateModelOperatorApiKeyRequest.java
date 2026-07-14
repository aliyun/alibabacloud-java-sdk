// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateModelOperatorApiKeyRequest extends TeaModel {
    /**
     * <p>The description. Spaces are not allowed, and the value cannot exceed 256 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-apikey</p>
     */
    @NameInMap("Description")
    public String description;

    public static CreateModelOperatorApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelOperatorApiKeyRequest self = new CreateModelOperatorApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelOperatorApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
