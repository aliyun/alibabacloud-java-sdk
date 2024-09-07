// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteNodesShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/87116.html">listclusters</a> operation to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The instance IDs of the compute nodes that you want to delete.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static DeleteNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodesShrinkRequest self = new DeleteNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
