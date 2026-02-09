// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayNameRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dev-itemcenter-router</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateGatewayNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayNameRequest self = new UpdateGatewayNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
