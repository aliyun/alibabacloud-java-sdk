// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateSaasServiceVersionResponseBody extends TeaModel {
    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>drama-123456</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static UpdateSaasServiceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSaasServiceVersionResponseBody self = new UpdateSaasServiceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSaasServiceVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSaasServiceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSaasServiceVersionResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
