// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayLoadBalancersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <strong>example:</strong>
     * <p>lb-xxxx</p>
     */
    @NameInMap("loadBalancerId")
    public String loadBalancerId;

    /**
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("network")
    public String network;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("related")
    public Boolean related;

    /**
     * <strong>example:</strong>
     * <p>NLB</p>
     */
    @NameInMap("type")
    public String type;

    /**
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
