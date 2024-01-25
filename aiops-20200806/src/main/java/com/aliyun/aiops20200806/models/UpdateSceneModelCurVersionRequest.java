// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneModelCurVersionRequest extends TeaModel {
    @NameInMap("ExtId")
    public Long extId;

    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateSceneModelCurVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneModelCurVersionRequest self = new UpdateSceneModelCurVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneModelCurVersionRequest setExtId(Long extId) {
        this.extId = extId;
        return this;
    }
    public Long getExtId() {
        return this.extId;
    }

    public UpdateSceneModelCurVersionRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public UpdateSceneModelCurVersionRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
