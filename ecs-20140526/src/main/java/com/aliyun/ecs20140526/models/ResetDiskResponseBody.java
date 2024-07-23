// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3CD6886-D8D0-4FEE-B93E-1B732396****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskResponseBody self = new ResetDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
