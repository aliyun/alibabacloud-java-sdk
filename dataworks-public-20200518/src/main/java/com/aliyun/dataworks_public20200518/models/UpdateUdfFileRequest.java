// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateUdfFileRequest extends TeaModel {
    /**
     * <p>The name of the class in which the function is defined. This parameter corresponds to the Class Name parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <p>The syntax used for calling the function. This parameter corresponds to the Expression Syntax parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("CmdDescription")
    public String cmdDescription;

    /**
     * <p>The example for calling the function. This parameter corresponds to the Example parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     */
    @NameInMap("Example")
    public String example;

    /**
     * <p>The path of the folder in which the function file is stored.</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The ID of the file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The type of the function. Valid values: MATH, AGGREGATE, STRING, DATE, ANALYTIC, and OTHER. This parameter corresponds to the Function Type parameter in the Register Function section of the configuration tab of the function in the DataWorks console.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The names of the resources that are referenced by the function. This parameter corresponds to the Resources parameter in the Register Function section of the configuration tab of the function in the DataWorks console. Separate multiple resource names with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
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

    public static UpdateUdfFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfFileRequest self = new UpdateUdfFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUdfFileRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public UpdateUdfFileRequest setCmdDescription(String cmdDescription) {
        this.cmdDescription = cmdDescription;
        return this;
    }
    public String getCmdDescription() {
        return this.cmdDescription;
    }

    public UpdateUdfFileRequest setExample(String example) {
        this.example = example;
        return this;
    }
    public String getExample() {
        return this.example;
    }

    public UpdateUdfFileRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public UpdateUdfFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UpdateUdfFileRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public UpdateUdfFileRequest setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
        return this;
    }
    public String getParameterDescription() {
        return this.parameterDescription;
    }

    public UpdateUdfFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateUdfFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public UpdateUdfFileRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public UpdateUdfFileRequest setReturnValue(String returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public String getReturnValue() {
        return this.returnValue;
    }

    public UpdateUdfFileRequest setUdfDescription(String udfDescription) {
        this.udfDescription = udfDescription;
        return this;
    }
    public String getUdfDescription() {
        return this.udfDescription;
    }

}
