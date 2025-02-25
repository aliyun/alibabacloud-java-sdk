// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetLoadBalancerRequest extends TeaModel {
    /**
     * <p>The ID of the load balancer, used to uniquely identify the load balancer to be queried. This ID is returned directly when the load balancer is created, or it can be obtained through the <a href="~~ListLoadBalancers~~">ListLoadBalancers</a> interface for querying all load balancers under a site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99867648760****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1159101787****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerRequest self = new GetLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetLoadBalancerRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
