// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateImageCacheResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0E234675-3465-4CC3-9D0F-9A864BC391DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageCacheResponseBody self = new UpdateImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
