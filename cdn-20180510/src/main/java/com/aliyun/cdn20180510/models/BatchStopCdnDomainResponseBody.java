// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStopCdnDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>324AEFFF-308C-4DA7-8CD3-01B277B98F28</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStopCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopCdnDomainResponseBody self = new BatchStopCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
