// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDemandResponseBody extends TeaModel {
    /**
     * <p>The ID of the demand.</p>
     * 
     * <strong>example:</strong>
     * <p>ed-bp11n21kq00sl71p****</p>
     */
    @NameInMap("DemandId")
    public String demandId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
