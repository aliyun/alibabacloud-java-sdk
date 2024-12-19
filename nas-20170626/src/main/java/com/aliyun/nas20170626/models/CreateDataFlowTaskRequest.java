// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The conflict policy for files with the same name. Valid values:</p>
     * <ul>
     * <li>SKIP_THE_FILE: skips files with the same name.</li>
     * <li>KEEP_LATEST: compares the update time and keeps the latest version.</li>
     * <li>OVERWRITE_EXISTING: forcibly overwrites the existing file.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required for CPFS for LINGJUN file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SKIP_THE_FILE</p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>Specifies whether to automatically create a directory if no directory exists. Valid values:</p>
     * <ul>
     * <li>true: automatically creates a directory.</li>
     * <li>false (default): does not automatically create a directory.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required if the TaskAction parameter is set to Import.</li>
     * <li>Only CPFS for LINGJUN V2.6.0 and later support this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateDirIfNotExist")
    public Boolean createDirIfNotExist;

    /**
     * <p>The dataflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>The type of data on which operations are performed by the dataflow task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Metadata: the metadata of a file, including the timestamp, ownership, and permission information of the file. If you select Metadata, only the metadata of the file is imported. You can only query the file. When you access the file data, the file is loaded from the source storage as required.</li>
     * <li>Data: the data blocks of a file.</li>
     * <li>MetaAndData: the metadata and data blocks of the file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Metadata</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The source directory of the data.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The directory must be 1 to 1,023 characters in length.</li>
     * <li>The directory must be encoded in UTF-8.</li>
     * <li>The directory must start and end with a forward slash (/).</li>
     * <li>Only one directory can be listed at a time.</li>
     * <li>If the TaskAction parameter is set to Export, the directory must be a relative path within the FileSystemPath.</li>
     * <li>If the TaskAction parameter is set to Import, the directory must be a relative path within the SourceStoragePath.</li>
     * <li>If the TaskAction parameter is set to StreamExport, the directory must be a relative path within the FileSystemPath.</li>
     * <li>If the TaskAction parameter is set to StreamImport, the directory must be a relative path within the SourceStoragePath.</li>
     * </ul>
     * <blockquote>
     * <p> Only CPFS for LINGJUN V2.6.0 and later support StreamImport and StreamExport.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/path_in_cpfs/</p>
     */
    @NameInMap("Directory")
    public String directory;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no data flow task is created and no fee is incurred.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the required parameters, request syntax, service limits, and available File Storage NAS (NAS) resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the TaskId parameter.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a data flow task is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The directory mapped to the data flow task. Limits:</p>
     * <ul>
     * <li>The directory must start and end with a forward slash (/). The directory cannot be /../.</li>
     * <li>The directory must be 1 to 1,023 characters in length.</li>
     * <li>The directory must be encoded in UTF-8.</li>
     * <li>Only one directory can be listed at a time.</li>
     * <li>If the TaskAction parameter is set to Export, the directory must be a relative path within the SourceStoragePath.</li>
     * <li>If the TaskAction parameter is set to Import, the directory must be a relative path within the FileSystemPath.</li>
     * <li>If the TaskAction parameter is set to StreamExport, the directory must be a relative path within the SourceStoragePath.</li>
     * <li>If the TaskAction parameter is set to StreamImport, the directory must be a relative path within the FileSystemPath.</li>
     * </ul>
     * <blockquote>
     * <p> Only CPFS for LINGJUN V2.6.0 and later support StreamImport and StreamExport.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/path_in_cpfs/</p>
     */
    @NameInMap("DstDirectory")
    public String dstDirectory;

    /**
     * <p>The list of files that are executed by the data flow task.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The list must be encoded in UTF-8.</li>
     * <li>The total length of the file list cannot exceed 64 KB.</li>
     * <li>The file list is in JSON format.</li>
     * <li>The path of a single file must be 1 to 1,023 characters in length and must start with a forward slash (/).</li>
     * <li>If the TaskAction parameter is set to Import, each element in the list represents an OSS object name.</li>
     * <li>If the TaskAction parameter is set to Export, each element in the list represents a CPFS file path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/path_in_cpfs/file1&quot;, &quot;/path_in_cpfs/file2&quot;]</p>
     */
    @NameInMap("EntryList")
    public String entryList;

    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-0015\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <blockquote>
     * <p> CPFS is not supported on the international site.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>If you specify SrcTaskId, the configurations of the TaskAction, DataType, and EntryList parameters are copied from the desired dataflow task. You do not need to specify them.</p>
     * 
     * <strong>example:</strong>
     * <p>task-27aa8e890f45****</p>
     */
    @NameInMap("SrcTaskId")
    public String srcTaskId;

    /**
     * <p>The type of the data flow task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Import: imports data stored in the source storage to a CPFS file system.</li>
     * <li>Export: exports specified data from a CPFS file system to the source storage.</li>
     * <li>StreamImport: batch imports the specified data from the source storage to a CPFS file system.</li>
     * <li>StreamExport: batch exports specified data from a CPFS file system to the source storage.</li>
     * </ul>
     * <blockquote>
     * <p> Only CPFS for LINGJUN V2.6.0 and later support StreamImport and StreamExport.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Import</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    public static CreateDataFlowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowTaskRequest self = new CreateDataFlowTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataFlowTaskRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    public CreateDataFlowTaskRequest setCreateDirIfNotExist(Boolean createDirIfNotExist) {
        this.createDirIfNotExist = createDirIfNotExist;
        return this;
    }
    public Boolean getCreateDirIfNotExist() {
        return this.createDirIfNotExist;
    }

    public CreateDataFlowTaskRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public CreateDataFlowTaskRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDataFlowTaskRequest setDirectory(String directory) {
        this.directory = directory;
        return this;
    }
    public String getDirectory() {
        return this.directory;
    }

    public CreateDataFlowTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDataFlowTaskRequest setDstDirectory(String dstDirectory) {
        this.dstDirectory = dstDirectory;
        return this;
    }
    public String getDstDirectory() {
        return this.dstDirectory;
    }

    public CreateDataFlowTaskRequest setEntryList(String entryList) {
        this.entryList = entryList;
        return this;
    }
    public String getEntryList() {
        return this.entryList;
    }

    public CreateDataFlowTaskRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateDataFlowTaskRequest setSrcTaskId(String srcTaskId) {
        this.srcTaskId = srcTaskId;
        return this;
    }
    public String getSrcTaskId() {
        return this.srcTaskId;
    }

    public CreateDataFlowTaskRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

}
