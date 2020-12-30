// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeDiskSizeRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

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
