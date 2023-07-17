// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateUdfFileRequest extends TeaModel {
    /**
     * <p>The name of the class in which the function is defined. This parameter corresponds to the Class Name parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <p>The syntax used for calling the function. This parameter corresponds to the Expression Syntax parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("CmdDescription")
    public String cmdDescription;

    @NameInMap("CreateFolderIfNotExists")
    public Boolean createFolderIfNotExists;

    /**
     * <p>The example for calling the function. This parameter corresponds to the Example parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("Example")
    public String example;

    /**
     * <p>The path of the folder in which the file for the function is stored.</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The name of the file for the function.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The type of the function. Valid values: MATH, AGGREGATE, STRING, DATE, ANALYTIC, and OTHER. This parameter corresponds to the Function Type parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("FunctionType")
    public String functionType;

    /**
     * <p>The description of the input parameters of the function. This parameter corresponds to the Parameter Description parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("ParameterDescription")
    public String parameterDescription;

    /**
     * <p>The ID of the DataWorks workspace. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace Management page and view the workspace ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace. You can click the identifier in the upper-left corner of the DataStudio page to switch to another workspace.</p>
     * <br>
     * <p>You must specify either this parameter or the projectId parameter to determine the DataWorks workspace to which the operation is called.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The names of the resources that are referenced by the function. This parameter corresponds to the Resources parameter in the Register Function section of the configuration tab of the function in the DataWorks console. Multiple resource names are separated by commas (,).</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The description of the return value of the function. This parameter corresponds to the Return Value parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("ReturnValue")
    public String returnValue;

    /**
     * <p>The description of the function. This parameter corresponds to the Description parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
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

    public CreateUdfFileRequest setCreateFolderIfNotExists(Boolean createFolderIfNotExists) {
        this.createFolderIfNotExists = createFolderIfNotExists;
        return this;
    }
    public Boolean getCreateFolderIfNotExists() {
        return this.createFolderIfNotExists;
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
