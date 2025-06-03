// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceFileRequest extends TeaModel {
    /**
     * <p>The code for the file. The code format varies based on the file type. To view the code format for a specific file type, go to Operation Center, open the directed acyclic graph (DAG) of a node of the file type, right-click the node, and then select View Code.</p>
     * 
     * <strong>example:</strong>
     * <p>SHOW TABLES;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description</p>
     */
    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <p>The path of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business_process/First_Business_Process/MaxCompute/Folder_1/Folder_2</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The name of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Filename</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The type of the code for the file.</p>
     * <p>The code for files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>. You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the type of the code for the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

    /**
     * <p>The name of the original resource file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>origin_file_name.sql</p>
     */
    @NameInMap("OriginResourceName")
    public String originResourceName;

    /**
     * <p>The ID of the Alibaba Cloud account used by the file owner. If this parameter is not configured, the ID of the Alibaba Cloud account of the user who calls the operation is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to query the ID. You must configure this parameter to specify the DataWorks workspace to which the operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Specifies whether to upload the resource file to a desired compute engine.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RegisterToCalcEngine")
    public Boolean registerToCalcEngine;

    /**
     * <p>The URL of the Object Storage Service (OSS) bucket to which you upload the file. The URL is provided by the POP platform.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucketname1.oss-cn-shanghai.aliyuncs.com/example">http://bucketname1.oss-cn-shanghai.aliyuncs.com/example</a></p>
     */
    @NameInMap("ResourceFile")
    public String resourceFile;

    /**
     * <p>The storage path of the resource file in a desired compute engine. This parameter takes effect only for E-MapReduce (EMR) and Cloudera\&quot;s Distribution including Apache Hadoop (CDH) compute engines. In an EMR compute engine, this parameter is configured in the [osshdfs]://path/to/object format. In a CDH compute engine, this parameter is set to /user/admin/lib by default.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://oss-cn-shanghai.aliyuncs.com/emr-test</p>
     */
    @NameInMap("StorageURL")
    public String storageURL;

    /**
     * <p>The upload mode of MaxCompute file resources. This parameter takes effect only for MaxCompute file resources. Valid values:</p>
     * <ul>
     * <li>true: indicates the resource upload and download mode.</li>
     * <li>false: indicates the online editing mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UploadMode")
    public Boolean uploadMode;

    public static CreateResourceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceFileRequest self = new CreateResourceFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateResourceFileRequest setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }
    public String getFileDescription() {
        return this.fileDescription;
    }

    public CreateResourceFileRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public CreateResourceFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateResourceFileRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public CreateResourceFileRequest setOriginResourceName(String originResourceName) {
        this.originResourceName = originResourceName;
        return this;
    }
    public String getOriginResourceName() {
        return this.originResourceName;
    }

    public CreateResourceFileRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateResourceFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateResourceFileRequest setRegisterToCalcEngine(Boolean registerToCalcEngine) {
        this.registerToCalcEngine = registerToCalcEngine;
        return this;
    }
    public Boolean getRegisterToCalcEngine() {
        return this.registerToCalcEngine;
    }

    public CreateResourceFileRequest setResourceFile(String resourceFile) {
        this.resourceFile = resourceFile;
        return this;
    }
    public String getResourceFile() {
        return this.resourceFile;
    }

    public CreateResourceFileRequest setStorageURL(String storageURL) {
        this.storageURL = storageURL;
        return this;
    }
    public String getStorageURL() {
        return this.storageURL;
    }

    public CreateResourceFileRequest setUploadMode(Boolean uploadMode) {
        this.uploadMode = uploadMode;
        return this;
    }
    public Boolean getUploadMode() {
        return this.uploadMode;
    }

}
