// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateMountTargetRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required when the target file system is a General-purpose NAS file system or an Extreme NAS file system.</p>
     * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (the default permission group for VPCs).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>Specifies whether to perform a dry run to check for existing mount targets. Only CPFS file systems are supported.</p>
     * <p>A dry run checks the validity of parameters and inventory without actually creating a mount target or incurring fees.</p>
     * <ul>
     * <li>true: Perform a dry run. No mount target is created. The system checks whether required parameters are specified, the request format, service limits, and CPFS inventory. If the dry run fails, the corresponding error is returned. If the dry run succeeds, the HTTP status code <code>200</code> is returned, but <code>MountTargetDomain</code> is empty.</li>
     * <li>false: Perform a standard request. If the check succeeds, a mount target is directly created. This is the default value.</li>
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
     * <li>true: Create an IPv6 mount target.</li>
     * <li>false: Do not create an IPv6 mount target. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>Currently, IPv6 is supported only for Extreme NAS file systems in regions in the Chinese mainland, and the IPv6 feature must be enabled for the file system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li><p>General-purpose NAS file system: 31a8e4****.</p>
     * </li>
     * <li><p>Extreme NAS file system: The ID must start with <code>extreme-</code>, for example, extreme-0015****.</p>
     * </li>
     * <li><p>Cloud Parallel File Storage (CPFS): The ID must start with <code>cpfs-</code>, for example, cpfs-125487****.</p>
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
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required and valid only when the network type is VPC.
     * Example:
     * When NetworkType is set to VPC, VSwitchId is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zevmwkwyztjuoffg****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required and valid only when the network type is VPC.
     * Example:
     * When NetworkType is set to VPC, VpcId is required.</p>
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
