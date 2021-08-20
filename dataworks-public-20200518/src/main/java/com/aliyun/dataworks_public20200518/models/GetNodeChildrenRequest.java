// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeChildrenRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("NodeId")
    public Long nodeId;

    public static GetNodeChildrenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeChildrenRequest self = new GetNodeChildrenRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeChildrenRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public GetNodeChildrenRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

}
