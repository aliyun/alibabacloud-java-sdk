// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeParentsRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("NodeId")
    public Long nodeId;

    public static GetNodeParentsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeParentsRequest self = new GetNodeParentsRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeParentsRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public GetNodeParentsRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

}
