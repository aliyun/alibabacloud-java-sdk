// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGRequest extends TeaModel {
    /**
     * <p>IDs of Android in Container (AIC) instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static RemoveSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGRequest self = new RemoveSDGRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSDGRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
