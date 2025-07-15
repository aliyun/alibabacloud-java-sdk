// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>324AEFFF-308C-4DA7-8CD3-01B277B98F28</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopLiveDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLiveDomainResponseBody self = new StopLiveDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLiveDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
