// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindAllRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("MaterialType")
    public String materialType;

    @NameInMap("Page")
    public Long page;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Source")
    public String source;

    public static MaterialFindAllRequest build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindAllRequest self = new MaterialFindAllRequest();
        return TeaModel.build(map, self);
    }

    public MaterialFindAllRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public MaterialFindAllRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public MaterialFindAllRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public MaterialFindAllRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public MaterialFindAllRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public MaterialFindAllRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public MaterialFindAllRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public MaterialFindAllRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public MaterialFindAllRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
