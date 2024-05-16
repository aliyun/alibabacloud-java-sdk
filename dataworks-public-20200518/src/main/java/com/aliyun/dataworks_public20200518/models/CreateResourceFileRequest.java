// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateResourceFileRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OriginResourceName")
    public String originResourceName;

    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegisterToCalcEngine")
    public Boolean registerToCalcEngine;

    @NameInMap("ResourceFile")
    public String resourceFile;

    @NameInMap("StorageURL")
    public String storageURL;

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
