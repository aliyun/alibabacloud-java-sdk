// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhitelistResponseBody self = new ModifyIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
