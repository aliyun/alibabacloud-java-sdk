// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayLoadBalancersRequest extends TeaModel {
    /**
     * <p>Specifies whether to return all instances in the optional list mode. This parameter affects the pagination and filtering strategies.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The exact load balancer instance ID used to query details by ID in the optional list mode.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-xxxx</p>
     */
    @NameInMap("loadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The network type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("network")
    public String network;

    /**
     * <p>Specifies whether to return the list of load balancers associated with the gateway. If set to true, the associated load balancers are returned based on database relationships. We recommend setting this parameter to true to retrieve the associated load balancers. If set to false or left empty, the optional list mode is used to call the SLB or NLB API and filter bindable instances. In the default mode where related is false, calling the SLB or NLB API may return a 500 error due to backend data issues in common scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("related")
    public Boolean related;

    /**
     * <p>The load balancer type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>NLB</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The VPC filter used to filter instances within the specified VPC in the optional list mode. This parameter is required when type is set to NLB and related is not set to true. Otherwise, the API returns a 500 error.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static ListGatewayLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayLoadBalancersRequest self = new ListGatewayLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayLoadBalancersRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListGatewayLoadBalancersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public ListGatewayLoadBalancersRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public ListGatewayLoadBalancersRequest setRelated(Boolean related) {
        this.related = related;
        return this;
    }
    public Boolean getRelated() {
        return this.related;
    }

    public ListGatewayLoadBalancersRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListGatewayLoadBalancersRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
