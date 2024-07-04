// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateMediaPublishStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaPublishStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaPublishStateResponseBody self = new UpdateMediaPublishStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaPublishStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
