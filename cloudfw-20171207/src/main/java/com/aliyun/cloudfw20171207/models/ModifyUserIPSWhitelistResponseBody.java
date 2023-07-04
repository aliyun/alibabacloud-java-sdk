// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserIPSWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserIPSWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserIPSWhitelistResponseBody self = new ModifyUserIPSWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserIPSWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
