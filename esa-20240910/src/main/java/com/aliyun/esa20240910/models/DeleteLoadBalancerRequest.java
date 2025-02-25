// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerRequest extends TeaModel {
    /**
     * <p>The ID of the load balancer, used to uniquely identify the load balancer to be queried. This ID is returned directly upon creation of the load balancer and can also be obtained through the <a href="~~ListLoadBalancers~~">ListLoadBalancers</a> interface for querying all load balancers under a site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99867648760****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the site, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1159101787****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerRequest self = new DeleteLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLoadBalancerRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
