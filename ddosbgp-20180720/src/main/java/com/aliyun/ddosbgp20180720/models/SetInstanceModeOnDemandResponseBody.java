// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class SetInstanceModeOnDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetInstanceModeOnDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceModeOnDemandResponseBody self = new SetInstanceModeOnDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstanceModeOnDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
