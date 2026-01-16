// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteClusterNodePoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
     */
    @NameInMap("NodepoolId")
    public String nodepoolId;

    public static DeleteClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodePoolRequest self = new DeleteClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterNodePoolRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

}
