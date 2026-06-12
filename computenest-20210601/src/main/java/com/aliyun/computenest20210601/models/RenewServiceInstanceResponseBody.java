// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RenewServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BB58FE53-ED8F-5D12-9746-CD3A5F463D95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewServiceInstanceResponseBody self = new RenewServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
