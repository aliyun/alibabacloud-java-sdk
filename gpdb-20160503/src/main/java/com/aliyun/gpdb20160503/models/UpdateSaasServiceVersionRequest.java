// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateSaasServiceVersionRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agdb-xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static UpdateSaasServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSaasServiceVersionRequest self = new UpdateSaasServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSaasServiceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSaasServiceVersionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
