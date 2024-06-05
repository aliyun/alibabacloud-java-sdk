// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyProtocolMountTargetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](https://help.aliyun.com/document_detail/25693.html)</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the export directory for the protocol service.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The description must be 2 to 128 characters in length.</p>
     * <p>*   The description must start with a letter but cannot start with `http://` or `https://`.</p>
     * <p>*   The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. The dry run checks parameter validity and prerequisites. The dry run does not modify the specified export directory or incur fees.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the required parameters, request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned.</p>
     * <p>*   false (default): performs a dry run and sends the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the export directory for the protocol service.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExportId")
    public String exportId;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the protocol service.</p>
     * <br>
     * <p>This parameter is required.</p>
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
