// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApiTemplatesDTO extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Content")
    public String content;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("UserId")
    public String userId;

    public static ListApiTemplatesDTO build(java.util.Map<String, ?> map) throws Exception {
        ListApiTemplatesDTO self = new ListApiTemplatesDTO();
        return TeaModel.build(map, self);
    }

    public ListApiTemplatesDTO setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ListApiTemplatesDTO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ListApiTemplatesDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ListApiTemplatesDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public ListApiTemplatesDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListApiTemplatesDTO setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListApiTemplatesDTO setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApiTemplatesDTO setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListApiTemplatesDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListApiTemplatesDTO setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListApiTemplatesDTO setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListApiTemplatesDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
