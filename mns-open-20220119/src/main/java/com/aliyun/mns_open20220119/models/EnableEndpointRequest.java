// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class EnableEndpointRequest extends TeaModel {
    /**
     * <p>The type of the endpoint. Valid value:</p>
     * <ul>
     * <li><strong>public</strong>: indicates public endpoint. (Only the public is supported.)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    public static EnableEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableEndpointRequest self = new EnableEndpointRequest();
        return TeaModel.build(map, self);
    }

    public EnableEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

}
