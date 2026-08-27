// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayMaintenancePeriodResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8FA817D1-CCB0-5776-A604-8FC5DE6DACB9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateGatewayMaintenancePeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayMaintenancePeriodResponseBody self = new UpdateGatewayMaintenancePeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayMaintenancePeriodResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGatewayMaintenancePeriodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayMaintenancePeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
