// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDemandResponseBody extends TeaModel {
    @NameInMap("DemandId")
    public String demandId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandResponseBody self = new CreateDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDemandResponseBody setDemandId(String demandId) {
        this.demandId = demandId;
        return this;
    }
    public String getDemandId() {
        return this.demandId;
    }

    public CreateDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
