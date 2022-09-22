// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateImageCacheResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheResponseBody self = new CreateImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
