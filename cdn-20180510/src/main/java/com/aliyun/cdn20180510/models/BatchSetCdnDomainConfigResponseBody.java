// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetCdnDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainConfigResponseBody self = new BatchSetCdnDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
