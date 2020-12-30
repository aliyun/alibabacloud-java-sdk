// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CloseDomainSlsConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CloseDomainSlsConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseDomainSlsConfigResponseBody self = new CloseDomainSlsConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseDomainSlsConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
