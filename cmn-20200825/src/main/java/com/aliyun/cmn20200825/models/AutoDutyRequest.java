// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class AutoDutyRequest extends TeaModel {
    // 批次号
    @NameInMap("DutyBatch")
    public String dutyBatch;

    // 表明
    @NameInMap("DutyName")
    public String dutyName;

    // 结束时间
    @NameInMap("EndDate")
    public String endDate;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 开始时间
    @NameInMap("StartDate")
    public String startDate;

    public static AutoDutyRequest build(java.util.Map<String, ?> map) throws Exception {
        AutoDutyRequest self = new AutoDutyRequest();
        return TeaModel.build(map, self);
    }

    public AutoDutyRequest setDutyBatch(String dutyBatch) {
        this.dutyBatch = dutyBatch;
        return this;
    }
    public String getDutyBatch() {
        return this.dutyBatch;
    }

    public AutoDutyRequest setDutyName(String dutyName) {
        this.dutyName = dutyName;
        return this;
    }
    public String getDutyName() {
        return this.dutyName;
    }

    public AutoDutyRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public AutoDutyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AutoDutyRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
