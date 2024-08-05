// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyVpcAccessAndUpdateApisRequest extends TeaModel {
    /**
     * <p>The ID of the new instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6bzcg1pr4oh5jjmxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the VPC authorization.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The name of a VPC authorization cannot be changed. You cannot use this parameter to change the name of a VPC authorization.</p>
     * </li>
     * <li><p>You must set this parameter to the name of the current VPC authorization.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VpcName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to update the associated API.</p>
     * <p>**</p>
     * <p><strong>Warning:</strong> If you want to update the VPC authorization of a published API, you must set this parameter to true. Otherwise, the update will not be synchronized to the backend service of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedBatchWork")
    public Boolean needBatchWork;

    /**
     * <p>The new port number.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>Specifies whether to update the VPC authorization.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If the ID of the instance in your VPC is changed but the IP address of the instance remains unchanged, you can set this parameter to true to update the VPC authorization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Refresh")
    public Boolean refresh;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The token of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>c20d86c4-1eb3-4d0b-afe9-c586df1e2136</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the new VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5e7jqfppv5wbvmdw5pg2</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The hostname of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.hu***ng.com</p>
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
