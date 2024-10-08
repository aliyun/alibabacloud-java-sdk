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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the export directory for the protocol service. The <strong>name of the export directory</strong> appears in the console.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run. The dry run checks parameter validity and prerequisites. The dry run does not create an export directory or incur fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the request format, service limits, prerequisites, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the ExportId parameter.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, an export directory is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-123****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the fileset that you want to export.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The fileset already exists.</li>
     * <li>You can create only one export directory for a fileset.</li>
     * <li>You can specify either a fileset or a path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fset-123****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>The path of the CPFS directory that you want to export.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The directory already exists in the CPFS file system.</li>
     * <li>You can create only one export directory for a directory.</li>
     * <li>You can specify either a fileset or a path.</li>
     * </ul>
     * <p>Format:</p>
     * <ul>
     * <li>The path must be 1 to 1,024 characters in length.</li>
     * <li>The path must be encoded in UTF-8.</li>
     * <li>The path must start and end with a forward slash (/). The root directory is <code>/</code>.</li>
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
     * <p>ptc-123****</p>
     */
    @NameInMap("ProtocolServiceId")
    public String protocolServiceId;

    /**
     * <p>The vSwitch ID of the export directory for the protocol service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-123****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID of the export directory for the protocol service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-123****</p>
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

    public CreateProtocolMountTargetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
