// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateRouteRequest extends TeaModel {
    /**
     * <p>The destination CIDR block of the route that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("DestinationCidr")
    public String destinationCidr;

    /**
     * <p>The route ID of the network resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Id")
    public Long id;

    public static UpdateRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteRequest self = new UpdateRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRouteRequest setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
        return this;
    }
    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    public UpdateRouteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
