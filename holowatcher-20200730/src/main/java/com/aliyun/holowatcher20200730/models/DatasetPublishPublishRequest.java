// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetPublishPublishRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("OverwriteLatest")
    public Boolean overwriteLatest;

    @NameInMap("ProjectId")
    public Long projectId;

    public static DatasetPublishPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetPublishPublishRequest self = new DatasetPublishPublishRequest();
        return TeaModel.build(map, self);
    }

    public DatasetPublishPublishRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetPublishPublishRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public DatasetPublishPublishRequest setOverwriteLatest(Boolean overwriteLatest) {
        this.overwriteLatest = overwriteLatest;
        return this;
    }
    public Boolean getOverwriteLatest() {
        return this.overwriteLatest;
    }

    public DatasetPublishPublishRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
