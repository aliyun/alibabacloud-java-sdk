// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceResponse self = new StopInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
