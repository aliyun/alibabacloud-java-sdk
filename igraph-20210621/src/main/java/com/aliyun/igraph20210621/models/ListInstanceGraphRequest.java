// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListInstanceGraphRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static ListInstanceGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceGraphRequest self = new ListInstanceGraphRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceGraphRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
