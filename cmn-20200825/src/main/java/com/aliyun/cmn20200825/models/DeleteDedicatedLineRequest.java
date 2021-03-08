// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDedicatedLineRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDedicatedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedLineRequest self = new DeleteDedicatedLineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedLineRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public DeleteDedicatedLineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
