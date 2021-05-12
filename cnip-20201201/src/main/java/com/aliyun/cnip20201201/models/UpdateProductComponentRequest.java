// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductComponentRequest extends TeaModel {
    @NameInMap("componentOrchestrationValues")
    public String componentOrchestrationValues;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("releaseName")
    public String releaseName;

    public static UpdateProductComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentRequest self = new UpdateProductComponentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentRequest setComponentOrchestrationValues(String componentOrchestrationValues) {
        this.componentOrchestrationValues = componentOrchestrationValues;
        return this;
    }
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    public UpdateProductComponentRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateProductComponentRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
