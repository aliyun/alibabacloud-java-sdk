// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteMultiZoneClusterRequest extends TeaModel {
    /**
     * <p>The ID of the multi-zone cluster to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-t4nn71xa0yn56****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to immediately delete the instance. By default, the instance is moved to the recycle bin and permanently deleted after 7 days. Valid values:</p>
     * <ul>
     * <li>true: Immediately deletes the instance without moving it to the recycle bin. Use this option with caution.</li>
     * <li>false: Moves the instance to the recycle bin. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ImmediateDeleteFlag")
    public Boolean immediateDeleteFlag;

    public static DeleteMultiZoneClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiZoneClusterRequest self = new DeleteMultiZoneClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultiZoneClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteMultiZoneClusterRequest setImmediateDeleteFlag(Boolean immediateDeleteFlag) {
        this.immediateDeleteFlag = immediateDeleteFlag;
        return this;
    }
    public Boolean getImmediateDeleteFlag() {
        return this.immediateDeleteFlag;
    }

}
