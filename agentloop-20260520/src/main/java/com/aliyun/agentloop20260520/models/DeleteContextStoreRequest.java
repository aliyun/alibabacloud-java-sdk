// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteContextStoreRequest extends TeaModel {
    /**
     * <p>Specifies whether to simultaneously delete the memory output dataset (memory type). Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deleteOutputDataset")
    public Boolean deleteOutputDataset;

    public static DeleteContextStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextStoreRequest self = new DeleteContextStoreRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContextStoreRequest setDeleteOutputDataset(Boolean deleteOutputDataset) {
        this.deleteOutputDataset = deleteOutputDataset;
        return this;
    }
    public Boolean getDeleteOutputDataset() {
        return this.deleteOutputDataset;
    }

}
