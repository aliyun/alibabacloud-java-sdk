// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class FunctionInput extends TeaModel {
    // ClassName
    @NameInMap("ClassName")
    public String className;

    // FunctionName
    @NameInMap("FunctionName")
    public String functionName;

    // FunctionType
    @NameInMap("FunctionType")
    public String functionType;

    // OwnerName
    @NameInMap("OwnerName")
    public String ownerName;

    // OwnerType
    @NameInMap("OwnerType")
    public String ownerType;

    // ResourceUri
    @NameInMap("ResourceUri")
    public java.util.List<ResourceUri> resourceUri;

    public static FunctionInput build(java.util.Map<String, ?> map) throws Exception {
        FunctionInput self = new FunctionInput();
        return TeaModel.build(map, self);
    }

    public FunctionInput setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public FunctionInput setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public FunctionInput setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public FunctionInput setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public FunctionInput setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public FunctionInput setResourceUri(java.util.List<ResourceUri> resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }
    public java.util.List<ResourceUri> getResourceUri() {
        return this.resourceUri;
    }

}
