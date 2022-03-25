// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetFindAllRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("NoProject")
    public Boolean noProject;

    @NameInMap("NotProjectId")
    public Long notProjectId;

    @NameInMap("Note")
    public String note;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Status")
    public String status;

    @NameInMap("TypeId")
    public Long typeId;

    public static DatasetFindAllRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetFindAllRequest self = new DatasetFindAllRequest();
        return TeaModel.build(map, self);
    }

    public DatasetFindAllRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetFindAllRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DatasetFindAllRequest setNoProject(Boolean noProject) {
        this.noProject = noProject;
        return this;
    }
    public Boolean getNoProject() {
        return this.noProject;
    }

    public DatasetFindAllRequest setNotProjectId(Long notProjectId) {
        this.notProjectId = notProjectId;
        return this;
    }
    public Long getNotProjectId() {
        return this.notProjectId;
    }

    public DatasetFindAllRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public DatasetFindAllRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DatasetFindAllRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DatasetFindAllRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DatasetFindAllRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetFindAllRequest setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

}
