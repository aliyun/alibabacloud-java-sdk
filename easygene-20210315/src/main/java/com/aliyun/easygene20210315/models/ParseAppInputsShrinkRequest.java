// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ParseAppInputsShrinkRequest extends TeaModel {
    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 文件路径
    @NameInMap("Path")
    public String path;

    // 应用定义
    @NameInMap("Definition")
    public String definition;

    // 依赖应用
    @NameInMap("Dependencies")
    public String dependenciesShrink;

    public static ParseAppInputsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseAppInputsShrinkRequest self = new ParseAppInputsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ParseAppInputsShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ParseAppInputsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ParseAppInputsShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ParseAppInputsShrinkRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public ParseAppInputsShrinkRequest setDependenciesShrink(String dependenciesShrink) {
        this.dependenciesShrink = dependenciesShrink;
        return this;
    }
    public String getDependenciesShrink() {
        return this.dependenciesShrink;
    }

}
