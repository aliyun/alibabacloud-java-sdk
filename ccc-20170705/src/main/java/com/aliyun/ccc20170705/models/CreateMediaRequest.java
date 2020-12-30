// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateMediaRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Type")
    public String type;

    @NameInMap("Content")
    public String content;

    @NameInMap("OssFileName")
    public String ossFileName;

    @NameInMap("OssFilePath")
    public String ossFilePath;

    @NameInMap("UploadResult")
    public String uploadResult;

    public static CreateMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaRequest self = new CreateMediaRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMediaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMediaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMediaRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateMediaRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateMediaRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateMediaRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public CreateMediaRequest setOssFilePath(String ossFilePath) {
        this.ossFilePath = ossFilePath;
        return this;
    }
    public String getOssFilePath() {
        return this.ossFilePath;
    }

    public CreateMediaRequest setUploadResult(String uploadResult) {
        this.uploadResult = uploadResult;
        return this;
    }
    public String getUploadResult() {
        return this.uploadResult;
    }

}
