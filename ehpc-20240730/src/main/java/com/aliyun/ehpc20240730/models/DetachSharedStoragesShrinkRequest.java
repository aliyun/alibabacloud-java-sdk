// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DetachSharedStoragesShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about mounted shared storage resources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SharedStorages")
    public String sharedStoragesShrink;

    public static DetachSharedStoragesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachSharedStoragesShrinkRequest self = new DetachSharedStoragesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachSharedStoragesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DetachSharedStoragesShrinkRequest setSharedStoragesShrink(String sharedStoragesShrink) {
        this.sharedStoragesShrink = sharedStoragesShrink;
        return this;
    }
    public String getSharedStoragesShrink() {
        return this.sharedStoragesShrink;
    }

}
