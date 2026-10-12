// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayLoadBalancersRequest extends TeaModel {
    /**
     * <p>Specifies whether to return all instances in the selectable list mode. This parameter affects pagination and filtering behavior.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The load balancer instance ID. Specify this parameter to query details of a specific load balancer in the selectable list mode.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-xxxx</p>
     */
    @NameInMap("loadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The network type used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("network")
    public String network;

    /**
     * <p>The mode switch. Valid values:</p>
     * <ul>
     * <li>true: Returns the list of load balancers that are already associated with the gateway by reading database relationships.</li>
     * <li>false (default): Returns the selectable list by calling SLB or NLB OpenAPI to filter bindable instances.</li>
     * </ul>
     * <p>Use related=true to retrieve the list of associated load balancers. The default mode (related=false) calls SLB or NLB OpenAPI to filter bindable instances, which may return a 500 error in common scenarios due to backend data issues.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("related")
    public Boolean related;

    /**
     * <p>The load balancer type used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>NLB</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The VPC ID used to filter instances within the specified VPC in the selectable list mode. This parameter is required when type is set to NLB and related is not set to true. Otherwise, the API returns a 500 error.</p>
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
