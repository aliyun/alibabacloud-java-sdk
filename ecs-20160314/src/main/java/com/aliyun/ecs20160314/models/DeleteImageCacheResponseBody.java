// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteImageCacheResponseBody extends TeaModel {
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
