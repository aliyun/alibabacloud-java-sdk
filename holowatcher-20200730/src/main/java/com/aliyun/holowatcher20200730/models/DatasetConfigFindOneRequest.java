// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigFindOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Key")
    public String key;

    @NameInMap("Type")
    public String type;

    public static DatasetConfigFindOneRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigFindOneRequest self = new DatasetConfigFindOneRequest();
        return TeaModel.build(map, self);
    }

    public DatasetConfigFindOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetConfigFindOneRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public DatasetConfigFindOneRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DatasetConfigFindOneRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
