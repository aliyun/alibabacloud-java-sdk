// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishMqttMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Mid")
    public String mid;

    public static PublishMqttMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishMqttMessageResponseBody self = new PublishMqttMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishMqttMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishMqttMessageResponseBody setMid(String mid) {
        this.mid = mid;
        return this;
    }
    public String getMid() {
        return this.mid;
    }

}
