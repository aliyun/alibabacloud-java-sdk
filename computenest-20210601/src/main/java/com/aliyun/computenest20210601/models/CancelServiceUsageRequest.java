// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CancelServiceUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedDelete")
    public Boolean needDelete;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-d6fc5f949a9246xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static CancelServiceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelServiceUsageRequest self = new CancelServiceUsageRequest();
        return TeaModel.build(map, self);
    }

    public CancelServiceUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelServiceUsageRequest setNeedDelete(Boolean needDelete) {
        this.needDelete = needDelete;
        return this;
    }
    public Boolean getNeedDelete() {
        return this.needDelete;
    }

    public CancelServiceUsageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
