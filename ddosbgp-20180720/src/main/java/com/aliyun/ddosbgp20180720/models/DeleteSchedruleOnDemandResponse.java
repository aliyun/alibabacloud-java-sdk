// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteSchedruleOnDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteSchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedruleOnDemandResponse self = new DeleteSchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchedruleOnDemandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
