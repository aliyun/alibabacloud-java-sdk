// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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

    @NameInMap("ReleaseNode")
    public Boolean releaseNode;

    public static DeleteClusterNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesShrinkRequest self = new DeleteClusterNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public DeleteClusterNodesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterNodesShrinkRequest setReleaseNode(Boolean releaseNode) {
        this.releaseNode = releaseNode;
        return this;
    }
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

}
