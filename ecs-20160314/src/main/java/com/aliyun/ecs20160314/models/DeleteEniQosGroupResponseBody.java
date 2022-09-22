// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteEniQosGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEniQosGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEniQosGroupResponseBody self = new DeleteEniQosGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEniQosGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
