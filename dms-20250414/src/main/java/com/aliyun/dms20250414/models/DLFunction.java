// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLFunction extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <strong>example:</strong>
     * <p>com.example.hive.MyCustomUDF</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <strong>example:</strong>
     * <p>1731586286</p>
     */
    @NameInMap("CreateTime")
    public Integer createTime;

    /**
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("CreatorId")
    public Long creatorId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>my_funciton</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <strong>example:</strong>
     * <p>JAVA</p>
     */
    @NameInMap("FunctionType")
    public String functionType;

    /**
     * <strong>example:</strong>
     * <p>26****</p>
     */
    @NameInMap("ModifierId")
    public Long modifierId;

    /**
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("OwnerName")
    public String ownerName;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
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
