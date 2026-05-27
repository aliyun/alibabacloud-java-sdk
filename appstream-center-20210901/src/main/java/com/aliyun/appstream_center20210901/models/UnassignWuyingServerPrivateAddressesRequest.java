// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UnassignWuyingServerPrivateAddressesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10.0.0.2&quot;,&quot;10.0.0.3&quot;]</p>
     */
    @NameInMap("PrivateIpAddresses")
    public java.util.List<String> privateIpAddresses;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-bp1234567890abcde</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static UnassignWuyingServerPrivateAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignWuyingServerPrivateAddressesRequest self = new UnassignWuyingServerPrivateAddressesRequest();
        return TeaModel.build(map, self);
    }

    public UnassignWuyingServerPrivateAddressesRequest setPrivateIpAddresses(java.util.List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }
    public java.util.List<String> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public UnassignWuyingServerPrivateAddressesRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
