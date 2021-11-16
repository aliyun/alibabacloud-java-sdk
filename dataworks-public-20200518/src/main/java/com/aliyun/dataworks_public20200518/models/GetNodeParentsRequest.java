// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeParentsRequest extends TeaModel {
    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static GetNodeParentsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeParentsRequest self = new GetNodeParentsRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeParentsRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public GetNodeParentsRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
