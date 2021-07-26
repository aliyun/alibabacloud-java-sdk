// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleDutyShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 开始时间
    @NameInMap("StartDate")
    public String startDate;

    // 结束时间
    @NameInMap("EndDate")
    public String endDate;

    // 值班表类型
    @NameInMap("ScheduleTypeIds")
    public String scheduleTypeIdsShrink;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateScheduleDutyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleDutyShrinkRequest self = new CreateScheduleDutyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleDutyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScheduleDutyShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateScheduleDutyShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateScheduleDutyShrinkRequest setScheduleTypeIdsShrink(String scheduleTypeIdsShrink) {
        this.scheduleTypeIdsShrink = scheduleTypeIdsShrink;
        return this;
    }
    public String getScheduleTypeIdsShrink() {
        return this.scheduleTypeIdsShrink;
    }

    public CreateScheduleDutyShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
