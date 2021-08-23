// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasEdgeDTO extends TeaModel {
    // Target
    @NameInMap("Target")
    public String target;

    // Id
    @NameInMap("Id")
    public String id;

    // Source
    @NameInMap("Source")
    public String source;

    // Label
    @NameInMap("Label")
    public String label;

    public static PaasEdgeDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasEdgeDTO self = new PaasEdgeDTO();
        return TeaModel.build(map, self);
    }

    public PaasEdgeDTO setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PaasEdgeDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PaasEdgeDTO setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PaasEdgeDTO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

}
