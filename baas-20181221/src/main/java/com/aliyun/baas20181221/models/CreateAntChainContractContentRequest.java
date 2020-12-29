// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainContractContentRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ParentContentId")
    public String parentContentId;

    @NameInMap("ContentName")
    public String contentName;

    @NameInMap("IsDirectory")
    public Boolean isDirectory;

    @NameInMap("Content")
    public String content;

    public static CreateAntChainContractContentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainContractContentRequest self = new CreateAntChainContractContentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainContractContentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAntChainContractContentRequest setParentContentId(String parentContentId) {
        this.parentContentId = parentContentId;
        return this;
    }
    public String getParentContentId() {
        return this.parentContentId;
    }

    public CreateAntChainContractContentRequest setContentName(String contentName) {
        this.contentName = contentName;
        return this;
    }
    public String getContentName() {
        return this.contentName;
    }

    public CreateAntChainContractContentRequest setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
        return this;
    }
    public Boolean getIsDirectory() {
        return this.isDirectory;
    }

    public CreateAntChainContractContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
