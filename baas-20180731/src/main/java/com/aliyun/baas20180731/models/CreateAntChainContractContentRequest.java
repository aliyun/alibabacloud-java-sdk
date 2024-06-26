// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainContractContentRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContentName")
    public String contentName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IsDirectory")
    public Boolean isDirectory;

    @NameInMap("ParentContentId")
    public String parentContentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static CreateAntChainContractContentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainContractContentRequest self = new CreateAntChainContractContentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainContractContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
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

    public CreateAntChainContractContentRequest setParentContentId(String parentContentId) {
        this.parentContentId = parentContentId;
        return this;
    }
    public String getParentContentId() {
        return this.parentContentId;
    }

    public CreateAntChainContractContentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
