// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoReleaseTimeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAutoReleaseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoReleaseTimeResponseBody self = new ModifyInstanceAutoReleaseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoReleaseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
