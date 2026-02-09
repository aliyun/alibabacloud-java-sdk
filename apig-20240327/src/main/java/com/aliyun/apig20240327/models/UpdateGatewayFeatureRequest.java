// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayFeatureRequest extends TeaModel {
    /**
     * <p>The parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;true&quot;</p>
     */
    @NameInMap("value")
    public String value;

    public static UpdateGatewayFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayFeatureRequest self = new UpdateGatewayFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayFeatureRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
