// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetDatasetRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    public static GetDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetRequest self = new GetDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
