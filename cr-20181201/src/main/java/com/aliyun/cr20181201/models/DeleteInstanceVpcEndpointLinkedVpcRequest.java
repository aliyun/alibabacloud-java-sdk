// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceVpcEndpointLinkedVpcRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("ModuleName")
    public String moduleName;

    public static DeleteInstanceVpcEndpointLinkedVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceVpcEndpointLinkedVpcRequest self = new DeleteInstanceVpcEndpointLinkedVpcRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceVpcEndpointLinkedVpcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceVpcEndpointLinkedVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DeleteInstanceVpcEndpointLinkedVpcRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DeleteInstanceVpcEndpointLinkedVpcRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
