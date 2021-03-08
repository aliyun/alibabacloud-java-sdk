// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDedicatedLineRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDedicatedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedLineRequest self = new GetDedicatedLineRequest();
        return TeaModel.build(map, self);
    }

    public GetDedicatedLineRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public GetDedicatedLineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
