// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutScalingConfigOutput extends TeaModel {
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("residentConfig")
    public ResidentConfig residentConfig;

    @NameInMap("resourceType")
    public String resourceType;

    public static PutScalingConfigOutput build(java.util.Map<String, ?> map) throws Exception {
        PutScalingConfigOutput self = new PutScalingConfigOutput();
        return TeaModel.build(map, self);
    }

    public PutScalingConfigOutput setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public PutScalingConfigOutput setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public PutScalingConfigOutput setResidentConfig(ResidentConfig residentConfig) {
        this.residentConfig = residentConfig;
        return this;
    }
    public ResidentConfig getResidentConfig() {
        return this.residentConfig;
    }

    public PutScalingConfigOutput setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
