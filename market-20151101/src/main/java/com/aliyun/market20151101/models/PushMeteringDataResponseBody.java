// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushMeteringDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The success status identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PushMeteringDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataResponseBody self = new PushMeteringDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMeteringDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
