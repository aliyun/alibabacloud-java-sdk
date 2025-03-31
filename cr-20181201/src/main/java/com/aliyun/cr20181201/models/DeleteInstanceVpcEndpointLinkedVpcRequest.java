// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceVpcEndpointLinkedVpcRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the module that you want to access. Valid values:</p>
     * <ul>
     * <li><code>Registry</code>: the image repository.</li>
     * <li><code>Chart</code>: a Helm chart.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Chart</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6pa68zxnnlc48dd****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6pa68zxnnlc48dd****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

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

    public DeleteInstanceVpcEndpointLinkedVpcRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
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

}
