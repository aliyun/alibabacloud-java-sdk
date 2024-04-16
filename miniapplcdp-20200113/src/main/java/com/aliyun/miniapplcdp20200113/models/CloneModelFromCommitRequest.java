// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CloneModelFromCommitRequest extends TeaModel {
    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceCommitId")
    public String sourceCommitId;

    @NameInMap("SourceModuleId")
    public String sourceModuleId;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("TargetModuleId")
    public String targetModuleId;

    @NameInMap("TargetName")
    public String targetName;

    @NameInMap("TargetSubType")
    public String targetSubType;

    public static CloneModelFromCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneModelFromCommitRequest self = new CloneModelFromCommitRequest();
        return TeaModel.build(map, self);
    }

    public CloneModelFromCommitRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CloneModelFromCommitRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CloneModelFromCommitRequest setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
        return this;
    }
    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    public CloneModelFromCommitRequest setSourceModuleId(String sourceModuleId) {
        this.sourceModuleId = sourceModuleId;
        return this;
    }
    public String getSourceModuleId() {
        return this.sourceModuleId;
    }

    public CloneModelFromCommitRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public CloneModelFromCommitRequest setTargetModuleId(String targetModuleId) {
        this.targetModuleId = targetModuleId;
        return this;
    }
    public String getTargetModuleId() {
        return this.targetModuleId;
    }

    public CloneModelFromCommitRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public CloneModelFromCommitRequest setTargetSubType(String targetSubType) {
        this.targetSubType = targetSubType;
        return this;
    }
    public String getTargetSubType() {
        return this.targetSubType;
    }

}
