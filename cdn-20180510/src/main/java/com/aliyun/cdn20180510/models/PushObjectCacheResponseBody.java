// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheResponseBody extends TeaModel {
    @NameInMap("PushTaskId")
    public String pushTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static PushObjectCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushObjectCacheResponseBody self = new PushObjectCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public PushObjectCacheResponseBody setPushTaskId(String pushTaskId) {
        this.pushTaskId = pushTaskId;
        return this;
    }
    public String getPushTaskId() {
        return this.pushTaskId;
    }

    public PushObjectCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
