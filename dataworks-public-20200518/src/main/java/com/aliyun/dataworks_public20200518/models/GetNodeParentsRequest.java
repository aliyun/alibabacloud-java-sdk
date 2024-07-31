// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeParentsRequest extends TeaModel {
    /**
     * <p>The node ID. You can go to the Operation Center page in the DataWorks console to query the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345456211234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The environment type of Operation Center. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
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
