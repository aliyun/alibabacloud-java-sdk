// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateResourceInformationShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源信息Id
    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 资源属性
    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    // 信息
    @NameInMap("Information")
    public String informationShrink;

    public static UpdateResourceInformationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInformationShrinkRequest self = new UpdateResourceInformationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInformationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateResourceInformationShrinkRequest setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public UpdateResourceInformationShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateResourceInformationShrinkRequest setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public UpdateResourceInformationShrinkRequest setInformationShrink(String informationShrink) {
        this.informationShrink = informationShrink;
        return this;
    }
    public String getInformationShrink() {
        return this.informationShrink;
    }

}
