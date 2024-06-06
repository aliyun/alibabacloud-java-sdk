// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class RecalculateCarbonEmissionResponseBody extends TeaModel {
    /**
     * <p>The returned data. A value of true indicates that the request is successful. A value of false indicates that the request fails.</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RecalculateCarbonEmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecalculateCarbonEmissionResponseBody self = new RecalculateCarbonEmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RecalculateCarbonEmissionResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RecalculateCarbonEmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
