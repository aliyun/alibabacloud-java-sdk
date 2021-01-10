// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AttachSmsSignResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachSmsSignResponseBody self = new AttachSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
