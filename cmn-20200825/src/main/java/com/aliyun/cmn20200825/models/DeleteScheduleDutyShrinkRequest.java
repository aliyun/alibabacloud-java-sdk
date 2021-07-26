// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleDutyShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ScheduleDutyId")
    public String scheduleDutyId;

    // typeWorkerList
    @NameInMap("TypeWorkerList")
    public String typeWorkerListShrink;

    public static DeleteScheduleDutyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleDutyShrinkRequest self = new DeleteScheduleDutyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleDutyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScheduleDutyShrinkRequest setScheduleDutyId(String scheduleDutyId) {
        this.scheduleDutyId = scheduleDutyId;
        return this;
    }
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

    public DeleteScheduleDutyShrinkRequest setTypeWorkerListShrink(String typeWorkerListShrink) {
        this.typeWorkerListShrink = typeWorkerListShrink;
        return this;
    }
    public String getTypeWorkerListShrink() {
        return this.typeWorkerListShrink;
    }

}
