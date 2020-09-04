// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ModifyPipelineDefinitionDslRequest extends TeaModel {
    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("NodePath")
    @Validation(required = true)
    public String nodePath;

    @NameInMap("NodeValue")
    @Validation(required = true)
    public String nodeValue;

    public static ModifyPipelineDefinitionDslRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPipelineDefinitionDslRequest self = new ModifyPipelineDefinitionDslRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPipelineDefinitionDslRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ModifyPipelineDefinitionDslRequest setNodePath(String nodePath) {
        this.nodePath = nodePath;
        return this;
    }
    public String getNodePath() {
        return this.nodePath;
    }

    public ModifyPipelineDefinitionDslRequest setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
        return this;
    }
    public String getNodeValue() {
        return this.nodeValue;
    }

}
