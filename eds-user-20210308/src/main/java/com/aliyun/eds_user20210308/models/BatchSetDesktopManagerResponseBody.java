// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class BatchSetDesktopManagerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>868B8926-2E7A-5BE7-9897-E811E994****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetDesktopManagerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDesktopManagerResponseBody self = new BatchSetDesktopManagerResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetDesktopManagerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
