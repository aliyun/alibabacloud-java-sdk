// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the refresh task. Multiple IDs are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>95248880</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E5BD4B50-7A02-493A-AE0B-97B9024B4135</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshDcdnObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCachesResponseBody self = new RefreshDcdnObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshDcdnObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
