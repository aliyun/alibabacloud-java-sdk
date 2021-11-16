// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateUdfFileRequest extends TeaModel {
    @NameInMap("ClassName")
    public String className;

    @NameInMap("CmdDescription")
    public String cmdDescription;

    @NameInMap("Example")
    public String example;

    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FunctionType")
    public String functionType;

    @NameInMap("ParameterDescription")
    public String parameterDescription;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("ReturnValue")
    public String returnValue;

    @NameInMap("UdfDescription")
    public String udfDescription;

    public static CreateUdfFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfFileRequest self = new CreateUdfFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateUdfFileRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreateUdfFileRequest setCmdDescription(String cmdDescription) {
        this.cmdDescription = cmdDescription;
        return this;
    }
    public String getCmdDescription() {
        return this.cmdDescription;
    }

    public CreateUdfFileRequest setExample(String example) {
        this.example = example;
        return this;
    }
    public String getExample() {
        return this.example;
    }

    public CreateUdfFileRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public CreateUdfFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUdfFileRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public CreateUdfFileRequest setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
        return this;
    }
    public String getParameterDescription() {
        return this.parameterDescription;
    }

    public CreateUdfFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateUdfFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public CreateUdfFileRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public CreateUdfFileRequest setReturnValue(String returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public String getReturnValue() {
        return this.returnValue;
    }

    public CreateUdfFileRequest setUdfDescription(String udfDescription) {
        this.udfDescription = udfDescription;
        return this;
    }
    public String getUdfDescription() {
        return this.udfDescription;
    }

}
