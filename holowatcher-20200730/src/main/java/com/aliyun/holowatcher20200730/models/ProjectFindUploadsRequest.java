// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectFindUploadsRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("CreatedByCurrentUser")
    public Boolean createdByCurrentUser;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Live")
    public Boolean live;

    public static ProjectFindUploadsRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectFindUploadsRequest self = new ProjectFindUploadsRequest();
        return TeaModel.build(map, self);
    }

    public ProjectFindUploadsRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public ProjectFindUploadsRequest setCreatedByCurrentUser(Boolean createdByCurrentUser) {
        this.createdByCurrentUser = createdByCurrentUser;
        return this;
    }
    public Boolean getCreatedByCurrentUser() {
        return this.createdByCurrentUser;
    }

    public ProjectFindUploadsRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ProjectFindUploadsRequest setLive(Boolean live) {
        this.live = live;
        return this;
    }
    public Boolean getLive() {
        return this.live;
    }

}
