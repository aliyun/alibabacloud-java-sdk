// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ReleaseValueAddedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseValueAddedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseValueAddedResponseBody self = new ReleaseValueAddedResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseValueAddedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
