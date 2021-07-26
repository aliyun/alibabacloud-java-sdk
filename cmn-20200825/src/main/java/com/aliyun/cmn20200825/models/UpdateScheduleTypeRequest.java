// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleTypeRequest extends TeaModel {
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
    public java.util.List<String> relatedWorker;

    // 值班类型状态
    @NameInMap("Status")
    public String status;

    public static UpdateScheduleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleTypeRequest self = new UpdateScheduleTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScheduleTypeRequest setScheduleTypeId(String scheduleTypeId) {
        this.scheduleTypeId = scheduleTypeId;
        return this;
    }
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public UpdateScheduleTypeRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateScheduleTypeRequest setRelatedWorker(java.util.List<String> relatedWorker) {
        this.relatedWorker = relatedWorker;
        return this;
    }
    public java.util.List<String> getRelatedWorker() {
        return this.relatedWorker;
    }

    public UpdateScheduleTypeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
