// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeRequest extends TeaModel {
    @NameInMap("NodeId")
    @Validation(required = true)
    public Long nodeId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    public static GetNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeRequest self = new GetNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public GetNodeRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
