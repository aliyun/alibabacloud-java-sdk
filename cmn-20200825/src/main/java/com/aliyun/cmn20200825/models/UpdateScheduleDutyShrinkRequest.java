// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleDutyShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源一级ID
    @NameInMap("ScheduleDutyId")
    public String scheduleDutyId;

    // typeWorkerList
    @NameInMap("TypeWorkerList")
    public String typeWorkerListShrink;

    public static UpdateScheduleDutyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleDutyShrinkRequest self = new UpdateScheduleDutyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleDutyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScheduleDutyShrinkRequest setScheduleDutyId(String scheduleDutyId) {
        this.scheduleDutyId = scheduleDutyId;
        return this;
    }
    public String getScheduleDutyId() {
        return this.scheduleDutyId;
    }

    public UpdateScheduleDutyShrinkRequest setTypeWorkerListShrink(String typeWorkerListShrink) {
        this.typeWorkerListShrink = typeWorkerListShrink;
        return this;
    }
    public String getTypeWorkerListShrink() {
        return this.typeWorkerListShrink;
    }

}
