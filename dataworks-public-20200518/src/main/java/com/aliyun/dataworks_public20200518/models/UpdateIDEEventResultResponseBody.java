// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIDEEventResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIDEEventResultResponseBody self = new UpdateIDEEventResultResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIDEEventResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
