// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskContentRequest extends TeaModel {
    /**
     * <p>The node configurations after modification.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;dbId&quot;:12****, &quot;sql&quot;:&quot;select * from test_table&quot;,   &quot;dbType&quot;:&quot;lindorm_sql&quot;  }</p>
     */
    @NameInMap("NodeContent")
    public String nodeContent;

    /**
     * <p>The ID of the task node. You can call the <a href="https://help.aliyun.com/document_detail/424711.html">GetTaskInstanceRelation</a> operation to query the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">&quot;View information about the current tenant&quot;</a> section of the Manage DMS tenants topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskContentRequest self = new UpdateTaskContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskContentRequest setNodeContent(String nodeContent) {
        this.nodeContent = nodeContent;
        return this;
    }
    public String getNodeContent() {
        return this.nodeContent;
    }

    public UpdateTaskContentRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskContentRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
