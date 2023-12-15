// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogFlowModuleDefinition extends TeaModel {
    @NameInMap("Edges")
    public java.util.List<PaasEdgeDTO> edges;

    @NameInMap("Nodes")
    public java.util.List<PaasNodeDTO> nodes;

    public static UpdateDialogFlowModuleDefinition build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogFlowModuleDefinition self = new UpdateDialogFlowModuleDefinition();
        return TeaModel.build(map, self);
    }

    public UpdateDialogFlowModuleDefinition setEdges(java.util.List<PaasEdgeDTO> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<PaasEdgeDTO> getEdges() {
        return this.edges;
    }

    public UpdateDialogFlowModuleDefinition setNodes(java.util.List<PaasNodeDTO> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<PaasNodeDTO> getNodes() {
        return this.nodes;
    }

}
