// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByProjectIdAppRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TypeId")
    public Long typeId;

    public static DatasetUploadFindByProjectIdAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByProjectIdAppRequest self = new DatasetUploadFindByProjectIdAppRequest();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByProjectIdAppRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetUploadFindByProjectIdAppRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DatasetUploadFindByProjectIdAppRequest setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

}
