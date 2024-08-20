// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the refresh task. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>95248880</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
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
