// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StartEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEpnInstanceResponse self = new StartEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
