// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSavingsPlanResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SavingsPlanId")
    public String savingsPlanId;

    public static CreateSavingsPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlanResponseBody self = new CreateSavingsPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlanResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSavingsPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSavingsPlanResponseBody setSavingsPlanId(String savingsPlanId) {
        this.savingsPlanId = savingsPlanId;
        return this;
    }
    public String getSavingsPlanId() {
        return this.savingsPlanId;
    }

}
