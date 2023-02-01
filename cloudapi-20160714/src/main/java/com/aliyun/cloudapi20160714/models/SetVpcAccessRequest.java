// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetVpcAccessRequest extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of an ECS or SLB instance in the VPC.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unique custom name for authorization.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port number that corresponds to the instance.</p>
     */
    @NameInMap("Port")
    public Integer port;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the VPC. The VPC must be an available one that belongs to the same account as the API.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The host of the backend service.</p>
     */
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
