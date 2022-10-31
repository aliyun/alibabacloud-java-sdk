// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterTimedEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCasterTimedEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCasterTimedEventResponseBody self = new SetCasterTimedEventResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCasterTimedEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
