// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskContentRequest extends TeaModel {
    @NameInMap("NodeContent")
    public String nodeContent;

    @NameInMap("NodeId")
    public String nodeId;

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
