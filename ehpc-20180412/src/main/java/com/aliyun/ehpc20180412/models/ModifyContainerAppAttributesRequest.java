// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyContainerAppAttributesRequest extends TeaModel {
    @NameInMap("ContainerId")
    public String containerId;

    @NameInMap("Description")
    public String description;

    public static ModifyContainerAppAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerAppAttributesRequest self = new ModifyContainerAppAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyContainerAppAttributesRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public ModifyContainerAppAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
