// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessAndAbolishApisRequest extends TeaModel {
    /**
     * <p>The ID of the ECS or SLB instance in the VPC.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether batch work is required.</p>
     */
    @NameInMap("NeedBatchWork")
    public Boolean needBatchWork;

    /**
     * <p>The service port.</p>
     */
    @NameInMap("Port")
    public Integer port;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the VPC to be operated.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static RemoveVpcAccessAndAbolishApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessAndAbolishApisRequest self = new RemoveVpcAccessAndAbolishApisRequest();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessAndAbolishApisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveVpcAccessAndAbolishApisRequest setNeedBatchWork(Boolean needBatchWork) {
        this.needBatchWork = needBatchWork;
        return this;
    }
    public Boolean getNeedBatchWork() {
        return this.needBatchWork;
    }

    public RemoveVpcAccessAndAbolishApisRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public RemoveVpcAccessAndAbolishApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveVpcAccessAndAbolishApisRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
