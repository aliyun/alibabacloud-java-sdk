// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateRouteRequest extends TeaModel {
    /**
     * <p>The CIDR blocks of the destination-based route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("DestinationCidr")
    public String destinationCidr;

    /**
     * <p>The network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("NetworkId")
    public Long networkId;

    public static CreateRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteRequest self = new CreateRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteRequest setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
        return this;
    }
    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    public CreateRouteRequest setNetworkId(Long networkId) {
        this.networkId = networkId;
        return this;
    }
    public Long getNetworkId() {
        return this.networkId;
    }

}
