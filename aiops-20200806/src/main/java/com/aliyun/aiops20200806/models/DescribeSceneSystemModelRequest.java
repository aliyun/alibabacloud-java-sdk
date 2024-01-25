// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneSystemModelRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelStatus")
    public Integer modelStatus;

    @NameInMap("ModelType")
    public Integer modelType;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TypeId")
    public Long typeId;

    public static DescribeSceneSystemModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneSystemModelRequest self = new DescribeSceneSystemModelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneSystemModelRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSceneSystemModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DescribeSceneSystemModelRequest setModelStatus(Integer modelStatus) {
        this.modelStatus = modelStatus;
        return this;
    }
    public Integer getModelStatus() {
        return this.modelStatus;
    }

    public DescribeSceneSystemModelRequest setModelType(Integer modelType) {
        this.modelType = modelType;
        return this;
    }
    public Integer getModelType() {
        return this.modelType;
    }

    public DescribeSceneSystemModelRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeSceneSystemModelRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSceneSystemModelRequest setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

}
