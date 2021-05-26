// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateTicketTemplateRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("CaseType")
    public Integer caseType;

    @NameInMap("Status")
    public Integer status;

    public static UpdateTicketTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketTemplateRequest self = new UpdateTicketTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTicketTemplateRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public UpdateTicketTemplateRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public UpdateTicketTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public UpdateTicketTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTicketTemplateRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public UpdateTicketTemplateRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public UpdateTicketTemplateRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
    }

    public UpdateTicketTemplateRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
