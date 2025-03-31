// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyCloudPhoneNodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>node_name_new</p>
     */
    @NameInMap("NewNodeName")
    public String newNodeName;

    /**
     * <strong>example:</strong>
     * <p>cpn-0ugbptfu473fy****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static ModifyCloudPhoneNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudPhoneNodeRequest self = new ModifyCloudPhoneNodeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudPhoneNodeRequest setNewNodeName(String newNodeName) {
        this.newNodeName = newNodeName;
        return this;
    }
    public String getNewNodeName() {
        return this.newNodeName;
    }

    public ModifyCloudPhoneNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
