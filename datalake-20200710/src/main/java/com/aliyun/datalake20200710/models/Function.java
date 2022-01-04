// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Function extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // ClassName
    @NameInMap("ClassName")
    public String className;

    // CreateTime
    @NameInMap("CreateTime")
    public Integer createTime;

    // CreatedBy
    @NameInMap("CreatedBy")
    public String createdBy;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // FunctionName
    @NameInMap("FunctionName")
    public String functionName;

    // FunctionType
    @NameInMap("FunctionType")
    public String functionType;

    // OwnerName
    @NameInMap("OwnerName")
    public String ownerName;

    // OwnerType
    @NameInMap("OwnerType")
    public String ownerType;

    // ResourceUri
    @NameInMap("ResourceUri")
    public java.util.List<ResourceUri> resourceUri;

    // UpdateTime
    @NameInMap("UpdateTime")
    public Integer updateTime;

    public static Function build(java.util.Map<String, ?> map) throws Exception {
        Function self = new Function();
        return TeaModel.build(map, self);
    }

    public Function setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public Function setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public Function setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public Function setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Function setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public Function setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public Function setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public Function setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public Function setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public Function setResourceUri(java.util.List<ResourceUri> resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }
    public java.util.List<ResourceUri> getResourceUri() {
        return this.resourceUri;
    }

    public Function setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Integer getUpdateTime() {
        return this.updateTime;
    }

}
