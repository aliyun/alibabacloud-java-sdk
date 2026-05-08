// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContextStoreAPIKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Production Service Key</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateContextStoreAPIKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextStoreAPIKeyRequest self = new CreateContextStoreAPIKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextStoreAPIKeyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
