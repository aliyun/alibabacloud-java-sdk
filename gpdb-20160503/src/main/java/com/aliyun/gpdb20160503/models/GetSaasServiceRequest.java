// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSaasServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agdb-xxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static GetSaasServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSaasServiceRequest self = new GetSaasServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetSaasServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSaasServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
