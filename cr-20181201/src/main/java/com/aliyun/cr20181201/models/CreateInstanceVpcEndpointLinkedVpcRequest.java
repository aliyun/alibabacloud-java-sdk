// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceVpcEndpointLinkedVpcRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically create Alibaba Cloud DNS PrivateZone records. Valid values:</p>
     * <blockquote>
     * <p> If you enable automatic creation of PrivateZone records, a PrivateZone record is automatically created when you associate a VPC with the instance.</p>
     * </blockquote>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCreateDNSRecordInPvzt")
    public Boolean enableCreateDNSRecordInPvzt;

    /**
     * <p>The instance ID.</p>
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
     * <li><code>Registry</code>: image repositories.</li>
     * <li><code>Chart</code>: Helm charts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Registry</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6pa68zxnnlc48dd****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the vSwitch that is associated with the specified VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6u0kn8x2gbzxfn2****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    public static CreateInstanceVpcEndpointLinkedVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceVpcEndpointLinkedVpcRequest self = new CreateInstanceVpcEndpointLinkedVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceVpcEndpointLinkedVpcRequest setEnableCreateDNSRecordInPvzt(Boolean enableCreateDNSRecordInPvzt) {
        this.enableCreateDNSRecordInPvzt = enableCreateDNSRecordInPvzt;
        return this;
    }
    public Boolean getEnableCreateDNSRecordInPvzt() {
        return this.enableCreateDNSRecordInPvzt;
    }

    public CreateInstanceVpcEndpointLinkedVpcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceVpcEndpointLinkedVpcRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateInstanceVpcEndpointLinkedVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceVpcEndpointLinkedVpcRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
