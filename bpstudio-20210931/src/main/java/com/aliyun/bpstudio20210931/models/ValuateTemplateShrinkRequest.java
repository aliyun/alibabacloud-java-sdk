// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateTemplateShrinkRequest extends TeaModel {
    @NameInMap("AreaId")
    public String areaId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Instances")
    public String instancesShrink;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Variables")
    public String variablesShrink;

    public static ValuateTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ValuateTemplateShrinkRequest self = new ValuateTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ValuateTemplateShrinkRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public ValuateTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValuateTemplateShrinkRequest setInstancesShrink(String instancesShrink) {
        this.instancesShrink = instancesShrink;
        return this;
    }
    public String getInstancesShrink() {
        return this.instancesShrink;
    }

    public ValuateTemplateShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ValuateTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ValuateTemplateShrinkRequest setVariablesShrink(String variablesShrink) {
        this.variablesShrink = variablesShrink;
        return this;
    }
    public String getVariablesShrink() {
        return this.variablesShrink;
    }

}
