// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetDeteleOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public Long datasetId;

    public static DatasetDeteleOneRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetDeteleOneRequest self = new DatasetDeteleOneRequest();
        return TeaModel.build(map, self);
    }

    public DatasetDeteleOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetDeteleOneRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

}
