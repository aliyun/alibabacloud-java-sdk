// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateWaitingOrderResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    public String dryRunResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WaitTimeCycle")
    public String waitTimeCycle;

    @NameInMap("WaitTimeValue")
    public Integer waitTimeValue;

    @NameInMap("WaitingOrderId")
    public String waitingOrderId;

    public static CreateWaitingOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingOrderResponseBody self = new CreateWaitingOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWaitingOrderResponseBody setDryRunResult(String dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public String getDryRunResult() {
        return this.dryRunResult;
    }

    public CreateWaitingOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWaitingOrderResponseBody setWaitTimeCycle(String waitTimeCycle) {
        this.waitTimeCycle = waitTimeCycle;
        return this;
    }
    public String getWaitTimeCycle() {
        return this.waitTimeCycle;
    }

    public CreateWaitingOrderResponseBody setWaitTimeValue(Integer waitTimeValue) {
        this.waitTimeValue = waitTimeValue;
        return this;
    }
    public Integer getWaitTimeValue() {
        return this.waitTimeValue;
    }

    public CreateWaitingOrderResponseBody setWaitingOrderId(String waitingOrderId) {
        this.waitingOrderId = waitingOrderId;
        return this;
    }
    public String getWaitingOrderId() {
        return this.waitingOrderId;
    }

}
