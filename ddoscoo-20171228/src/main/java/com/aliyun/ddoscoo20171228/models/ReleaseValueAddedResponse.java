// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ReleaseValueAddedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseValueAddedResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseValueAddedResponse self = new ReleaseValueAddedResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseValueAddedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
