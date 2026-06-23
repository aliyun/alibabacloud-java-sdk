// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceFileRequest extends TeaModel {
    /**
     * <p>The code content of the file. The code format varies depending on the code type (fileType). You can locate a job of the corresponding type in the Operation Center, right-click it, and select View Code to check the specific code format.</p>
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
     * <p>The code type of the file.</p>
     * <p>Different file types correspond to different code types. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks Node Types</a>.<br>
     * You can also invoke the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> API to query the code types of files.</p>
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
     * <p>The Alibaba Cloud User ID of the file owner. If this parameter is empty, the Alibaba Cloud User ID of the caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console, go to the workspace configuration page, and obtain the workspace ID. This parameter is required to identify the DataWorks workspace for this API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Indicates whether to synchronize and upload the resource to the compute engine.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RegisterToCalcEngine")
    public Boolean registerToCalcEngine;

    /**
     * <p>The OSS URL for file upload provided by POP.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucketname1.oss-cn-shanghai.aliyuncs.com/example">http://bucketname1.oss-cn-shanghai.aliyuncs.com/example</a></p>
     */
    @NameInMap("ResourceFile")
    public String resourceFile;

    /**
     * <p>The Storage Path of the resource file on the compute engine. This field is currently used only by EMR and CDH. The EMR format is [osshdfs]://path/to/object, and for CDH, the default value must be /user/admin/lib.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://oss-cn-shanghai.aliyuncs.com/emr-test</p>
     */
    @NameInMap("StorageURL")
    public String storageURL;

    /**
     * <p>The upload mode for the resource file. This parameter currently applies only to File-type files in MaxCompute. Valid values:</p>
     * <ul>
     * <li><p>true: Downloadable resource mode.</p>
     * </li>
     * <li><p>false: Online-editable text mode.</p>
     * </li>
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
