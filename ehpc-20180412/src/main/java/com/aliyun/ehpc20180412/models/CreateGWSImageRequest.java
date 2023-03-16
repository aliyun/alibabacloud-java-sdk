// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSImageRequest extends TeaModel {
    /**
     * <p>The ID of the visualization instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The image name of the visualization instance.</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateGWSImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSImageRequest self = new CreateGWSImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateGWSImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateGWSImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
