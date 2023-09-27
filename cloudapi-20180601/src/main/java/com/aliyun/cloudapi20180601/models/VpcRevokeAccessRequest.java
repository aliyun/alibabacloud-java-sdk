// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class VpcRevokeAccessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstancePort")
    public String instancePort;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Token")
    public String token;

    @NameInMap("VpcId")
    public String vpcId;

    public static VpcRevokeAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        VpcRevokeAccessRequest self = new VpcRevokeAccessRequest();
        return TeaModel.build(map, self);
    }

    public VpcRevokeAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VpcRevokeAccessRequest setInstancePort(String instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public String getInstancePort() {
        return this.instancePort;
    }

    public VpcRevokeAccessRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public VpcRevokeAccessRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public VpcRevokeAccessRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
