// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySaasServiceDeletionProtectionResponseBody extends TeaModel {
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
     * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agdb-xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static ModifySaasServiceDeletionProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySaasServiceDeletionProtectionResponseBody self = new ModifySaasServiceDeletionProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySaasServiceDeletionProtectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySaasServiceDeletionProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySaasServiceDeletionProtectionResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
