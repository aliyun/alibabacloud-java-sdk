// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RunPipelineConfig extends TeaModel {
    @NameInMap("pipelineSpec")
    public PipelineSpec pipelineSpec;

    @NameInMap("variables")
    public java.util.List<Variable> variables;

    @NameInMap("yamlFileContent")
    public String yamlFileContent;

    @NameInMap("yamlFilePath")
    public String yamlFilePath;

    public static RunPipelineConfig build(java.util.Map<String, ?> map) throws Exception {
        RunPipelineConfig self = new RunPipelineConfig();
        return TeaModel.build(map, self);
    }

    public RunPipelineConfig setPipelineSpec(PipelineSpec pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
        return this;
    }
    public PipelineSpec getPipelineSpec() {
        return this.pipelineSpec;
    }

    public RunPipelineConfig setVariables(java.util.List<Variable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<Variable> getVariables() {
        return this.variables;
    }

    public RunPipelineConfig setYamlFileContent(String yamlFileContent) {
        this.yamlFileContent = yamlFileContent;
        return this;
    }
    public String getYamlFileContent() {
        return this.yamlFileContent;
    }

    public RunPipelineConfig setYamlFilePath(String yamlFilePath) {
        this.yamlFilePath = yamlFilePath;
        return this;
    }
    public String getYamlFilePath() {
        return this.yamlFilePath;
    }

}
