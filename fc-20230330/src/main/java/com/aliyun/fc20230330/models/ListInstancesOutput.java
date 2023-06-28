// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListInstancesOutput extends TeaModel {
    @NameInMap("instances")
    public java.util.List<InstanceInfo> instances;

    public static ListInstancesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesOutput self = new ListInstancesOutput();
        return TeaModel.build(map, self);
    }

    public ListInstancesOutput setInstances(java.util.List<InstanceInfo> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<InstanceInfo> getInstances() {
        return this.instances;
    }

}
