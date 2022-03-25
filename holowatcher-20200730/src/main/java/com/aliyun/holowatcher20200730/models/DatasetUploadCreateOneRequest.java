// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadCreateOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("DeviceKey")
    public String deviceKey;

    public static DatasetUploadCreateOneRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadCreateOneRequest self = new DatasetUploadCreateOneRequest();
        return TeaModel.build(map, self);
    }

    public DatasetUploadCreateOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetUploadCreateOneRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public DatasetUploadCreateOneRequest setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }
    public String getDeviceKey() {
        return this.deviceKey;
    }

}
