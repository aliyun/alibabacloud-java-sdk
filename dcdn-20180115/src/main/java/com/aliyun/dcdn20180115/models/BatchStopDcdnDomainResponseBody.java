// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchStopDcdnDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStopDcdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopDcdnDomainResponseBody self = new BatchStopDcdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopDcdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
