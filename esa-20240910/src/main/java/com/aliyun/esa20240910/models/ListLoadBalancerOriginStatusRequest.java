// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancerOriginStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

    @NameInMap("PoolType")
    public String poolType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ListLoadBalancerOriginStatus</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListLoadBalancerOriginStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancerOriginStatusRequest self = new ListLoadBalancerOriginStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancerOriginStatusRequest setLoadBalancerIds(String loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public ListLoadBalancerOriginStatusRequest setPoolType(String poolType) {
        this.poolType = poolType;
        return this;
    }
    public String getPoolType() {
        return this.poolType;
    }

    public ListLoadBalancerOriginStatusRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
