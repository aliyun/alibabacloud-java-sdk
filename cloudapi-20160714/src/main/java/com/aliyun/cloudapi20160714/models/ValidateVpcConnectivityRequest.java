// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ValidateVpcConnectivityRequest extends TeaModel {
    /**
     * <p>The ID of the API Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-hz-72bc18******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the VPC access authorization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5f1b3216f9********e2c1297b6741dc</p>
     */
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
