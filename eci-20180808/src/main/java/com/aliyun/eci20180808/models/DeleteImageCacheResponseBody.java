// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteImageCacheResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89945DD3-9072-47D0-A218-354284CFC7A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageCacheResponseBody self = new DeleteImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
