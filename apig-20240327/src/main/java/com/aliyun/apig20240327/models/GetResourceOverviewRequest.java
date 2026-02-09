// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetResourceOverviewRequest extends TeaModel {
    /**
     * <p>The gateway type.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    public static GetResourceOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOverviewRequest self = new GetResourceOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceOverviewRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

}
