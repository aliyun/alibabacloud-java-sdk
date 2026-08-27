// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayAuthorizableSecurityGroupsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c4a21b3560fad4ec299f3e63f4***</p>
     */
    @NameInMap("csClusterId")
    public String csClusterId;

    public static ListGatewayAuthorizableSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthorizableSecurityGroupsRequest self = new ListGatewayAuthorizableSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthorizableSecurityGroupsRequest setCsClusterId(String csClusterId) {
        this.csClusterId = csClusterId;
        return this;
    }
    public String getCsClusterId() {
        return this.csClusterId;
    }

}
