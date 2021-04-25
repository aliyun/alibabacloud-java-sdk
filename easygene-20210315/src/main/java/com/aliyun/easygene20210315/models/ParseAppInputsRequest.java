// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ParseAppInputsRequest extends TeaModel {
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
    public java.util.List<ParseAppInputsRequestDependencies> dependencies;

    public static ParseAppInputsRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseAppInputsRequest self = new ParseAppInputsRequest();
        return TeaModel.build(map, self);
    }

    public ParseAppInputsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ParseAppInputsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ParseAppInputsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ParseAppInputsRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public ParseAppInputsRequest setDependencies(java.util.List<ParseAppInputsRequestDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<ParseAppInputsRequestDependencies> getDependencies() {
        return this.dependencies;
    }

    public static class ParseAppInputsRequestDependencies extends TeaModel {
        // 依赖路径
        @NameInMap("Path")
        public String path;

        // 依赖内容
        @NameInMap("Content")
        public String content;

        public static ParseAppInputsRequestDependencies build(java.util.Map<String, ?> map) throws Exception {
            ParseAppInputsRequestDependencies self = new ParseAppInputsRequestDependencies();
            return TeaModel.build(map, self);
        }

        public ParseAppInputsRequestDependencies setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ParseAppInputsRequestDependencies setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
