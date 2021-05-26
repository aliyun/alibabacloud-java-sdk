// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("CreatorType")
    public Integer creatorType;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("FromInfo")
    public String fromInfo;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("CarbonCopy")
    public String carbonCopy;

    @NameInMap("FormData")
    public String formData;

    @NameInMap("AgentId")
    public Long agentId;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTicketRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CreateTicketRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateTicketRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateTicketRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTicketRequest setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public Integer getCreatorType() {
        return this.creatorType;
    }

    public CreateTicketRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public CreateTicketRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateTicketRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateTicketRequest setFromInfo(String fromInfo) {
        this.fromInfo = fromInfo;
        return this;
    }
    public String getFromInfo() {
        return this.fromInfo;
    }

    public CreateTicketRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTicketRequest setCarbonCopy(String carbonCopy) {
        this.carbonCopy = carbonCopy;
        return this;
    }
    public String getCarbonCopy() {
        return this.carbonCopy;
    }

    public CreateTicketRequest setFormData(String formData) {
        this.formData = formData;
        return this;
    }
    public String getFormData() {
        return this.formData;
    }

    public CreateTicketRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
