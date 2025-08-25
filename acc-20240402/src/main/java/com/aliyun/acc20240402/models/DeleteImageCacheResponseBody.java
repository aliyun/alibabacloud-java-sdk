// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class DeleteImageCacheResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0E234675-3465-4CC3-9D0F-9A864BC*****</p>
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
