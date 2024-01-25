// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryPriceRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeGroupSpecs")
    public String nodeGroupSpecs;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("RegionId")
    public String regionId;

    public static QueryPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceRequest self = new QueryPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryPriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryPriceRequest setNodeGroupSpecs(String nodeGroupSpecs) {
        this.nodeGroupSpecs = nodeGroupSpecs;
        return this;
    }
    public String getNodeGroupSpecs() {
        return this.nodeGroupSpecs;
    }

    public QueryPriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
