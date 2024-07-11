// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeDiskSizeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16o0pd52e3y****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("NodeDiskSize")
    public Integer nodeDiskSize;

    public static ResizeDiskSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskSizeRequest self = new ResizeDiskSizeRequest();
        return TeaModel.build(map, self);
    }

    public ResizeDiskSizeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeDiskSizeRequest setNodeDiskSize(Integer nodeDiskSize) {
        this.nodeDiskSize = nodeDiskSize;
        return this;
    }
    public Integer getNodeDiskSize() {
        return this.nodeDiskSize;
    }

}
