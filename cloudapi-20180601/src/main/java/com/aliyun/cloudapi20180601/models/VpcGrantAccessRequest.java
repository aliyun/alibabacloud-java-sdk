// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class VpcGrantAccessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstancePort")
    public String instancePort;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Token")
    public String token;

    @NameInMap("VpcId")
    public String vpcId;

    public static VpcGrantAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        VpcGrantAccessRequest self = new VpcGrantAccessRequest();
        return TeaModel.build(map, self);
    }

    public VpcGrantAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VpcGrantAccessRequest setInstancePort(String instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public String getInstancePort() {
        return this.instancePort;
    }

    public VpcGrantAccessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VpcGrantAccessRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public VpcGrantAccessRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public VpcGrantAccessRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
