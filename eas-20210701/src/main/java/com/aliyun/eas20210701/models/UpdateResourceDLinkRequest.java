// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceDLinkRequest extends TeaModel {
    /**
     * <p>The CIDR blocks of the clients that you want to connect to. After this parameter is specified, the CIDR blocks are added to the back-to-origin route of the server. Either this parameter or the VSwitchIdList parameter can be used to determine CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>72.16.0.0/16</p>
     */
    @NameInMap("DestinationCIDRs")
    public String destinationCIDRs;

    /**
     * <p>The ID of the security group to which the Elastic Compute Service (ECS) instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp149cedsfx2rfspd2d</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the peer primary vSwitch. After this parameter is specified, an elastic network interface (ENI) is created in the VSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf66uio7md****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The vSwitches of the clients that you want to connect to. After this parameter is specified, the CIDR blocks of these vSwitches are added to the back-to-origin route of the server.</p>
     */
    @NameInMap("VSwitchIdList")
    public java.util.List<String> vSwitchIdList;

    public static UpdateResourceDLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceDLinkRequest self = new UpdateResourceDLinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceDLinkRequest setDestinationCIDRs(String destinationCIDRs) {
        this.destinationCIDRs = destinationCIDRs;
        return this;
    }
    public String getDestinationCIDRs() {
        return this.destinationCIDRs;
    }

    public UpdateResourceDLinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UpdateResourceDLinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public UpdateResourceDLinkRequest setVSwitchIdList(java.util.List<String> vSwitchIdList) {
        this.vSwitchIdList = vSwitchIdList;
        return this;
    }
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

}
