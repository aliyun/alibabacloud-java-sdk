// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeletePhysicalSpaceRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    public static DeletePhysicalSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePhysicalSpaceRequest self = new DeletePhysicalSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DeletePhysicalSpaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeletePhysicalSpaceRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

}
