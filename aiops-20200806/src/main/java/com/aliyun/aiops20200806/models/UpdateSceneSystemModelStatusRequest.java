// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneSystemModelStatusRequest extends TeaModel {
    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ModelStatus")
    public Integer modelStatus;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateSceneSystemModelStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneSystemModelStatusRequest self = new UpdateSceneSystemModelStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneSystemModelStatusRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public UpdateSceneSystemModelStatusRequest setModelStatus(Integer modelStatus) {
        this.modelStatus = modelStatus;
        return this;
    }
    public Integer getModelStatus() {
        return this.modelStatus;
    }

    public UpdateSceneSystemModelStatusRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
