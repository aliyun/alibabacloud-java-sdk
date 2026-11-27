// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateProtocolMountTargetRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>Default value: DEFAULT_VPC_GROUP_NAME.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_VPC_GROUP_NAME</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate a parameter value from your client to ensure that the value is unique across different requests.</p>
     * <p>The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the export directory for the protocol service. It is displayed as the <strong>Export Directory Name</strong> in the console.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The value must be 2 to 128 characters in length.</li>
     * <li>The value must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The value can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The description of this export directory</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on the creation request.
     * A dry run helps you check the validity of parameters and dependencies without actually creating the instance or incurring fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: sends a check request and does not create the export directory. The check items include whether required parameters are specified, the request format, and business limits and dependencies. If the check fails, the corresponding error is returned. If the check succeeds, the HTTP status code 200 is returned, but ExportId is empty.</li>
     * <li>false (default): sends a normal request and directly creates the instance after the check succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     * <blockquote>
     * <p>The target CPFS file system must be in the Running state before you can call this operation. It takes about 20 to 40 minutes for a file system to reach the Running state after creation. You can poll the Status field by calling the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> operation. A value of Running indicates that the file system is ready.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the Fileset to be exported.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The Fileset must already exist.</li>
     * <li>Only one export directory can be created for a single Fileset.</li>
     * <li>You must specify either Fileset or Path, but not both.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fset-1902718ea0ae****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>The path of the CPFS directory to be exported.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The directory must already exist on the CPFS file system.</li>
     * <li>Only one export can be created for the same directory.</li>
     * <li>You must specify either Fileset or Path, but not both.</li>
     * </ul>
     * <p>Format:</p>
     * <ul>
     * <li>The value must be 1 to 1,024 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * <li>The value must start and end with a forward slash (/). The root directory is <code>/</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the protocol service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptc-197ed6a00f2b****</p>
     */
    @NameInMap("ProtocolServiceId")
    public String protocolServiceId;

    /**
     * <p>The ID of the vSwitch to which the protocol service export belongs.</p>
     * <p>If the storage redundancy type of the file system is not zone-redundant storage (ZRS) and VpcId is specified, this parameter is required.</p>
     * <blockquote>
     * <p>The vSwitch must be in the same zone as the target CPFS file system (the ZoneId values must be the same). You can call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> operation to query the ZoneId field of the file system, and then select a vSwitch in the same zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-2vc3c2lybvdllxyq4****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The list of vSwitch IDs for the protocol service export.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The ID of the VPC to which the protocol service export belongs.</p>
     * <blockquote>
     * <p>The CIDR block of the selected VPC must not overlap with the VPC CIDR block of the target CPFS file system. You can call the DescribeVpcs operation of VPC to query the CidrBlock field of each VPC for comparison, and select a VPC that does not conflict and is in the same zone as the file system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-2vct297b8157bth9z****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateProtocolMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtocolMountTargetRequest self = new CreateProtocolMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtocolMountTargetRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateProtocolMountTargetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProtocolMountTargetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProtocolMountTargetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateProtocolMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateProtocolMountTargetRequest setFsetId(String fsetId) {
        this.fsetId = fsetId;
        return this;
    }
    public String getFsetId() {
        return this.fsetId;
    }

    public CreateProtocolMountTargetRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateProtocolMountTargetRequest setProtocolServiceId(String protocolServiceId) {
        this.protocolServiceId = protocolServiceId;
        return this;
    }
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

    public CreateProtocolMountTargetRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateProtocolMountTargetRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateProtocolMountTargetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
