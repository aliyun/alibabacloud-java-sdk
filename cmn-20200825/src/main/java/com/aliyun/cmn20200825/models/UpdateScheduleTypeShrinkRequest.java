// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleTypeShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源一级ID
    @NameInMap("ScheduleTypeId")
    public String scheduleTypeId;

    // 值班类型key
    @NameInMap("ScheduleType")
    public String scheduleType;

    // relatedWorkerStr
    @NameInMap("RelatedWorker")
    public String relatedWorkerShrink;

    // 值班类型状态
    @NameInMap("Status")
    public String status;

    public static UpdateScheduleTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleTypeShrinkRequest self = new UpdateScheduleTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleTypeShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScheduleTypeShrinkRequest setScheduleTypeId(String scheduleTypeId) {
        this.scheduleTypeId = scheduleTypeId;
        return this;
    }
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public UpdateScheduleTypeShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateScheduleTypeShrinkRequest setRelatedWorkerShrink(String relatedWorkerShrink) {
        this.relatedWorkerShrink = relatedWorkerShrink;
        return this;
    }
    public String getRelatedWorkerShrink() {
        return this.relatedWorkerShrink;
    }

    public UpdateScheduleTypeShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
