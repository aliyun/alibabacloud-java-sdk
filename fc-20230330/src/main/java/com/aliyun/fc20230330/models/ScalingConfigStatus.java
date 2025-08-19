// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScalingConfigStatus extends TeaModel {
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("residentConfig")
    public ResidentConfig residentConfig;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("scalingStatus")
    public ScalingStatus scalingStatus;

    public static ScalingConfigStatus build(java.util.Map<String, ?> map) throws Exception {
        ScalingConfigStatus self = new ScalingConfigStatus();
        return TeaModel.build(map, self);
    }

    public ScalingConfigStatus setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ScalingConfigStatus setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ScalingConfigStatus setResidentConfig(ResidentConfig residentConfig) {
        this.residentConfig = residentConfig;
        return this;
    }
    public ResidentConfig getResidentConfig() {
        return this.residentConfig;
    }

    public ScalingConfigStatus setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ScalingConfigStatus setScalingStatus(ScalingStatus scalingStatus) {
        this.scalingStatus = scalingStatus;
        return this;
    }
    public ScalingStatus getScalingStatus() {
        return this.scalingStatus;
    }

}
