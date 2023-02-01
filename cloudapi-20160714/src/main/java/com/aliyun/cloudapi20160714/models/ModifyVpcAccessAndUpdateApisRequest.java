// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyVpcAccessAndUpdateApisRequest extends TeaModel {
    /**
     * <p>The ID of the new instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unique custom name for the authorization.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to update the associated API.</p>
     */
    @NameInMap("NeedBatchWork")
    public Boolean needBatchWork;

    /**
     * <p>The port number to be modified.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>Specifies whether to refresh the VPC authorization.</p>
     */
    @NameInMap("Refresh")
    public Boolean refresh;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The password.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the new VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The authorized backend host.</p>
     */
    @NameInMap("VpcTargetHostName")
    public String vpcTargetHostName;

    public static ModifyVpcAccessAndUpdateApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAccessAndUpdateApisRequest self = new ModifyVpcAccessAndUpdateApisRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAccessAndUpdateApisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyVpcAccessAndUpdateApisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpcAccessAndUpdateApisRequest setNeedBatchWork(Boolean needBatchWork) {
        this.needBatchWork = needBatchWork;
        return this;
    }
    public Boolean getNeedBatchWork() {
        return this.needBatchWork;
    }

    public ModifyVpcAccessAndUpdateApisRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyVpcAccessAndUpdateApisRequest setRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }
    public Boolean getRefresh() {
        return this.refresh;
    }

    public ModifyVpcAccessAndUpdateApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyVpcAccessAndUpdateApisRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ModifyVpcAccessAndUpdateApisRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ModifyVpcAccessAndUpdateApisRequest setVpcTargetHostName(String vpcTargetHostName) {
        this.vpcTargetHostName = vpcTargetHostName;
        return this;
    }
    public String getVpcTargetHostName() {
        return this.vpcTargetHostName;
    }

}
