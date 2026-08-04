// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckSaasServiceVersionResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the service can be upgraded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanUpgrade")
    public Boolean canUpgrade;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agdb-xxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static CheckSaasServiceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSaasServiceVersionResponseBody self = new CheckSaasServiceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSaasServiceVersionResponseBody setCanUpgrade(Boolean canUpgrade) {
        this.canUpgrade = canUpgrade;
        return this;
    }
    public Boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public CheckSaasServiceVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckSaasServiceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSaasServiceVersionResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
