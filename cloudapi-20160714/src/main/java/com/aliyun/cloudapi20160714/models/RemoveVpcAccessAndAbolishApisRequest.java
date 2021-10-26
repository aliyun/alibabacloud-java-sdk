// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessAndAbolishApisRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("NeedBatchWork")
    public Boolean needBatchWork;

    public static RemoveVpcAccessAndAbolishApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessAndAbolishApisRequest self = new RemoveVpcAccessAndAbolishApisRequest();
        return TeaModel.build(map, self);
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

    public RemoveVpcAccessAndAbolishApisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveVpcAccessAndAbolishApisRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public RemoveVpcAccessAndAbolishApisRequest setNeedBatchWork(Boolean needBatchWork) {
        this.needBatchWork = needBatchWork;
        return this;
    }
    public Boolean getNeedBatchWork() {
        return this.needBatchWork;
    }

}
