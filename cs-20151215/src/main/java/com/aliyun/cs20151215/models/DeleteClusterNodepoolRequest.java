// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodepoolRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully delete the node pool.</p>
     */
    @NameInMap("force")
    public Boolean force;

    public static DeleteClusterNodepoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodepoolRequest self = new DeleteClusterNodepoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodepoolRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
