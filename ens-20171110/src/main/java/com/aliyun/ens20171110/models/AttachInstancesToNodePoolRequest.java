// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolRequest extends TeaModel {
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
     */
    @NameInMap("Instances")
    public java.util.List<String> instances;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
     */
    @NameInMap("NodepoolId")
    public String nodepoolId;

    public static AttachInstancesToNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesToNodePoolRequest self = new AttachInstancesToNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstancesToNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AttachInstancesToNodePoolRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public AttachInstancesToNodePoolRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

}
