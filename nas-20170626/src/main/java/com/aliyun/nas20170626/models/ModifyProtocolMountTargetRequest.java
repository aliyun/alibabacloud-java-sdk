// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyProtocolMountTargetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a unique value from your client to ensure that different requests have unique ClientToken values.</p>
     * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the export directory of the protocol service.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Description of this export directory</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this modification request.</p>
     * <p>A dry run checks parameter validity and dependency conditions without actually modifying the export directory or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sends a dry run request without modifying the export directory. The check items include required parameters, request format, and business dependency conditions.</p>
     * <ul>
     * <li><strong>DryRun=true also performs resource status checks</strong> (including the requirement that the export directory is in the AVAILABLE state).</li>
     * <li>If the export directory status does not meet the requirements (such as CREATING), the corresponding error is returned.</li>
     * <li><strong>DryRun does not bypass status checks</strong>. It only validates request parameter validity and basic dependencies.</li>
     * <li>If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned.</li>
     * </ul>
     * </li>
     * <li><p><strong>false (default)</strong>: Sends a normal request. After the check passes, the export directory parameters are directly modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The export directory ID of the protocol service. Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to obtain the export directory information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-19abf5beab8d****</p>
     */
    @NameInMap("ExportId")
    public String exportId;

    /**
     * <p>The file system ID. Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describefilesystems-cpfs">DescribeFileSystems</a> (with FileSystemType set to cpfs) to obtain the file system information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The protocol service ID. Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to obtain the protocol service information.</p>
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
