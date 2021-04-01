// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ReleaseInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceResponse self = new ReleaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
