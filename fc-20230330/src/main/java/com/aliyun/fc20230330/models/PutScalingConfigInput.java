// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutScalingConfigInput extends TeaModel {
    @NameInMap("residentConfig")
    public ResidentConfig residentConfig;

    @NameInMap("resourceType")
    public String resourceType;

    public static PutScalingConfigInput build(java.util.Map<String, ?> map) throws Exception {
        PutScalingConfigInput self = new PutScalingConfigInput();
        return TeaModel.build(map, self);
    }

    public PutScalingConfigInput setResidentConfig(ResidentConfig residentConfig) {
        this.residentConfig = residentConfig;
        return this;
    }
    public ResidentConfig getResidentConfig() {
        return this.residentConfig;
    }

    public PutScalingConfigInput setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
