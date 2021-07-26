// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源id
    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    // 建设项目资源uuid
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 数据
    @NameInMap("ResourceInformation")
    public String resourceInformationShrink;

    public static UpdateResourceInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceShrinkRequest self = new UpdateResourceInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateResourceInstanceShrinkRequest setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public UpdateResourceInstanceShrinkRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateResourceInstanceShrinkRequest setResourceInformationShrink(String resourceInformationShrink) {
        this.resourceInformationShrink = resourceInformationShrink;
        return this;
    }
    public String getResourceInformationShrink() {
        return this.resourceInformationShrink;
    }

}
