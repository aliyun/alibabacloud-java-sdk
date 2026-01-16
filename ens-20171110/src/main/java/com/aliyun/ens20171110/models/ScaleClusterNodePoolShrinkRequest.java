// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolShrinkRequest extends TeaModel {
    @NameInMap("Body")
    public String bodyShrink;

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
     * <p>np2201da356f5245cf8faa522a8a4c8224</p>
     */
    @NameInMap("NodepoolId")
    public String nodepoolId;

    public static ScaleClusterNodePoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterNodePoolShrinkRequest self = new ScaleClusterNodePoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScaleClusterNodePoolShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public ScaleClusterNodePoolShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ScaleClusterNodePoolShrinkRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

}
