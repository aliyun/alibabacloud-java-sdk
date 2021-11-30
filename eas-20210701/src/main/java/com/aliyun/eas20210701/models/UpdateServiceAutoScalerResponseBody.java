// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceAutoScalerResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceAutoScalerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceAutoScalerResponseBody self = new UpdateServiceAutoScalerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceAutoScalerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServiceAutoScalerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
