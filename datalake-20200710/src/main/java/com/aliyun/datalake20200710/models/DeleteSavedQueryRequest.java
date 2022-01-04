// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteSavedQueryRequest extends TeaModel {
    @NameInMap("SavedQueryId")
    public String savedQueryId;

    public static DeleteSavedQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSavedQueryRequest self = new DeleteSavedQueryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSavedQueryRequest setSavedQueryId(String savedQueryId) {
        this.savedQueryId = savedQueryId;
        return this;
    }
    public String getSavedQueryId() {
        return this.savedQueryId;
    }

}
