// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchStartDcdnDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStartDcdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStartDcdnDomainResponseBody self = new BatchStartDcdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStartDcdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
