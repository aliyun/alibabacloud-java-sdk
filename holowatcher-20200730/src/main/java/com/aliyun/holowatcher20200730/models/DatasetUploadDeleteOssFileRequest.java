// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadDeleteOssFileRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("UploadId")
    public Long uploadId;

    public static DatasetUploadDeleteOssFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadDeleteOssFileRequest self = new DatasetUploadDeleteOssFileRequest();
        return TeaModel.build(map, self);
    }

    public DatasetUploadDeleteOssFileRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetUploadDeleteOssFileRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public DatasetUploadDeleteOssFileRequest setUploadId(Long uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public Long getUploadId() {
        return this.uploadId;
    }

}
