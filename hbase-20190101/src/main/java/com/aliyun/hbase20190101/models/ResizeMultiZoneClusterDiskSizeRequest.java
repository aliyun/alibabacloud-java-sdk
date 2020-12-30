// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterDiskSizeRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    @NameInMap("LogDiskSize")
    public Integer logDiskSize;

    public static ResizeMultiZoneClusterDiskSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterDiskSizeRequest self = new ResizeMultiZoneClusterDiskSizeRequest();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterDiskSizeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeMultiZoneClusterDiskSizeRequest setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public ResizeMultiZoneClusterDiskSizeRequest setLogDiskSize(Integer logDiskSize) {
        this.logDiskSize = logDiskSize;
        return this;
    }
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

}
