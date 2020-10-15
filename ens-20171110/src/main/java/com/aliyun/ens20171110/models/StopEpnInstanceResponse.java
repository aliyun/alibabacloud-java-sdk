// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopEpnInstanceResponse self = new StopEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
