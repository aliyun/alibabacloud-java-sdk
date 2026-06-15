// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFilesetRequest extends TeaModel {
    /**
     * <p>A client-generated token that you can use to ensure the idempotence of the request. The ClientToken must be unique across requests.</p>
     * <p>The ClientToken can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the request ID as the ClientToken. The request ID is unique for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run for the request.</p>
     * <p>A dry run checks for issues such as parameter validity and resource availability, but does not delete the fileset.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Sends a check request and does not delete the fileset. The system checks for required parameters, request format, and business limits. If the check fails, an error is returned. If the check passes, an HTTP 200 OK status code is returned.</p>
     * </li>
     * <li><p>false (Default): Sends a normal request and deletes the fileset after the check passes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-099394bd928c\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for AI and HPC: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The fileset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fset-1902718ea0ae****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    public static DeleteFilesetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilesetRequest self = new DeleteFilesetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFilesetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteFilesetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteFilesetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteFilesetRequest setFsetId(String fsetId) {
        this.fsetId = fsetId;
        return this;
    }
    public String getFsetId() {
        return this.fsetId;
    }

}
