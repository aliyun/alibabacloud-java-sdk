// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartInstancesRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static StartInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesRequest self = new StartInstancesRequest();
        return TeaModel.build(map, self);
    }

    public StartInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
