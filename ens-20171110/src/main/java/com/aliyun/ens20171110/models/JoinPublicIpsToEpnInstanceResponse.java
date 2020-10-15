// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinPublicIpsToEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static JoinPublicIpsToEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinPublicIpsToEpnInstanceResponse self = new JoinPublicIpsToEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public JoinPublicIpsToEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
