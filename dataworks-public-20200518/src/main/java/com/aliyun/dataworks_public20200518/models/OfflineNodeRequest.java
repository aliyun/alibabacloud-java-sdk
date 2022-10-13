// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class OfflineNodeRequest extends TeaModel {
    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static OfflineNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineNodeRequest self = new OfflineNodeRequest();
        return TeaModel.build(map, self);
    }

    public OfflineNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public OfflineNodeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
