// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
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
     * <li>SKIP_THE_FILE: skips files with the same name.</li>
     * <li>KEEP_LATEST: compares the update time and keeps the latest version.</li>
     * <li>OVERWRITE_EXISTING: forcibly overwrites files with the same name.<blockquote>
     * <p>This parameter is required when the file system type is CPFS for Lingjun.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SKIP_THE_FILE</p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>Specifies whether to enable automatic creation of the folder if it does not exist.
     * Valid values:</p>
     * <ul>
     * <li>true: enables automatic creation of the folder.</li>
     * <li>false (default): does not enable automatic creation of the folder.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect when TaskAction is set to Import.</li>
     * <li>Only CPFS for Lingjun 2.6.0 and later support this feature.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateDirIfNotExist")
    public Boolean createDirIfNotExist;

    /**
     * <p>The data flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>The type of data on which the data flow task operates.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Metadata: the metadata of files, including the timestamp, ownership, permission, and other attributes. If you select Metadata, only the metadata of files is imported. You can view the file, but when you access the file data, the data is loaded from the source storage on demand.</li>
     * <li>Data: the data blocks of files.</li>
     * <li>MetaAndData: the metadata and data blocks of files.<blockquote>
     * <p>When TaskAction is set to Evict, the DataType parameter is required.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Metadata</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The source directory of data.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The value must be 1 to 1,023 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * <li>The value must start and end with a forward slash (/).</li>
     * <li>Only one directory can be specified at a time.</li>
     * <li>When TaskAction is set to Export, this directory must be a relative path within FileSystemPath.</li>
     * <li>When TaskAction is set to Import, this directory must be a relative path within SourceStoragePath.</li>
     * <li>When TaskAction is set to StreamExport, this directory must be a relative path within FileSystemPath.</li>
     * <li>When TaskAction is set to StreamImport, this directory must be a relative path within SourceStoragePath.<blockquote>
     * <p>StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.
     * Directory, EntryList, and TransferFileListPath are mutually exclusive parameters. You can specify only one of them.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/path_in_cpfs/</p>
     */
    @NameInMap("Directory")
    public String directory;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>The dry run checks parameter validity and whether required resources are available. The dry run does not create an instance or incur fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without creating the instance. The system checks whether the required parameters are specified, whether the request format is valid, whether service limits are reached, and whether the required NAS resources are available. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned, but TaskId is empty.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The target directory to which the data flow task maps.
     * Limits:</p>
     * <ul>
     * <li>The value must start and end with a forward slash (/). /../ is not supported.</li>
     * <li>The value must be 1 to 1,023 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * <li>Only one directory can be specified at a time.</li>
     * <li>When TaskAction is set to Export, this directory must be a relative path within SourceStoragePath.</li>
     * <li>When TaskAction is set to Import, this directory must be a relative path within FileSystemPath.</li>
     * <li>When TaskAction is set to StreamExport, this directory must be a relative path within SourceStoragePath.</li>
     * <li>When TaskAction is set to StreamImport, this directory must be a relative path within FileSystemPath.<blockquote>
     * <p>StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/path_in_cpfs/</p>
     */
    @NameInMap("DstDirectory")
    public String dstDirectory;

    /**
     * <p>The list of files on which the data flow task is executed.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The value must be encoded in UTF-8.</li>
     * <li>The total length of the file list must be less than 64 KB.</li>
     * <li>The file list is in JSON format.</li>
     * <li>The path of each file must be 1 to 1,023 characters in length and must start with a forward slash (/).</li>
     * <li>When TaskAction is set to Import, each element in the list represents an OSS object name.</li>
     * <li>When TaskAction is set to Export, each element in the list represents a CPFS file path.<blockquote>
     * <p>Directory, EntryList, and TransferFileListPath are mutually exclusive parameters. You can specify only one of them.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/path_in_cpfs/file1&quot;, &quot;/path_in_cpfs/file2&quot;]</p>
     */
    @NameInMap("EntryList")
    public String entryList;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>General-purpose CPFS: must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
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
     * <p>Filters directories under the specified directory and transfers the content of the included folders.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when the Directory parameter is specified.</li>
     * <li>The path of each folder must be 1 to 1,023 characters in length and must start and end with a forward slash (/). The total length must not exceed 3,000 characters.</li>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/test/&quot;,&quot;/test1/&quot;]</p>
     */
    @NameInMap("Includes")
    public String includes;

    /**
     * <p>If you specify SrcTaskId, enter the data flow task ID. The system copies the TaskAction, DataType, and EntryList parameter information from the specified data flow task, and you do not need to specify these parameters separately.</p>
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
     * <p>The data flow node type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Import: performs data import from the source storage to CPFS.</li>
     * <li>Export: exports specified data from CPFS to the source storage.</li>
     * <li>StreamImport: batch imports specified data from the source storage to CPFS.</li>
     * <li>StreamExport: batch exports specified data from CPFS to the source storage.</li>
     * <li>Evict: releases data blocks of files on CPFS. After the release, only metadata is retained on CPFS. You can still query the file, but the data blocks are purged and do not occupy storage capacity on CPFS. When you access the file data, the data is loaded from the source storage on demand.</li>
     * <li>Inventory: obtains the file checklist managed by the data stream on CPFS. The checklist provides the cache status of files in the data flow.<blockquote>
     * <p>CPFS for Lingjun supports only Import, Export, StreamImport, and StreamExport. StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Import</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The OSS directory. Data is synchronized based on the content of CSV files in the OSS directory. Limits:</p>
     * <ul>
     * <li><p>The value must start and end with a forward slash (/).</p>
     * </li>
     * <li><p>The value is case-sensitive.</p>
     * </li>
     * <li><p>The value must be 1 to 1,023 characters in length.</p>
     * </li>
     * <li><p>The value must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>TransferFileListPath, Directory, and EntryList are mutually exclusive parameters. You can specify only one of them.</li>
     * <li>This parameter specifies an existing path in OSS. The \*.csv files in the path are stored in OSS.</li>
     * <li>TransferFileListPath supports only Import and Export.</li>
     * <li>In the Import scenario, the files or directories specified in the CSV files are imported from OSS to CPFS.</li>
     * <li>In the Export scenario, the files or directories specified in the CSV files are exported from CPFS to OSS.</li>
     * <li>The CSV file format must include the Name and Type columns. Name is a relative path, and Type supports two values: dir and file. If Type is dir, the Name value must end with a forward slash (/).</li>
     * <li>Only CPFS for Lingjun supports this feature.</li>
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
