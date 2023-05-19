// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchDeleteCdnDomainConfigResponseBody extends TeaModel {
    /**
     * <p>Deletes configurations of multiple accelerated domain names at a time.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteCdnDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteCdnDomainConfigResponseBody self = new BatchDeleteCdnDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteCdnDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
