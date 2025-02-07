// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetEndpointAttributeRequest extends TeaModel {
    /**
     * <p>The type of the endpoint. Valid value:</p>
     * <ul>
     * <li><strong>public</strong>: indicates a public endpoint. (Only public endpoint is supported.)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    public static GetEndpointAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointAttributeRequest self = new GetEndpointAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetEndpointAttributeRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

}
