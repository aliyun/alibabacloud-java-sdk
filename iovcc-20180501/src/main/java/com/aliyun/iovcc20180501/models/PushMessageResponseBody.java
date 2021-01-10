// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Mid")
    public Long mid;

    public static PushMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMessageResponseBody self = new PushMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMessageResponseBody setMid(Long mid) {
        this.mid = mid;
        return this;
    }
    public Long getMid() {
        return this.mid;
    }

}
