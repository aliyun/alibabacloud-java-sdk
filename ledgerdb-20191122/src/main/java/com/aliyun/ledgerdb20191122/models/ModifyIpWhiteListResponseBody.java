// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyIpWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhiteListResponseBody self = new ModifyIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
