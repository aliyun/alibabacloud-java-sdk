// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleDutyRequest extends TeaModel {
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
    public java.util.List<String> scheduleTypeIds;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateScheduleDutyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleDutyRequest self = new CreateScheduleDutyRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleDutyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScheduleDutyRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateScheduleDutyRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateScheduleDutyRequest setScheduleTypeIds(java.util.List<String> scheduleTypeIds) {
        this.scheduleTypeIds = scheduleTypeIds;
        return this;
    }
    public java.util.List<String> getScheduleTypeIds() {
        return this.scheduleTypeIds;
    }

    public CreateScheduleDutyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
