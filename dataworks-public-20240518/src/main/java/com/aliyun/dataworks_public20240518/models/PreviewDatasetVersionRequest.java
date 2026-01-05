// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PreviewDatasetVersionRequest extends TeaModel {
    /**
     * <p>The dataset version ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-datasetVersion:3pXXXb8o0ngr07njhps1
     * :2</p>
     */
    @NameInMap("Id")
    public String id;

    public static PreviewDatasetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewDatasetVersionRequest self = new PreviewDatasetVersionRequest();
        return TeaModel.build(map, self);
    }

    public PreviewDatasetVersionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
