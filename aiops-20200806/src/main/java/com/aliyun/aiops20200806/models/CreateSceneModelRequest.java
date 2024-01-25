// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateSceneModelRequest extends TeaModel {
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

    public static CreateSceneModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneModelRequest self = new CreateSceneModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneModelRequest setFcFunctionName(String fcFunctionName) {
        this.fcFunctionName = fcFunctionName;
        return this;
    }
    public String getFcFunctionName() {
        return this.fcFunctionName;
    }

    public CreateSceneModelRequest setFcHandler(String fcHandler) {
        this.fcHandler = fcHandler;
        return this;
    }
    public String getFcHandler() {
        return this.fcHandler;
    }

    public CreateSceneModelRequest setFcInitializer(String fcInitializer) {
        this.fcInitializer = fcInitializer;
        return this;
    }
    public String getFcInitializer() {
        return this.fcInitializer;
    }

    public CreateSceneModelRequest setFcRegionNo(String fcRegionNo) {
        this.fcRegionNo = fcRegionNo;
        return this;
    }
    public String getFcRegionNo() {
        return this.fcRegionNo;
    }

    public CreateSceneModelRequest setFcServiceName(String fcServiceName) {
        this.fcServiceName = fcServiceName;
        return this;
    }
    public String getFcServiceName() {
        return this.fcServiceName;
    }

    public CreateSceneModelRequest setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
        return this;
    }
    public String getModelDesc() {
        return this.modelDesc;
    }

    public CreateSceneModelRequest setModelLanguage(Integer modelLanguage) {
        this.modelLanguage = modelLanguage;
        return this;
    }
    public Integer getModelLanguage() {
        return this.modelLanguage;
    }

    public CreateSceneModelRequest setModelMemo(String modelMemo) {
        this.modelMemo = modelMemo;
        return this;
    }
    public String getModelMemo() {
        return this.modelMemo;
    }

    public CreateSceneModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateSceneModelRequest setModelType(Integer modelType) {
        this.modelType = modelType;
        return this;
    }
    public Integer getModelType() {
        return this.modelType;
    }

    public CreateSceneModelRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public CreateSceneModelRequest setRootCauseDesc(String rootCauseDesc) {
        this.rootCauseDesc = rootCauseDesc;
        return this;
    }
    public String getRootCauseDesc() {
        return this.rootCauseDesc;
    }

    public CreateSceneModelRequest setRootCauseSolution(String rootCauseSolution) {
        this.rootCauseSolution = rootCauseSolution;
        return this;
    }
    public String getRootCauseSolution() {
        return this.rootCauseSolution;
    }

}
