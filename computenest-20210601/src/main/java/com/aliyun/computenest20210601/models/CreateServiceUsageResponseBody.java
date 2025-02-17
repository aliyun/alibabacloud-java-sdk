// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceUsageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceUsageResponseBody self = new CreateServiceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
