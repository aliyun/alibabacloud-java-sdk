// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ValidateServiceInstanceNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ValidateServiceInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateServiceInstanceNameResponseBody self = new ValidateServiceInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateServiceInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
