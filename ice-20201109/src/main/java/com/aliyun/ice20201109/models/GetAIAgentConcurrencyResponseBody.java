// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAIAgentConcurrencyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39</p>
     */
    @NameInMap("ActiveCount")
    public Integer activeCount;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAIAgentConcurrencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIAgentConcurrencyResponseBody self = new GetAIAgentConcurrencyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIAgentConcurrencyResponseBody setActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
        return this;
    }
    public Integer getActiveCount() {
        return this.activeCount;
    }

    public GetAIAgentConcurrencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
