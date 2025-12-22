// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateMountTargetRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required if you create a mount target for a General-purpose NAS file system or an Extreme NAS file system.</p>
     * <p>The default permission group for virtual private clouds (VPCs) is named DEFAULT_VPC_GROUP_NAME.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>Specifies whether to perform a dry run to check for existing mount targets. This parameter is valid only for CPFS file systems.</p>
     * <p>If you set this parameter to true, the system checks whether the request parameters are valid and whether the requested resources are available. In this case, no mount target is created and no fee is incurred.</p>
     * <ul>
     * <li>true: performs a dry run but does not create a mount target. In the dry run, the system checks the request format, service limits, available CPFS resources, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code <code>200</code> is returned. No value is returned for the <code>MountTargetDomain</code> parameter.</li>
     * <li>false (default): sends the request. If the request passes the dry run, a mount target is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to create an IPv6 domain name for the mount target.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: An IPv6 domain name is created for the mount target.</li>
     * <li>false (default): No IPv6 domain name is created for the mount target.</li>
     * </ul>
     * <blockquote>
     * <p>Only Extreme NAS file systems that reside in the Chinese mainland support IPv6. If you want to create an IPv6 domain name for the mount target, you must enable IPv6 for the file system.</p>
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
     * <li>Sample ID of a General-purpose NAS file system: 31a8e4\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>, for example, extreme-0015\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174494****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The network type of the mount target. Valid value: <strong>Vpc</strong>.</p>
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
     * <p>This parameter is valid and required if the mount target resides in a VPC. Example: If you set the NetworkType parameter to VPC, you must specify the VSwitchId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zevmwkwyztjuoffg****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is valid and required if the mount target resides in a VPC. Example: If you set the NetworkType parameter to VPC, you must specify the VpcId parameter.</p>
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
