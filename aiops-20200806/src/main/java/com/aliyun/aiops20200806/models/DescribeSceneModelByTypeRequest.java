// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneModelByTypeRequest extends TeaModel {
    @NameInMap("ModelType")
    public Integer modelType;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeSceneModelByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneModelByTypeRequest self = new DescribeSceneModelByTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneModelByTypeRequest setModelType(Integer modelType) {
        this.modelType = modelType;
        return this;
    }
    public Integer getModelType() {
        return this.modelType;
    }

    public DescribeSceneModelByTypeRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
