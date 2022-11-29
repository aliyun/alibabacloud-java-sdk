// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceActiveOpsTaskRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static CreateInstanceActiveOpsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceActiveOpsTaskRequest self = new CreateInstanceActiveOpsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceActiveOpsTaskRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
