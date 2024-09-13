// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPSListenerAttributeRequest extends TeaModel {
    /**
     * <p>The listening port that you want to query. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the ELB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5qoxu2rsr0ytanpn4r3i****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DescribeLoadBalancerHTTPSListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPSListenerAttributeRequest self = new DescribeLoadBalancerHTTPSListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
