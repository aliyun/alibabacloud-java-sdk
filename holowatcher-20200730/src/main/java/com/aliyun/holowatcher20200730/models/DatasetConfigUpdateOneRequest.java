// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigUpdateOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Data")
    public String data;

    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("Key")
    public String key;

    @NameInMap("Type")
    public String type;

    public static DatasetConfigUpdateOneRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigUpdateOneRequest self = new DatasetConfigUpdateOneRequest();
        return TeaModel.build(map, self);
    }

    public DatasetConfigUpdateOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetConfigUpdateOneRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DatasetConfigUpdateOneRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DatasetConfigUpdateOneRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DatasetConfigUpdateOneRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
