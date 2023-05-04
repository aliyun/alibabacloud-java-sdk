// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStartCdnDomainResponseBody extends TeaModel {
    /**
     * <p>1.0.0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStartCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStartCdnDomainResponseBody self = new BatchStartCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStartCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
