// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebIpSetSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebIpSetSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebIpSetSwitchResponseBody self = new ModifyWebIpSetSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebIpSetSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
