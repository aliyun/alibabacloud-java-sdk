// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PCUploadPublishRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static PCUploadPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        PCUploadPublishRequest self = new PCUploadPublishRequest();
        return TeaModel.build(map, self);
    }

    public PCUploadPublishRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public PCUploadPublishRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public PCUploadPublishRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
