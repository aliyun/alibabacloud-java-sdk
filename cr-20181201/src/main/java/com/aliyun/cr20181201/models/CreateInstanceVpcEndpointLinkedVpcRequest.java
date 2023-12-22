// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceVpcEndpointLinkedVpcRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically create Alibaba Cloud DNS PrivateZone records. Valid values:</p>
     * <br>
     * <p>>  If you enable automatic creation of PrivateZone records, a PrivateZone record is automatically created when you associate a VPC with the instance.</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("EnableCreateDNSRecordInPvzt")
    public Boolean enableCreateDNSRecordInPvzt;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the module that you want to access. Valid values:</p>
     * <br>
     * <p>*   `Registry`: image repositories.</p>
     * <p>*   `Chart`: Helm charts.</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The VPC ID.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the vSwitch that is associated with the specified VPC.</p>
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
