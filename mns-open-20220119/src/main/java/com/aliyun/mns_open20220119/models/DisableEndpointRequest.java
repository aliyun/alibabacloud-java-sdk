// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class DisableEndpointRequest extends TeaModel {
    /**
     * <p>The type of the endpoint. Value:</p>
     * <ul>
     * <li><strong>public</strong>: indicates an public endpoint. (Only the public endpoint is supported.)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    public static DisableEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableEndpointRequest self = new DisableEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DisableEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

}
