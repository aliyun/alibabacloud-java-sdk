// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneModelDetailRequest extends TeaModel {
    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeSceneModelDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneModelDetailRequest self = new DescribeSceneModelDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneModelDetailRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public DescribeSceneModelDetailRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
