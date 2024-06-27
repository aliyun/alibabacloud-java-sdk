// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DisableDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53EA07B7-FC2A-521B-AB7C-27**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDBResourceGroupResponseBody self = new DisableDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
