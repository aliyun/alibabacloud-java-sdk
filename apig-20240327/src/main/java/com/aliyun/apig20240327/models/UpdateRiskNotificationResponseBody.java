// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateRiskNotificationResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>01A00D7A-AA00-5BC0-9835-C7B15A3FE73A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateRiskNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskNotificationResponseBody self = new UpdateRiskNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRiskNotificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRiskNotificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRiskNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
