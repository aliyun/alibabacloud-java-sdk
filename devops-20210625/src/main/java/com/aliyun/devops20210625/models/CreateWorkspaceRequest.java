// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    // 代码来源URL（当前仅支持云效 Codeup 来源）
    @NameInMap("codeUrl")
    public String codeUrl;

    // 代码版本，支持 commitSHA、分支、标签
    @NameInMap("codeVersion")
    public String codeVersion;

    // 打开空间默认打开的文件相对路径
    @NameInMap("filePath")
    public String filePath;

    // 工作空间名称
    @NameInMap("name")
    public String name;

    // 请求来源（用于统计，云产品集成时需要传入）
    @NameInMap("requestFrom")
    public String requestFrom;

    // 资源标识，提供给非标代码源作为空间复用的唯一标识
    @NameInMap("resourceIdentifier")
    public String resourceIdentifier;

    // 工作空间复用标识，按照"用户+技术栈+代码地址+版本"进行复用 true - 复用 false - 不复用，每次均为新创建
    @NameInMap("reuse")
    public Boolean reuse;

    // 技术栈
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
