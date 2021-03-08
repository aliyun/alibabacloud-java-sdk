// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetPhysicalSpaceRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetPhysicalSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalSpaceRequest self = new GetPhysicalSpaceRequest();
        return TeaModel.build(map, self);
    }

    public GetPhysicalSpaceRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public GetPhysicalSpaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
