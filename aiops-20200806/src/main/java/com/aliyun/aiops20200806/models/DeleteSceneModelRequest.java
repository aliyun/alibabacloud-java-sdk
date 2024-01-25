// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteSceneModelRequest extends TeaModel {
    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SureDelete")
    public Boolean sureDelete;

    public static DeleteSceneModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneModelRequest self = new DeleteSceneModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSceneModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public DeleteSceneModelRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DeleteSceneModelRequest setSureDelete(Boolean sureDelete) {
        this.sureDelete = sureDelete;
        return this;
    }
    public Boolean getSureDelete() {
        return this.sureDelete;
    }

}
