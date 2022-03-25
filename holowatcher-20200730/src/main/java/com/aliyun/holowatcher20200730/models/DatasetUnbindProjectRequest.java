// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUnbindProjectRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    public static DatasetUnbindProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetUnbindProjectRequest self = new DatasetUnbindProjectRequest();
        return TeaModel.build(map, self);
    }

    public DatasetUnbindProjectRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

}
