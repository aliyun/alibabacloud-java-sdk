// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneModelsRequest extends TeaModel {
    @NameInMap("ApplyStatus")
    public Integer applyStatus;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelType")
    public Integer modelType;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSceneModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneModelsRequest self = new DescribeSceneModelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneModelsRequest setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public Integer getApplyStatus() {
        return this.applyStatus;
    }

    public DescribeSceneModelsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSceneModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DescribeSceneModelsRequest setModelType(Integer modelType) {
        this.modelType = modelType;
        return this;
    }
    public Integer getModelType() {
        return this.modelType;
    }

    public DescribeSceneModelsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeSceneModelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
