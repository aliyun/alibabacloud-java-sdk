// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class OfflineNodeRequest extends TeaModel {
    /**
     * <p>The node ID. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The DataWorks workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9527</p>
     */
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
