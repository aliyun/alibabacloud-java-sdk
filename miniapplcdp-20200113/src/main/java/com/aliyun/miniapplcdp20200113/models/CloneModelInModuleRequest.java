// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CloneModelInModuleRequest extends TeaModel {
    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Source")
    public String source;

    @NameInMap("TargetName")
    public String targetName;

    @NameInMap("TargetSubType")
    public String targetSubType;

    public static CloneModelInModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneModelInModuleRequest self = new CloneModelInModuleRequest();
        return TeaModel.build(map, self);
    }

    public CloneModelInModuleRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CloneModelInModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CloneModelInModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CloneModelInModuleRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public CloneModelInModuleRequest setTargetSubType(String targetSubType) {
        this.targetSubType = targetSubType;
        return this;
    }
    public String getTargetSubType() {
        return this.targetSubType;
    }

}
