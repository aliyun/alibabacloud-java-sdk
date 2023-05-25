// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ValidateVpcConnectivityRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VpcAccessId")
    public String vpcAccessId;

    public static ValidateVpcConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateVpcConnectivityRequest self = new ValidateVpcConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public ValidateVpcConnectivityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ValidateVpcConnectivityRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ValidateVpcConnectivityRequest setVpcAccessId(String vpcAccessId) {
        this.vpcAccessId = vpcAccessId;
        return this;
    }
    public String getVpcAccessId() {
        return this.vpcAccessId;
    }

}
