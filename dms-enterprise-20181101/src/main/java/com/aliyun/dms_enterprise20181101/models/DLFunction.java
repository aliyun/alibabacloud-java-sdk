// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLFunction extends TeaModel {
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("ClassName")
    public String className;

    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("FunctionType")
    public String functionType;

    @NameInMap("ModifierId")
    public Long modifierId;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("ResourceUris")
    public java.util.List<DLResourceUri> resourceUris;

    public static DLFunction build(java.util.Map<String, ?> map) throws Exception {
        DLFunction self = new DLFunction();
        return TeaModel.build(map, self);
    }

    public DLFunction setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public DLFunction setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public DLFunction setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DLFunction setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public DLFunction setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DLFunction setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public DLFunction setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public DLFunction setModifierId(Long modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public Long getModifierId() {
        return this.modifierId;
    }

    public DLFunction setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public DLFunction setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DLFunction setResourceUris(java.util.List<DLResourceUri> resourceUris) {
        this.resourceUris = resourceUris;
        return this;
    }
    public java.util.List<DLResourceUri> getResourceUris() {
        return this.resourceUris;
    }

}
