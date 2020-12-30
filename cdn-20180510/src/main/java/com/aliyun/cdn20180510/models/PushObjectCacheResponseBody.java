// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PushTaskId")
    public String pushTaskId;

    public static PushObjectCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushObjectCacheResponseBody self = new PushObjectCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public PushObjectCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushObjectCacheResponseBody setPushTaskId(String pushTaskId) {
        this.pushTaskId = pushTaskId;
        return this;
    }
    public String getPushTaskId() {
        return this.pushTaskId;
    }

}
