// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyTrafficControlResponseBody extends TeaModel {
    /**
     * <p>Modifies the settings of a custom throttling policy.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTrafficControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrafficControlResponseBody self = new ModifyTrafficControlResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTrafficControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
