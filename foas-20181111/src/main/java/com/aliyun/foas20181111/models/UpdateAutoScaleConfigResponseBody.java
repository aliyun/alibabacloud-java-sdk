// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateAutoScaleConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAutoScaleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScaleConfigResponseBody self = new UpdateAutoScaleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScaleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
