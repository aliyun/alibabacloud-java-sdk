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

}
