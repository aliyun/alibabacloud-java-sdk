// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByDatasetIdRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public String datasetId;

    public static DatasetUploadFindByDatasetIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByDatasetIdRequest self = new DatasetUploadFindByDatasetIdRequest();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByDatasetIdRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetUploadFindByDatasetIdRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
