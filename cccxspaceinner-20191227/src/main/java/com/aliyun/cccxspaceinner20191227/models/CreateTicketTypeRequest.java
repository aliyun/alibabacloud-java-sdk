// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateTicketTypeRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateTicketTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketTypeRequest self = new CreateTicketTypeRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketTypeRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public CreateTicketTypeRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CreateTicketTypeRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateTicketTypeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTicketTypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
