// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class InvokeFunctionRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("Env")
    public Integer env;

    @NameInMap("Parameters")
    public String parameters;

    public static InvokeFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeFunctionRequest self = new InvokeFunctionRequest();
        return TeaModel.build(map, self);
    }

    public InvokeFunctionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public InvokeFunctionRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public InvokeFunctionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public InvokeFunctionRequest setEnv(Integer env) {
        this.env = env;
        return this;
    }
    public Integer getEnv() {
        return this.env;
    }

    public InvokeFunctionRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
