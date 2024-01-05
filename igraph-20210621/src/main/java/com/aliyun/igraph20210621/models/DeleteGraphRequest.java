// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class DeleteGraphRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static DeleteGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGraphRequest self = new DeleteGraphRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGraphRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
