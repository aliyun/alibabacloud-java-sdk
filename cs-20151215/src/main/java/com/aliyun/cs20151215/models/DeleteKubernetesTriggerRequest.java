// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteKubernetesTriggerRequest extends TeaModel {
    // 触发器ID。
    @NameInMap("Id")
    public String id;

    public static DeleteKubernetesTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubernetesTriggerRequest self = new DeleteKubernetesTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKubernetesTriggerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
