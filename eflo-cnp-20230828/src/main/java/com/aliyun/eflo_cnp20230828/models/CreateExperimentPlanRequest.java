// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanRequest extends TeaModel {
    /**
     * <p>Additional parameters</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExternalParams")
    public java.util.Map<String, ?> externalParams;

    /**
     * <p>Resource group ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzij65sf2rr5i</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource ID</p>
     * 
     * <strong>example:</strong>
     * <p>189</p>
     */
    @NameInMap("ResourceId")
    public Long resourceId;

    /**
     * <p>Template ID</p>
     * 
     * <strong>example:</strong>
     * <p>349623</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateExperimentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanRequest self = new CreateExperimentPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanRequest setExternalParams(java.util.Map<String, ?> externalParams) {
        this.externalParams = externalParams;
        return this;
    }
    public java.util.Map<String, ?> getExternalParams() {
        return this.externalParams;
    }

    public CreateExperimentPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateExperimentPlanRequest setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public CreateExperimentPlanRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
