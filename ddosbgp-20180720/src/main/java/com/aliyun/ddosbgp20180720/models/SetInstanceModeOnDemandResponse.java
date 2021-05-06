// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class SetInstanceModeOnDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetInstanceModeOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceModeOnDemandResponse self = new SetInstanceModeOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceModeOnDemandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
