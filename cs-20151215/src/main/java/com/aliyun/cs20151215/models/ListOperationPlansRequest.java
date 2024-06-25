// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListOperationPlansRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The operation plan type.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster_upgrade</p>
     */
    @NameInMap("type")
    public String type;

    public static ListOperationPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationPlansRequest self = new ListOperationPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationPlansRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListOperationPlansRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
