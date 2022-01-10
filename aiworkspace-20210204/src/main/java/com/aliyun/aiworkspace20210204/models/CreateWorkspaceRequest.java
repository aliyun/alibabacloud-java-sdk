// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    // 描述，最多80个字符
    @NameInMap("Description")
    public String description;

    // 显示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 环境列表
    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    // 名字 3-23 个字符, 需要字母开头，只能包含字母下划线和数字，region内唯一
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateWorkspaceRequest setEnvTypes(java.util.List<String> envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    public CreateWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
