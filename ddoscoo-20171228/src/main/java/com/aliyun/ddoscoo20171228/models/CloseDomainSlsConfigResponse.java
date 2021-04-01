// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CloseDomainSlsConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CloseDomainSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDomainSlsConfigResponse self = new CloseDomainSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public CloseDomainSlsConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
