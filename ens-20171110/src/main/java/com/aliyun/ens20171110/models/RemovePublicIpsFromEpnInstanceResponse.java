// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemovePublicIpsFromEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemovePublicIpsFromEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePublicIpsFromEpnInstanceResponse self = new RemovePublicIpsFromEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemovePublicIpsFromEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
