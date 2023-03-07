// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyContainerAppAttributesRequest extends TeaModel {
    /**
     * <p>The ID of the container.</p>
     * <br>
     * <p>You can call the [ListContainerApps](~~87333~~) operation to query the ID of the containerized application.</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The new description of the containerized application.</p>
     */
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
