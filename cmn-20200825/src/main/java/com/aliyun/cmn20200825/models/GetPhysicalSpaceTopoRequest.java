// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetPhysicalSpaceTopoRequest extends TeaModel {
    // 物理空间id
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // 拓扑类型
    @NameInMap("TopoType")
    public String topoType;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetPhysicalSpaceTopoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalSpaceTopoRequest self = new GetPhysicalSpaceTopoRequest();
        return TeaModel.build(map, self);
    }

    public GetPhysicalSpaceTopoRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public GetPhysicalSpaceTopoRequest setTopoType(String topoType) {
        this.topoType = topoType;
        return this;
    }
    public String getTopoType() {
        return this.topoType;
    }

    public GetPhysicalSpaceTopoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
