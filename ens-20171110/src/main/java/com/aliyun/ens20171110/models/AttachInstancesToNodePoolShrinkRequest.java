// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolShrinkRequest extends TeaModel {
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
    public String instancesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
     */
    @NameInMap("NodepoolId")
    public String nodepoolId;

    public static AttachInstancesToNodePoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesToNodePoolShrinkRequest self = new AttachInstancesToNodePoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstancesToNodePoolShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AttachInstancesToNodePoolShrinkRequest setInstancesShrink(String instancesShrink) {
        this.instancesShrink = instancesShrink;
        return this;
    }
    public String getInstancesShrink() {
        return this.instancesShrink;
    }

    public AttachInstancesToNodePoolShrinkRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

}
