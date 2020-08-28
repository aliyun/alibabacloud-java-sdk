// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelSimulatedSystemEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelSimulatedSystemEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSimulatedSystemEventsResponse self = new CancelSimulatedSystemEventsResponse();
        return TeaModel.build(map, self);
    }

}
