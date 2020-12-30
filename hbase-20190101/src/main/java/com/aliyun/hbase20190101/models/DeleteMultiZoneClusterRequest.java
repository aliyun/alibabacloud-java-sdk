// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteMultiZoneClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

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
