// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateMountTargetRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required if the file system is a General-purpose NAS or Extreme NAS file system.</p>
     * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (the default permission group for VPCs).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>Specifies whether to check for existing mount targets. Only CPFS file systems are supported.</p>
     * <p>A dry run checks parameter validity and inventory without actually creating a mount target or incurring fees.</p>
     * <ul>
     * <li>true: sends a dry run request without creating a mount target. The check items include required parameters, request format, business limits, and CPFS inventory. If the check fails, the corresponding error is returned. If the check passes, <code>200 HttpCode</code> is returned, but <code>MountTargetDomain</code> is empty.</li>
     * <li>false (default): sends a normal request. After the check passes, a mount target is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to create an IPv6 mount target.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: creates an IPv6 mount target.</li>
     * <li>false (default): does not create an IPv6 mount target.</li>
     * </ul>
     * <blockquote>
     * <p>IPv6 is supported only by Extreme NAS file systems in all regions in the Chinese mainland. The file system must have IPv6 enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>General-purpose NAS: 31a8e4\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>Extreme NAS: The ID must start with <code>extreme-</code>, such as extreme-0015\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>Cloud Parallel File Storage (CPFS): The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174494****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The network type of the mount target. Set the value to <strong>Vpc</strong>, which indicates a virtual private cloud (VPC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required and valid only when the network type is VPC.
     * For example:
     * If NetworkType is set to VPC, VSwitchId is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zevmwkwyztjuoffg****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required and valid only when the network type is VPC.
     * For example:
     * If NetworkType is set to VPC, VpcId is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zesj9afh3y518k9o****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMountTargetRequest self = new CreateMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateMountTargetRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateMountTargetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateMountTargetRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public CreateMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateMountTargetRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateMountTargetRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateMountTargetRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateMountTargetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
