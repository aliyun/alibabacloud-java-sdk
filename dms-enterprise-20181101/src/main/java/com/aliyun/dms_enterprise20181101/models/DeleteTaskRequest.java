// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskRequest extends TeaModel {
    /**
     * <p>The ID of the node you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskRequest self = new DeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DeleteTaskRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
