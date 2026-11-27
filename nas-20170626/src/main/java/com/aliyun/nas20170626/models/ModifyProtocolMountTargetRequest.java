// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyProtocolMountTargetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the token on your client and ensure that the token is unique across different requests.</p>
     * <p>The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the export directory for the protocol service.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Description of the export directory</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on the modification request.</p>
     * <p>A dry run checks whether the parameters are valid and whether the dependencies are met. It does not actually modify the export directory or incur any fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: A dry run is performed and the export directory is not modified. The system checks whether required parameters are specified, the request format is valid, and the business limits and dependencies are met.</p>
     * <ul>
     * <li><strong>A dry run with DryRun set to true also checks the resource status</strong> (including the requirement that the export directory must be in the AVAILABLE state).</li>
     * <li>If the status of the export directory does not meet the requirements (for example, the status is CREATING), the corresponding error is returned.</li>
     * <li><strong>A dry run does not bypass the status check</strong>. It is only used to verify the validity of request parameters and basic dependencies.</li>
     * <li>If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the HTTP status code 200 is returned.</li>
     * </ul>
     * </li>
     * <li><p><strong>false</strong> (default): A normal request is sent. If the request passes the check, the parameters of the export directory are directly modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the export directory for the protocol service. You can call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> operation to query the export directory information and obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-19abf5beab8d****</p>
     */
    @NameInMap("ExportId")
    public String exportId;

    /**
     * <p>The ID of the file system. You can call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describefilesystems-cpfs">DescribeFileSystems</a> operation to query the file system information and obtain the ID. Set the FileSystemType parameter to cpfs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the protocol service. You can call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> operation to query the protocol service information and obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptc-197ed6a00f2b****</p>
     */
    @NameInMap("ProtocolServiceId")
    public String protocolServiceId;

    public static ModifyProtocolMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtocolMountTargetRequest self = new ModifyProtocolMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtocolMountTargetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyProtocolMountTargetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyProtocolMountTargetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyProtocolMountTargetRequest setExportId(String exportId) {
        this.exportId = exportId;
        return this;
    }
    public String getExportId() {
        return this.exportId;
    }

    public ModifyProtocolMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyProtocolMountTargetRequest setProtocolServiceId(String protocolServiceId) {
        this.protocolServiceId = protocolServiceId;
        return this;
    }
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

}
