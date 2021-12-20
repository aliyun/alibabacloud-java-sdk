// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateFoundationComponentReferenceRequest extends TeaModel {
    @NameInMap("componentOrchestrationValues")
    public String componentOrchestrationValues;

    @NameInMap("enable")
    public Boolean enable;

    public static UpdateFoundationComponentReferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFoundationComponentReferenceRequest self = new UpdateFoundationComponentReferenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFoundationComponentReferenceRequest setComponentOrchestrationValues(String componentOrchestrationValues) {
        this.componentOrchestrationValues = componentOrchestrationValues;
        return this;
    }
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    public UpdateFoundationComponentReferenceRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
