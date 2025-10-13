// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstanceNameRequest extends TeaModel {
    /**
     * <p>The new name of the instance. The name must be 2 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>new_name</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    public static UpdateInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNameRequest self = new UpdateInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
