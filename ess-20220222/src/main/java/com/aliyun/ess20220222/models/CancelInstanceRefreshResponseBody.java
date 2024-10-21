// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CancelInstanceRefreshResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelInstanceRefreshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelInstanceRefreshResponseBody self = new CancelInstanceRefreshResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelInstanceRefreshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
