// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateTicketTemplateRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("TicketType")
    public Integer ticketType;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("Schema")
    public String schema;

    public static CreateTicketTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketTemplateRequest self = new CreateTicketTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketTemplateRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public CreateTicketTemplateRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CreateTicketTemplateRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateTicketTemplateRequest setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
        return this;
    }
    public Integer getTicketType() {
        return this.ticketType;
    }

    public CreateTicketTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTicketTemplateRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public CreateTicketTemplateRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
