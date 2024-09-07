// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateNodesShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about the compute nodes that you want to update.</p>
     */
    @NameInMap("Instances")
    public String instancesShrink;

    public static UpdateNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodesShrinkRequest self = new UpdateNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateNodesShrinkRequest setInstancesShrink(String instancesShrink) {
        this.instancesShrink = instancesShrink;
        return this;
    }
    public String getInstancesShrink() {
        return this.instancesShrink;
    }

}
