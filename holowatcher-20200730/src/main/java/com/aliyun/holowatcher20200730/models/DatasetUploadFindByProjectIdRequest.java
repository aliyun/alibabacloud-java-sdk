// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByProjectIdRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("TypeId")
    public Long typeId;

    public static DatasetUploadFindByProjectIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByProjectIdRequest self = new DatasetUploadFindByProjectIdRequest();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByProjectIdRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetUploadFindByProjectIdRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DatasetUploadFindByProjectIdRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DatasetUploadFindByProjectIdRequest setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

}
