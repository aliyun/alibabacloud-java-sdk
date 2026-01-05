// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDatasetVersionRequest extends TeaModel {
    /**
     * <p>The dataset version ID. Only DataWorks datasets are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-datasetVersion:3pXXXb8o0ngr07njhps1
     * :2</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteDatasetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetVersionRequest self = new DeleteDatasetVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetVersionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
