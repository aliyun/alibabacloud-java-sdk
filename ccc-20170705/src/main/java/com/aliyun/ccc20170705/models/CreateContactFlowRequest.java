// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateContactFlowRequest extends TeaModel {
    @NameInMap("Canvas")
    public String canvas;

    @NameInMap("Content")
    public String content;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    public static CreateContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContactFlowRequest self = new CreateContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateContactFlowRequest setCanvas(String canvas) {
        this.canvas = canvas;
        return this;
    }
    public String getCanvas() {
        return this.canvas;
    }

    public CreateContactFlowRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateContactFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateContactFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContactFlowRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
