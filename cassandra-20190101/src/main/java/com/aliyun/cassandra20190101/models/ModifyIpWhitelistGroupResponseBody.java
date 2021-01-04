// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpWhitelistGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhitelistGroupResponseBody self = new ModifyIpWhitelistGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhitelistGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
