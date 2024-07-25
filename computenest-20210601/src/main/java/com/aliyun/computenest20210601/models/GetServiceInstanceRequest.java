// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceInstanceRequest extends TeaModel {
    /**
     * <p>The MarketInstance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>704***59</p>
     */
    @NameInMap("MarketInstanceId")
    public String marketInstanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service instance ID.</p>
     * <blockquote>
     * <p> You must specify either <code>ServiceInstanceId</code> or <code>MarketInstanceId</code>. Otherwise, the operation fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static GetServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceRequest self = new GetServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceRequest setMarketInstanceId(String marketInstanceId) {
        this.marketInstanceId = marketInstanceId;
        return this;
    }
    public String getMarketInstanceId() {
        return this.marketInstanceId;
    }

    public GetServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
