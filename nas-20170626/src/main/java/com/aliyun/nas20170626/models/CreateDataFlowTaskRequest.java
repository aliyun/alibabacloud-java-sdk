// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowTaskRequest extends TeaModel {
    /**
     * <p>A client-generated token that ensures the idempotence of the request. The token must be unique across different requests.</p>
     * <p><code>ClientToken</code> can contain only ASCII characters and must not exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <code>RequestId</code> of the API request as the <code>ClientToken</code>. The <code>RequestId</code> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The conflict policy for files with the same name.
     * Valid values:</p>
     * <ul>
     * <li><p>SKIP_THE_FILE: Skips files with the same name.</p>
     * </li>
     * <li><p>KEEP_LATEST: Compares update times and keeps the latest version.</p>
     * </li>
     * <li><p>OVERWRITE_EXISTING: Forcibly overwrites files with the same name.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if the file system is a CPFS AI-Computing Edition instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SKIP_THE_FILE</p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>Specifies whether to automatically create the directory if it does not exist.
     * Valid values:</p>
     * <ul>
     * <li><p>true: Automatically creates the directory.</p>
     * </li>
     * <li><p>false (default): Does not automatically create the directory.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when <code>TaskAction</code> is set to <code>Import</code>.</p>
     * </li>
     * <li><p>This parameter is supported only by CPFS AI-Computing Edition V2.6.0 and later.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateDirIfNotExist")
    public Boolean createDirIfNotExist;

    /**
     * <p>The ID of the data flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>The data type that the data flow task operates on.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Metadata: The metadata of the file, including attributes such as timestamp, ownership, and permissions. If you select <code>Metadata</code>, only the file metadata is imported. You can see the file, but when you access the file data, it is loaded from the source storage on demand.</p>
     * </li>
     * <li><p>Data: The data blocks of the file.</p>
     * </li>
     * <li><p>MetaAndData: The metadata and data blocks of the file.</p>
     * </li>
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
     * <li><p>The length must be 1 to 1,023 characters.</p>
     * </li>
     * <li><p>The directory must be UTF-8 encoded.</p>
     * </li>
     * <li><p>The directory must start and end with a forward slash (<code>/</code>).</p>
     * </li>
     * <li><p>Only one directory can be specified at a time.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>Export</code>, this directory must be a relative path within <code>FileSystemPath</code>.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>Import</code>, this directory must be a relative path within <code>SourceStoragePath</code>.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>StreamExport</code>, this directory must be a relative path within <code>FileSystemPath</code>.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>StreamImport</code>, this directory must be a relative path within <code>SourceStoragePath</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><code>StreamImport</code> and <code>StreamExport</code> are supported only by CPFS AI-Computing Edition V2.6.0 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/path_in_cpfs/</p>
     */
    @NameInMap("Directory")
    public String directory;

    /**
     * <p>Specifies whether to perform a dry run for this creation request.</p>
     * <p>A dry run checks parameter validity and inventory without creating an instance or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Sends a check request without creating the instance. The system checks for required parameters, request format, business limits, and NAS inventory. If the check fails, an error is returned. If the check passes, an HTTP 200 status code is returned, but <code>TaskId</code> is empty.</p>
     * </li>
     * <li><p>false (default): Sends a normal request and creates the instance after the check passes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The destination directory for the data flow task mapping.
     * Limits:</p>
     * <ul>
     * <li><p>The directory must start and end with a forward slash (<code>/</code>). The <code>/../</code> sequence is not supported.</p>
     * </li>
     * <li><p>The length must be 1 to 1,023 characters.</p>
     * </li>
     * <li><p>The directory must be UTF-8 encoded.</p>
     * </li>
     * <li><p>Only one directory can be specified at a time.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>Export</code>, this directory must be a relative path within <code>SourceStoragePath</code>.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>Import</code>, this directory must be a relative path within <code>FileSystemPath</code>.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>StreamExport</code>, this directory must be a relative path within <code>SourceStoragePath</code>.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>StreamImport</code>, this directory must be a relative path within <code>FileSystemPath</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><code>StreamImport</code> and <code>StreamExport</code> are supported only by CPFS AI-Computing Edition V2.6.0 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/path_in_cpfs/</p>
     */
    @NameInMap("DstDirectory")
    public String dstDirectory;

    /**
     * <p>The list of files for the data flow task to execute.</p>
     * <p>Limits:</p>
     * <ul>
     * <li><p>The list must be UTF-8 encoded.</p>
     * </li>
     * <li><p>The total length of the file list must be less than 64 KB.</p>
     * </li>
     * <li><p>The file list must be in JSON format.</p>
     * </li>
     * <li><p>The path of a single file must be 1 to 1,023 characters in length and must start with a forward slash (<code>/</code>).</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>Import</code>, each element in the list represents an OSS Object name.</p>
     * </li>
     * <li><p>If <code>TaskAction</code> is <code>Export</code>, each element in the list represents a CPFS file path.</p>
     * </li>
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
     * <li><p>CPFS General Purpose Edition: The ID must start with <code>cpfs-</code>, such as <code>cpfs-125487****</code>.</p>
     * </li>
     * <li><p>CPFS AI-Computing Edition: The ID must start with <code>bmcpfs-</code>, such as <code>bmcpfs-0015****</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>Filters the subdirectories under the <code>Directory</code> parameter and transfers the content of the filtered subdirectories.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when the <code>Directory</code> parameter is specified.</p>
     * </li>
     * <li><p>The path of a single folder must be 1 to 1,023 characters in length and must start and end with a forward slash (<code>/</code>). The total length cannot exceed 3,000 characters.</p>
     * </li>
     * <li><p>This feature is supported only by CPFS AI-Computing Edition.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/test/&quot;,&quot;/test1/&quot;]</p>
     */
    @NameInMap("Includes")
    public String includes;

    /**
     * <p>If you specify <code>SrcTaskId</code>, enter the ID of a data flow task. The system copies the <code>TaskAction</code>, <code>DataType</code>, and <code>EntryList</code> parameter information from the specified task. You do not need to specify these parameters.</p>
     * <blockquote>
     * <p>Data flow streaming tasks are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>task-29ee8e890f45****</p>
     */
    @NameInMap("SrcTaskId")
    public String srcTaskId;

    /**
     * <p>The type of the data flow task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Import: Imports specified data from the source storage to the CPFS file system.</p>
     * </li>
     * <li><p>Export: Exports specified data from the CPFS file system to the source storage.</p>
     * </li>
     * <li><p>StreamImport: Imports a large amount of specified data from the source storage to the CPFS file system.</p>
     * </li>
     * <li><p>StreamExport: Exports a large amount of specified data from the CPFS file system to the source storage.</p>
     * </li>
     * <li><p>Evict: Releases the data blocks of a file from the CPFS file system. After the release, only the metadata of the file is retained. You can still query the file, but its data blocks are cleared and no longer occupy storage capacity. When you access the file data, it is loaded from the source storage on demand.</p>
     * </li>
     * <li><p>Inventory: Obtains the inventory of files managed by a data flow for the CPFS file system. This provides the cache status of files in the data flow.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>CPFS AI-Computing Edition supports only <code>Import</code>, <code>Export</code>, <code>StreamImport</code>, and <code>StreamExport</code>. <code>StreamImport</code> and <code>StreamExport</code> are supported only by CPFS AI-Computing Edition V2.6.0 and later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Import</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>Specifies an OSS directory. Data is synchronized based on the content of the CSV files in this directory. The following limits apply.</p>
     * <ul>
     * <li><p>The path must start and end with a forward slash (<code>/</code>).</p>
     * </li>
     * <li><p>The path is case-sensitive.</p>
     * </li>
     * <li><p>The length must be between 1 and 1,023 characters.</p>
     * </li>
     * <li><p>The path must be UTF-8 encoded.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p><code>TransferFileListPath</code>, <code>Directory</code>, and <code>EntryList</code> are mutually exclusive. You can specify only one of them.</p>
     * </li>
     * <li><p>This parameter specifies an existing path in OSS. The <code>*.csv</code> files are stored in this path.</p>
     * </li>
     * <li><p><code>TransferFileListPath</code> supports only the <code>Import</code> and <code>Export</code> features.</p>
     * </li>
     * <li><p>For an <code>Import</code> task, the files or directories specified in the CSV file are imported from OSS to the CPFS file system.</p>
     * </li>
     * <li><p>For an <code>Export</code> task, the files or directories specified in the CSV file are exported from the CPFS file system to OSS.</p>
     * </li>
     * <li><p>The CSV file must contain <code>Name</code> and <code>Type</code> columns. <code>Name</code> is the relative path. <code>Type</code> can be <code>dir</code> or <code>file</code>. If <code>Type</code> is <code>dir</code>, the <code>Name</code> value must end with a forward slash (<code>/</code>).</p>
     * </li>
     * <li><p>This feature is supported only by CPFS AI-Computing Edition.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/test_oss_path/</p>
     */
    @NameInMap("TransferFileListPath")
    public String transferFileListPath;

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

    public CreateDataFlowTaskRequest setIncludes(String includes) {
        this.includes = includes;
        return this;
    }
    public String getIncludes() {
        return this.includes;
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

    public CreateDataFlowTaskRequest setTransferFileListPath(String transferFileListPath) {
        this.transferFileListPath = transferFileListPath;
        return this;
    }
    public String getTransferFileListPath() {
        return this.transferFileListPath;
    }

}
