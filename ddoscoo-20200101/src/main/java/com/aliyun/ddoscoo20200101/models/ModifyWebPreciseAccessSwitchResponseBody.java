// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebPreciseAccessSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessSwitchResponseBody self = new ModifyWebPreciseAccessSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
