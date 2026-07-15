// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListZonesRequest extends TeaModel {
    /**
     * <p>The target gateway edition for querying zones. Valid values:</p>
     * <ul>
     * <li>Professional: standard gateway. This is the default value.</li>
     * <li>ServerlessV2: API multi-tenant Serverless V2.</li>
     * </ul>
     * <p>If this parameter is not specified, Professional is used.</p>
     * 
     * <strong>example:</strong>
     * <p>ServerlessV2</p>
     */
    @NameInMap("gatewayEdition")
    public String gatewayEdition;

    public static ListZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListZonesRequest self = new ListZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListZonesRequest setGatewayEdition(String gatewayEdition) {
        this.gatewayEdition = gatewayEdition;
        return this;
    }
    public String getGatewayEdition() {
        return this.gatewayEdition;
    }

}
