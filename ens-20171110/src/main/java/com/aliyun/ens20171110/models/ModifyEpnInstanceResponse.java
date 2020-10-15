// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEpnInstanceResponse self = new ModifyEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
