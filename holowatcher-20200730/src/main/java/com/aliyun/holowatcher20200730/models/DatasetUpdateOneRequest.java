// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUpdateOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TypeId")
    public Long typeId;

    public static DatasetUpdateOneRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetUpdateOneRequest self = new DatasetUpdateOneRequest();
        return TeaModel.build(map, self);
    }

    public DatasetUpdateOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetUpdateOneRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DatasetUpdateOneRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public DatasetUpdateOneRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetUpdateOneRequest setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

}
