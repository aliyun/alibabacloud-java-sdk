// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckSaasServiceVersionRequest extends TeaModel {
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
     * <p>agdb-xxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static CheckSaasServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSaasServiceVersionRequest self = new CheckSaasServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public CheckSaasServiceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckSaasServiceVersionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
