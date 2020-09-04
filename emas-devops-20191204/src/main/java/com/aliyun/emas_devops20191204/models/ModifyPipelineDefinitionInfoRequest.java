// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ModifyPipelineDefinitionInfoRequest extends TeaModel {
    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyPipelineDefinitionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPipelineDefinitionInfoRequest self = new ModifyPipelineDefinitionInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPipelineDefinitionInfoRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ModifyPipelineDefinitionInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPipelineDefinitionInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
