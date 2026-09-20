// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterDiskSizeRequest extends TeaModel {
    /**
     * <p>The ID of the multi-zone instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-f5d6vc2r8d6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The disk size of core nodes. The value must be greater than the current disk size and must be a multiple of 40. Unit: GB. Maximum value: 64000.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    /**
     * <p>The disk size of log nodes. The value must be greater than the current disk size of log nodes and must be a multiple of 40. Unit: GB. Maximum value: 8000.</p>
     * 
     * <strong>example:</strong>
     * <p>440</p>
     */
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
