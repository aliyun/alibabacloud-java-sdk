// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteMqttRootTopicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMqttRootTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqttRootTopicResponseBody self = new DeleteMqttRootTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMqttRootTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
