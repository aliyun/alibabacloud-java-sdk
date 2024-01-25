// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneModelRequest extends TeaModel {
    @NameInMap("FcFunctionName")
    public String fcFunctionName;

    @NameInMap("FcHandler")
    public String fcHandler;

    @NameInMap("FcInitializer")
    public String fcInitializer;

    @NameInMap("FcRegionNo")
    public String fcRegionNo;

    @NameInMap("FcServiceName")
    public String fcServiceName;

    @NameInMap("ModelDesc")
    public String modelDesc;

    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ModelLanguage")
    public Integer modelLanguage;

    @NameInMap("ModelMemo")
    public String modelMemo;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelType")
    public Integer modelType;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("RootCauseDesc")
    public String rootCauseDesc;

    @NameInMap("RootCauseSolution")
    public String rootCauseSolution;

    public static UpdateSceneModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneModelRequest self = new UpdateSceneModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneModelRequest setFcFunctionName(String fcFunctionName) {
        this.fcFunctionName = fcFunctionName;
        return this;
    }
    public String getFcFunctionName() {
        return this.fcFunctionName;
    }

    public UpdateSceneModelRequest setFcHandler(String fcHandler) {
        this.fcHandler = fcHandler;
        return this;
    }
    public String getFcHandler() {
        return this.fcHandler;
    }

    public UpdateSceneModelRequest setFcInitializer(String fcInitializer) {
        this.fcInitializer = fcInitializer;
        return this;
    }
    public String getFcInitializer() {
        return this.fcInitializer;
    }

    public UpdateSceneModelRequest setFcRegionNo(String fcRegionNo) {
        this.fcRegionNo = fcRegionNo;
        return this;
    }
    public String getFcRegionNo() {
        return this.fcRegionNo;
    }

    public UpdateSceneModelRequest setFcServiceName(String fcServiceName) {
        this.fcServiceName = fcServiceName;
        return this;
    }
    public String getFcServiceName() {
        return this.fcServiceName;
    }

    public UpdateSceneModelRequest setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
        return this;
    }
    public String getModelDesc() {
        return this.modelDesc;
    }

    public UpdateSceneModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public UpdateSceneModelRequest setModelLanguage(Integer modelLanguage) {
        this.modelLanguage = modelLanguage;
        return this;
    }
    public Integer getModelLanguage() {
        return this.modelLanguage;
    }

    public UpdateSceneModelRequest setModelMemo(String modelMemo) {
        this.modelMemo = modelMemo;
        return this;
    }
    public String getModelMemo() {
        return this.modelMemo;
    }

    public UpdateSceneModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateSceneModelRequest setModelType(Integer modelType) {
        this.modelType = modelType;
        return this;
    }
    public Integer getModelType() {
        return this.modelType;
    }

    public UpdateSceneModelRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateSceneModelRequest setRootCauseDesc(String rootCauseDesc) {
        this.rootCauseDesc = rootCauseDesc;
        return this;
    }
    public String getRootCauseDesc() {
        return this.rootCauseDesc;
    }

    public UpdateSceneModelRequest setRootCauseSolution(String rootCauseSolution) {
        this.rootCauseSolution = rootCauseSolution;
        return this;
    }
    public String getRootCauseSolution() {
        return this.rootCauseSolution;
    }

}
