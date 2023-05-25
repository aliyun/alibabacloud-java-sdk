// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetVpcAccessRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcTargetHostName")
    public String vpcTargetHostName;

    public static SetVpcAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVpcAccessRequest self = new SetVpcAccessRequest();
        return TeaModel.build(map, self);
    }

    public SetVpcAccessRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetVpcAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetVpcAccessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SetVpcAccessRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public SetVpcAccessRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetVpcAccessRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public SetVpcAccessRequest setVpcTargetHostName(String vpcTargetHostName) {
        this.vpcTargetHostName = vpcTargetHostName;
        return this;
    }
    public String getVpcTargetHostName() {
        return this.vpcTargetHostName;
    }

}
