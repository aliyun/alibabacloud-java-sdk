// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("codeUrl")
    public String codeUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("codeVersion")
    public String codeVersion;

    @NameInMap("filePath")
    public String filePath;

    @NameInMap("name")
    public String name;

    @NameInMap("requestFrom")
    public String requestFrom;

    @NameInMap("resourceIdentifier")
    public String resourceIdentifier;

    @NameInMap("reuse")
    public Boolean reuse;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceTemplate")
    public String workspaceTemplate;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }
    public String getCodeUrl() {
        return this.codeUrl;
    }

    public CreateWorkspaceRequest setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public CreateWorkspaceRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkspaceRequest setRequestFrom(String requestFrom) {
        this.requestFrom = requestFrom;
        return this;
    }
    public String getRequestFrom() {
        return this.requestFrom;
    }

    public CreateWorkspaceRequest setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public CreateWorkspaceRequest setReuse(Boolean reuse) {
        this.reuse = reuse;
        return this;
    }
    public Boolean getReuse() {
        return this.reuse;
    }

    public CreateWorkspaceRequest setWorkspaceTemplate(String workspaceTemplate) {
        this.workspaceTemplate = workspaceTemplate;
        return this;
    }
    public String getWorkspaceTemplate() {
        return this.workspaceTemplate;
    }

}
