// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachCenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AttachCenResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachCenResponse self = new AttachCenResponse();
        return TeaModel.build(map, self);
    }

    public AttachCenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
