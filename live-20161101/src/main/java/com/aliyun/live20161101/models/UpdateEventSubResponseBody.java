// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateEventSubResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AE050E24-BE9B-1E79-BB30-7EA0BBAE7F08</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEventSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSubResponseBody self = new UpdateEventSubResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEventSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
