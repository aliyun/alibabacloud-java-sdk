// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskContentV2Request extends TeaModel {
    /**
     * <p>The node configurations after modification.</p>
     * <blockquote>
     * <p> We recommend that you change the SQL type from SELECT to INSERT/CREATE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;dbId&quot;:12****, &quot;sql&quot;:&quot;select * from test_table&quot;,   &quot;dbType&quot;:&quot;lindorm_sql&quot;  }</p>
     */
    @NameInMap("NodeContent")
    public String nodeContent;

    /**
     * <p>The ID of the task node. You can call the <a href="https://help.aliyun.com/document_detail/424711.html">GetTaskInstanceRelation</a> operation to query the node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>449***</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static UpdateTaskContentV2Request build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskContentV2Request self = new UpdateTaskContentV2Request();
        return TeaModel.build(map, self);
    }

    public UpdateTaskContentV2Request setNodeContent(String nodeContent) {
        this.nodeContent = nodeContent;
        return this;
    }
    public String getNodeContent() {
        return this.nodeContent;
    }

    public UpdateTaskContentV2Request setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
