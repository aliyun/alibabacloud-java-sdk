// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryCollectionRequest extends TeaModel {
    @NameInMap("body")
    public CreateMemoryCollectionInput body;

    public static CreateMemoryCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryCollectionRequest self = new CreateMemoryCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryCollectionRequest setBody(CreateMemoryCollectionInput body) {
        this.body = body;
        return this;
    }
    public CreateMemoryCollectionInput getBody() {
        return this.body;
    }

}
