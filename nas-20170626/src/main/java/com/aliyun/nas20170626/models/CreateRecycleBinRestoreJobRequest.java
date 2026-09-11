// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinRestoreJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a value from your client to ensure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify ClientToken, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The FileId of the file or directory to restore.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2412174.html">ListRecycledDirectoriesAndFiles</a> operation to query the FileId of deleted data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04***08</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The file system ID. <strong>Required</strong>.</p>
     * <p><strong>How to obtain</strong>:</p>
     * <ul>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to query the file system list and obtain the FileSystemId.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> to create a file system and obtain the FileSystemId from the response.</li>
     * </ul>
     * <p><strong>Usage notes</strong>:</p>
     * <ul>
     * <li>This operation applies only to General-purpose NAS file systems.</li>
     * <li>Before calling this operation, make sure that the recycle bin feature is enabled for the file system.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The FileId of the directory to which the file is restored.</p>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/2412173.html">ListRecentlyRecycledDirectories</a> operation to query the TargetFileId of directories from which files have been deleted.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/2412163.html">ListDirectoriesAndFiles</a> operation to query the TargetFileId of existing directories in the file system.</p>
     * </li>
     * </ul>
     * <p><strong>Special notes</strong>:</p>
     * <ul>
     * <li>The FileId of the root directory of a file system is fixed to <code>2</code>. You can directly use this value as the TargetFileId to restore a file to the root directory without querying.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13***15</p>
     */
    @NameInMap("TargetFileId")
    public String targetFileId;

    public static CreateRecycleBinRestoreJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinRestoreJobRequest self = new CreateRecycleBinRestoreJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinRestoreJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRecycleBinRestoreJobRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateRecycleBinRestoreJobRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateRecycleBinRestoreJobRequest setTargetFileId(String targetFileId) {
        this.targetFileId = targetFileId;
        return this;
    }
    public String getTargetFileId() {
        return this.targetFileId;
    }

}
