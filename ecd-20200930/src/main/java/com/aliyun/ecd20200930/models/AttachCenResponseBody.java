// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachCenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachCenResponseBody self = new AttachCenResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
