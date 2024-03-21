// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the refresh task. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshErObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshErObjectCachesResponseBody self = new RefreshErObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshErObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshErObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
