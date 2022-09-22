// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateReservationDemandResponseBody extends TeaModel {
    @NameInMap("DemandId")
    public String demandId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateReservationDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReservationDemandResponseBody self = new CreateReservationDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReservationDemandResponseBody setDemandId(String demandId) {
        this.demandId = demandId;
        return this;
    }
    public String getDemandId() {
        return this.demandId;
    }

    public CreateReservationDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
