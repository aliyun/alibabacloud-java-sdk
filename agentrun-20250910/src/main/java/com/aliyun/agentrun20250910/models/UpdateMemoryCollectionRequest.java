// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateMemoryCollectionRequest extends TeaModel {
    @NameInMap("body")
    public UpdateMemoryCollectionInput body;

    public static UpdateMemoryCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryCollectionRequest self = new UpdateMemoryCollectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryCollectionRequest setBody(UpdateMemoryCollectionInput body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryCollectionInput getBody() {
        return this.body;
    }

}
