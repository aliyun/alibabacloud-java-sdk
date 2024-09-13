// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveInstanceSDGRequest extends TeaModel {
    /**
     * <p>The IDs of the instances. The value is a JSON array that consists of up to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static RemoveInstanceSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceSDGRequest self = new RemoveInstanceSDGRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceSDGRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
