// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AcceptInquiredSystemEventResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AcceptInquiredSystemEventResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptInquiredSystemEventResponse self = new AcceptInquiredSystemEventResponse();
        return TeaModel.build(map, self);
    }

}
