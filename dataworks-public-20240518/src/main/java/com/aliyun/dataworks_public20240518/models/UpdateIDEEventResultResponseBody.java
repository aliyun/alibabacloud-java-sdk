// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
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
