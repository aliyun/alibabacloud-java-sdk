// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterChecksRequest extends TeaModel {
    /**
     * <p>The check target to filter.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp19ay6nnvd4cexxxx</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>The check type. Valid values:</p>
     * <ul>
     * <li><p>ClusterMigrate: cluster migration.</p>
     * </li>
     * <li><p>MasterUpgrade: cluster control plane upgrade.</p>
     * </li>
     * <li><p>NodePoolUpgrade: node pool upgrade.</p>
     * </li>
     * <li><p>ClusterUpgrade: cluster upgrade.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ClusterUpgrade</p>
     */
    @NameInMap("type")
    public String type;

    public static ListClusterChecksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterChecksRequest self = new ListClusterChecksRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterChecksRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ListClusterChecksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
