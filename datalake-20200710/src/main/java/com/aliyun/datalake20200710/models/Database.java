// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Database extends TeaModel {
    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>oss://examplebuket/exampledb</p>
     */
    @NameInMap("LocationUri")
    public String locationUri;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("Privileges")
    public PrincipalPrivilegeSet privileges;

    @NameInMap("UpdateTime")
    public Integer updateTime;

    public static Database build(java.util.Map<String, ?> map) throws Exception {
        Database self = new Database();
        return TeaModel.build(map, self);
    }

    public Database setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public Database setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Database setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Database setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public Database setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Database setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public Database setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public Database setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public Database setPrivileges(PrincipalPrivilegeSet privileges) {
        this.privileges = privileges;
        return this;
    }
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    public Database setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Integer getUpdateTime() {
        return this.updateTime;
    }

}
