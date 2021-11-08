// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class CreateApplicationShrinkRequest extends TeaModel {
    // 区域ID
    @NameInMap("AreaId")
    public String areaId;

    // 幂等标记
    @NameInMap("ClientToken")
    public String clientToken;

    // 待替换实例列表
    @NameInMap("Instances")
    public String instancesShrink;

    // 新建应用名
    @NameInMap("Name")
    public String name;

    // 应用所属资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 模板ID
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationShrinkRequest self = new CreateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationShrinkRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public CreateApplicationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationShrinkRequest setInstancesShrink(String instancesShrink) {
        this.instancesShrink = instancesShrink;
        return this;
    }
    public String getInstancesShrink() {
        return this.instancesShrink;
    }

    public CreateApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
