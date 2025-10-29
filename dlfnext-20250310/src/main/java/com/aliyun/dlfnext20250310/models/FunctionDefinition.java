// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FunctionDefinition extends TeaModel {
    /**
     * <p>required in FileFunctionDefinition</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>required in SQLFunctionDefinition/LambdaFunctionDefinition</p>
     */
    @NameInMap("definition")
    public String definition;

    /**
     * <p>required in FileFunctionDefinition</p>
     */
    @NameInMap("fileResources")
    public java.util.List<FunctionFileResource> fileResources;

    /**
     * <p>required in FileFunctionDefinition</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>required in LambdaFunctionDefinition/FileFunctionDefinition</p>
     */
    @NameInMap("language")
    public String language;

    @NameInMap("type")
    public String type;

    public static FunctionDefinition build(java.util.Map<String, ?> map) throws Exception {
        FunctionDefinition self = new FunctionDefinition();
        return TeaModel.build(map, self);
    }

    public FunctionDefinition setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public FunctionDefinition setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public FunctionDefinition setFileResources(java.util.List<FunctionFileResource> fileResources) {
        this.fileResources = fileResources;
        return this;
    }
    public java.util.List<FunctionFileResource> getFileResources() {
        return this.fileResources;
    }

    public FunctionDefinition setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public FunctionDefinition setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public FunctionDefinition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
