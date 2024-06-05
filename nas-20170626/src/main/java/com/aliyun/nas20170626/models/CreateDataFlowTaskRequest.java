// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](https://help.aliyun.com/document_detail/25693.html)</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>The dataflow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>The type of data on which operations are performed by the dataflow task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Metadata: the metadata of a file, including the timestamp, ownership, and permission information of the file. If you select Metadata, only the metadata of the file is imported. You can only query the file. When you access the file data, the file is loaded from the source storage as required.</p>
     * <p>*   Data: the data blocks of a file.</p>
     * <p>*   MetaAndData: the metadata and data blocks of the file.</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The directory in which the dataflow task is executed.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The directory must be 2 to 1,024 characters in length.</p>
     * <p>*   The directory must be encoded in UTF-8.</p>
     * <p>*   The directory must start and end with a forward slash (/).</p>
     * <p>*   Only one directory can be listed at a time.</p>
     * <p>*   The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.</p>
     */
    @NameInMap("Directory")
    public String directory;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <br>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</p>
     * <p>*   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The list of files that are executed by the dataflow task.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The list must be encoded in UTF-8.</p>
     * <p>*   The file list is in JSON format.</p>
     * <p>*   If the source storage is Object Storage Service (OSS), the list name must comply with the naming conventions of OSS objects.</p>
     */
    @NameInMap("EntryList")
    public String entryList;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>If you specify SrcTaskId, the configurations of the TaskAction, DataType, and EntryList parameters are copied from the desired dataflow task. You do not need to specify them.</p>
     */
    @NameInMap("SrcTaskId")
    public String srcTaskId;

    /**
     * <p>The type of the dataflow task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Import: imports data stored in the source storage to a CPFS file system.</p>
     * <p>*   Export: exports specified data from a CPFS file system to the source storage.</p>
     * <p>*   Evict: releases the data blocks of a file in a CPFS file system. After the eviction, only the metadata of the file is retained in the CPFS file system. You can still query the file. However, the data blocks of the file are cleared and do not occupy the storage space in the CPFS file system. When you access the file data, the file is loaded from the source storage as required.</p>
     * <p>*   Inventory: obtains the inventory list managed by a dataflow from the CPFS file system, providing the cache status of inventories in the dataflow.</p>
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
