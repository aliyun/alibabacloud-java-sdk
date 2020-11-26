// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CreateSchedruleOnDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateSchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedruleOnDemandResponse self = new CreateSchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchedruleOnDemandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
