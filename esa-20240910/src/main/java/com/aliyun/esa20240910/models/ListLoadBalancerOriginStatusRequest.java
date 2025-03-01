// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancerOriginStatusRequest extends TeaModel {
    /**
     * <p>Load balancer ID. When querying multiple load balancers, separate the IDs with commas. A maximum of 100 load balancer IDs can be passed at once. Load balancer IDs can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2868897.html">ListLoadBalancers</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99874066052****,100892832360****</p>
     */
    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

    /**
     * <p>Source address pool type. Various source address pools are configured under the load balancer, including default pools, fallback pools, and primary region pools. Only the status of origins in the default pool affects the status of the load balancer itself. Passing <code>default_pool</code> means only querying the status of origins in the default source address pool under the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>default_pool</p>
     */
    @NameInMap("PoolType")
    public String poolType;

    /**
     * <p>Site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1159101787****</p>
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
