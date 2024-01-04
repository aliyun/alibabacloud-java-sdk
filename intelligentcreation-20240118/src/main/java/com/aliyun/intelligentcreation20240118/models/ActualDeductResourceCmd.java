// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ActualDeductResourceCmd extends TeaModel {
    @NameInMap("cost")
    public Long cost;

    @NameInMap("extraInfo")
    public String extraInfo;

    @NameInMap("idempotentId")
    public String idempotentId;

    @NameInMap("taskId")
    public String taskId;

    public static ActualDeductResourceCmd build(java.util.Map<String, ?> map) throws Exception {
        ActualDeductResourceCmd self = new ActualDeductResourceCmd();
        return TeaModel.build(map, self);
    }

    public ActualDeductResourceCmd setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public ActualDeductResourceCmd setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ActualDeductResourceCmd setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public ActualDeductResourceCmd setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
