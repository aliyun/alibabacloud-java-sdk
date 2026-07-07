// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetLoadBalancerRequest extends TeaModel {
    /**
     * <p>The load balancer ID, which uniquely identifies the load balancer to query. This ID is returned when the load balancer is created. You can also call the <a href="https://help.aliyun.com/document_detail/2868897.html">ListLoadBalancers</a> operation to obtain all load balancers under a site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99867648760****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
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
