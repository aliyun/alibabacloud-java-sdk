// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateResourceFileAdvanceRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("FileDescription")
    public String fileDescription;

    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public Integer fileType;

    @NameInMap("OriginResourceName")
    public String originResourceName;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RegisterToCalcEngine")
    public Boolean registerToCalcEngine;

    @NameInMap("ResourceFile")
    public java.io.InputStream resourceFileObject;

    @NameInMap("StorageURL")
    public String storageURL;

    @NameInMap("UploadMode")
    public Boolean uploadMode;

    public static CreateResourceFileAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceFileAdvanceRequest self = new CreateResourceFileAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceFileAdvanceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateResourceFileAdvanceRequest setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }
    public String getFileDescription() {
        return this.fileDescription;
    }

    public CreateResourceFileAdvanceRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public CreateResourceFileAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateResourceFileAdvanceRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public CreateResourceFileAdvanceRequest setOriginResourceName(String originResourceName) {
        this.originResourceName = originResourceName;
        return this;
    }
    public String getOriginResourceName() {
        return this.originResourceName;
    }

    public CreateResourceFileAdvanceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateResourceFileAdvanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateResourceFileAdvanceRequest setRegisterToCalcEngine(Boolean registerToCalcEngine) {
        this.registerToCalcEngine = registerToCalcEngine;
        return this;
    }
    public Boolean getRegisterToCalcEngine() {
        return this.registerToCalcEngine;
    }

    public CreateResourceFileAdvanceRequest setResourceFileObject(java.io.InputStream resourceFileObject) {
        this.resourceFileObject = resourceFileObject;
        return this;
    }
    public java.io.InputStream getResourceFileObject() {
        return this.resourceFileObject;
    }

    public CreateResourceFileAdvanceRequest setStorageURL(String storageURL) {
        this.storageURL = storageURL;
        return this;
    }
    public String getStorageURL() {
        return this.storageURL;
    }

    public CreateResourceFileAdvanceRequest setUploadMode(Boolean uploadMode) {
        this.uploadMode = uploadMode;
        return this;
    }
    public Boolean getUploadMode() {
        return this.uploadMode;
    }

}
