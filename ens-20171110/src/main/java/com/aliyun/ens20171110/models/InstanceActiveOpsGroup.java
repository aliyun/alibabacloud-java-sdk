// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InstanceActiveOpsGroup extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static InstanceActiveOpsGroup build(java.util.Map<String, ?> map) throws Exception {
        InstanceActiveOpsGroup self = new InstanceActiveOpsGroup();
        return TeaModel.build(map, self);
    }

    public InstanceActiveOpsGroup setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
