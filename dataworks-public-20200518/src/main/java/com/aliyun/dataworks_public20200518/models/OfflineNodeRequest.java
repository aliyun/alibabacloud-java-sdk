// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class OfflineNodeRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can call the [ListProjects](https://help.aliyun.com/document_detail/178393.html) operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * <br>
     * <p>This parameter is required.</p>
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
