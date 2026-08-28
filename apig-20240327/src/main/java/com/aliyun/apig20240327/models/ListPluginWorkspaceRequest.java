// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    public static ListPluginWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginWorkspaceRequest self = new ListPluginWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginWorkspaceRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

}
