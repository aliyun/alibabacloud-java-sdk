// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodepoolRequest extends TeaModel {
    /**
     * <p>Specifies whether to force delete the node pool.</p>
     * <ul>
     * <li><p>true: Force deletes the node pool. If the node pool contains existing instances, the existing nodes are forcibly deleted.</p>
     * </li>
     * <li><p>false: Does not force delete the node pool. If the node pool contains existing instances, the node pool cannot be deleted, and an error is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
