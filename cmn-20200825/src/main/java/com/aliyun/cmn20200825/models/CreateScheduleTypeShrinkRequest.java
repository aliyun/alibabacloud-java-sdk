// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleTypeShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 值班类型key
    @NameInMap("ScheduleType")
    public String scheduleType;

    // relatedWorkerStr
    @NameInMap("RelatedWorker")
    public String relatedWorkerShrink;

    // 值班类型状态
    @NameInMap("Status")
    public String status;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateScheduleTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleTypeShrinkRequest self = new CreateScheduleTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleTypeShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScheduleTypeShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateScheduleTypeShrinkRequest setRelatedWorkerShrink(String relatedWorkerShrink) {
        this.relatedWorkerShrink = relatedWorkerShrink;
        return this;
    }
    public String getRelatedWorkerShrink() {
        return this.relatedWorkerShrink;
    }

    public CreateScheduleTypeShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateScheduleTypeShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
