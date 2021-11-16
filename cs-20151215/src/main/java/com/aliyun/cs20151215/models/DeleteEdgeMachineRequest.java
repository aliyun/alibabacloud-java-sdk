// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteEdgeMachineRequest extends TeaModel {
    // whether force delete
    @NameInMap("force")
    public String force;

    public static DeleteEdgeMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeMachineRequest self = new DeleteEdgeMachineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeMachineRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

}
