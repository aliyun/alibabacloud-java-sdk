// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasProcessData extends TeaModel {
    @NameInMap("Edges")
    public java.util.List<PaasEdgeDTO> edges;

    @NameInMap("Nodes")
    public java.util.List<PaasNodeDTO> nodes;

    public static PaasProcessData build(java.util.Map<String, ?> map) throws Exception {
        PaasProcessData self = new PaasProcessData();
        return TeaModel.build(map, self);
    }

    public PaasProcessData setEdges(java.util.List<PaasEdgeDTO> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<PaasEdgeDTO> getEdges() {
        return this.edges;
    }

    public PaasProcessData setNodes(java.util.List<PaasNodeDTO> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<PaasNodeDTO> getNodes() {
        return this.nodes;
    }

}
