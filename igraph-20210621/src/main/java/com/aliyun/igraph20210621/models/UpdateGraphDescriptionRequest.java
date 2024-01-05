// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class UpdateGraphDescriptionRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static UpdateGraphDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGraphDescriptionRequest self = new UpdateGraphDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGraphDescriptionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
