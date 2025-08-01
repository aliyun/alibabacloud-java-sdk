// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApiTemplateRequest extends TeaModel {
    /**
     * <p>The name of the API operation. You can create only a cluster API operation template. Set the value to CreateCluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateCluster</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The content of the cluster API operation template. Set the value to JSON strings of the request parameters of the <a href="https://help.aliyun.com/document_detail/454393.html">CreateCluster</a> API operation for creating a cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateCluster</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Template ID (it is recommended to use the parameter TemplateId).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AT-****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>datalakeTest1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static UpdateApiTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiTemplateRequest self = new UpdateApiTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiTemplateRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UpdateApiTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateApiTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApiTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateApiTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateApiTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
