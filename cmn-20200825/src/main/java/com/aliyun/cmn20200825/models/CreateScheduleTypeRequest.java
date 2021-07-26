// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleTypeRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 值班类型key
    @NameInMap("ScheduleType")
    public String scheduleType;

    // relatedWorkerStr
    @NameInMap("RelatedWorker")
    public java.util.List<String> relatedWorker;

    // 值班类型状态
    @NameInMap("Status")
    public String status;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateScheduleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleTypeRequest self = new CreateScheduleTypeRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScheduleTypeRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateScheduleTypeRequest setRelatedWorker(java.util.List<String> relatedWorker) {
        this.relatedWorker = relatedWorker;
        return this;
    }
    public java.util.List<String> getRelatedWorker() {
        return this.relatedWorker;
    }

    public CreateScheduleTypeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateScheduleTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
