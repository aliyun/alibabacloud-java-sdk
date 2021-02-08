// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DemandId")
    @Validation(required = true)
    public String demandId;

    public static CreateDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandResponse self = new CreateDemandResponse();
        return TeaModel.build(map, self);
    }

    public CreateDemandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDemandResponse setDemandId(String demandId) {
        this.demandId = demandId;
        return this;
    }
    public String getDemandId() {
        return this.demandId;
    }

}
